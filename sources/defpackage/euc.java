package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.util.Log;
import android.util.Range;
import android.util.SparseArray;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.Pipe;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.client.methods.HttpPost;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class euc implements t65, an7, bn7, m1k, gsb, io6, pyc, CapturerObserver, JavaAudioDeviceModule.AudioRecordErrorCallback, dch, x76 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public euc(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new SparseArray();
                break;
            case 10:
                p51 p51Var = p51.e;
                this.b = new HashSet();
                this.c = p51Var;
                break;
            case 22:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = fok.c;
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    private final void H() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x018e  */
    /* JADX WARN: Code duplicated, block: B:47:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b7 -> B:27:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x018e -> B:46:0x0198). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(defpackage.euc r23, defpackage.yx6 r24, long r25, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, defpackage.l8b r32, defpackage.nq4 r33) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euc.g(euc, yx6, long, long, java.lang.String, java.lang.String, java.lang.String, l8b, nq4):java.lang.Object");
    }

    public static euc n(dne dneVar) {
        euc eucVar = new euc(14, false);
        eucVar.b = dneVar.a;
        eucVar.c = dneVar.b;
        eucVar.d = dneVar.c;
        return eucVar;
    }

    public void A(Selector selector) {
        ze9 ze9Var = (ze9) this.b;
        while (!selector.keys().isEmpty()) {
            try {
                int iSelect = selector.select();
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                if (iSelect != 0) {
                    Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        wdf wdfVar = (wdf) next.attachment();
                        if (next.isConnectable()) {
                            v(wdfVar);
                        } else if (next.isReadable()) {
                            F(wdfVar);
                        } else if (next.isWritable()) {
                            G(wdfVar);
                        }
                    }
                }
            } catch (InterruptedException e) {
                ze9Var.r("Poller", new gvc(24), new a8d(3, e));
                j();
            } catch (ClosedByInterruptException e2) {
                ze9Var.r("Poller", new gvc(24), new a8d(2, e2));
                j();
            } catch (Throwable th) {
                ze9Var.r("Poller", new gvc(25), new bpg(19, th));
                j();
                throw th;
            }
        }
        ze9Var.b("Poller", new gvc(23));
    }

    @Override // defpackage.m1k
    public Rect B() {
        Rect rect = (Rect) this.c;
        return rect == null ? (Rect) this.d : rect;
    }

    public synchronized void C(c31 c31Var) {
        try {
            c31 c31Var2 = c31Var.a;
            c31 c31Var3 = c31Var.d;
            if (c31Var2 != null) {
                c31Var2.d = c31Var3;
            }
            if (c31Var3 != null) {
                c31Var3.a = c31Var2;
            }
            c31Var.a = null;
            c31Var.d = null;
            if (c31Var == ((c31) this.c)) {
                this.c = c31Var3;
            }
            if (c31Var == ((c31) this.d)) {
                this.d = c31Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public bye D() {
        return new bye(new duc(this, new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", ((Context) this.c).getString(R.string.tt_contact_account_type)}, new l8b(), null));
    }

    @Override // defpackage.m1k
    public xf5 E(float f, kli kliVar) {
        Rect rect = (Rect) this.d;
        if (Math.abs(f) < ((double) Math.ulp(Math.abs(f))) * 2.0d) {
            if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
            }
            f = 1.0f;
        }
        float fWidth = rect.width() / f;
        float fHeight = rect.height() / f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        Rect rect2 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        this.c = rect2;
        return kliVar.l(Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, rect2), ili.b);
    }

    public void F(wdf wdfVar) {
        ((ze9) this.b).b("Poller", new zn3(18));
        wdfVar.l0();
        dki dkiVar = (dki) this.d;
        long jV = dkiVar.j.V();
        long j = dkiVar.h.a;
        if (j > 0) {
            dkiVar.e.g(jV, j);
        }
    }

    public void G(wdf wdfVar) {
        ((ze9) this.b).b("Poller", new zn3(16));
        wdfVar.G();
    }

    public void I(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void J(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.d = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, im5.a, new ij9(this));
        this.d = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void K(SelectableChannel selectableChannel) {
        ((ze9) this.b).b("Poller", new gvc(27));
        Selector selector = (Selector) this.c;
        if (selector == null) {
            ore.k("Required value was null.");
            return;
        }
        SelectionKey selectionKeyKeyFor = selectableChannel.keyFor(selector);
        if (selectionKeyKeyFor != null) {
            selectionKeyKeyFor.cancel();
        }
        selector.wakeup();
    }

    @Override // defpackage.gsb
    public void a(qp qpVar) {
        ((i18) this.d).f = qpVar;
    }

    @Override // defpackage.m1k
    public float b() {
        bg2 bg2Var = ((kg2) this.b).b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        Object objValueOf = Float.valueOf(1.0f);
        Object objC = ((qb2) bg2Var).c(key);
        if (objC != null) {
            objValueOf = objC;
        }
        Float f = (Float) objValueOf;
        float fFloatValue = f.floatValue();
        if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d) {
            return f.floatValue();
        }
        if (tvj.f(5, "CXCP")) {
            Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    @Override // defpackage.dch
    public e89 c(int i, int i2) {
        return new g88(1, new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // defpackage.dch
    public void d(cch cchVar) {
        try {
            ((Executor) this.c).execute(new ewg(this, 3, cchVar));
        } catch (RejectedExecutionException unused) {
            tvj.c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // defpackage.dch
    public void e(ich ichVar) {
        try {
            ((Executor) this.c).execute(new ewg(this, 2, ichVar));
        } catch (RejectedExecutionException unused) {
            tvj.c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object f(CallingAppIds callingAppIds, nq4 nq4Var) {
        rhk rhkVar;
        if (nq4Var instanceof rhk) {
            rhkVar = (rhk) nq4Var;
            int i = rhkVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhkVar.h = i - Integer.MIN_VALUE;
            } else {
                rhkVar = new rhk(this, nq4Var);
            }
        } else {
            rhkVar = new rhk(this, nq4Var);
        }
        Object objE = rhkVar.f;
        int i2 = rhkVar.h;
        try {
            if (i2 == 0) {
                ch3.d0(objE);
                n7k n7kVar = (n7k) this.d;
                rhkVar.d = callingAppIds;
                rhkVar.e = this;
                rhkVar.h = 1;
                objE = n7kVar.e(rhkVar);
                hu4 hu4Var = hu4.a;
                if (objE == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = rhkVar.e;
                callingAppIds = rhkVar.d;
                ch3.d0(objE);
            }
            AppInfo appInfo = (AppInfo) objE;
            Object objM16invokeIoAF18A = ((GetCallingAppInfoUseCase) this.b).m16invokeIoAF18A(callingAppIds);
            if (!(objM16invokeIoAF18A instanceof poe)) {
                AppInfo appInfo2 = (AppInfo) objM16invokeIoAF18A;
                if (!cqk.d(appInfo.getPackageName(), appInfo2.getPackageName())) {
                    throw new HostIsNotMasterException("Package names mismatch! Saved host: " + appInfo.getPackageName() + ", caller: " + appInfo2.getPackageName());
                }
                if (!cqk.d(((PackagesRepository) this.c).getPackageName(), appInfo2.getPackageName()) && !z5h.G0(appInfo.getPubKey(), appInfo2.getPubKey(), true)) {
                    throw new IllegalStateException(("Saved host public key differs from caller public key. Expected: " + appInfo.getPubKey() + ", actual: " + appInfo2.getPubKey()).toString());
                }
            }
            Throwable thA = roe.a(objM16invokeIoAF18A);
            if (thA == null) {
                return sbi.a;
            }
            throw new IllegalStateException("Could not get calling host app info: " + callingAppIds, thA);
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    @Override // defpackage.x76
    public /* bridge */ /* synthetic */ x76 h(Class cls, zpb zpbVar) {
        ((HashMap) this.b).put(cls, zpbVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // defpackage.m1k
    public xf5 i(kli kliVar) {
        return kliVar.j(Collections.singletonList(CaptureRequest.SCALER_CROP_REGION));
    }

    public void j() {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            try {
                ((wdf) it.next()).close();
            } catch (Throwable th) {
                ((ze9) this.b).r("Poller", new gvc(26), new bpg(19, th));
            }
        }
    }

    @Override // defpackage.an7
    public synchronized void k() {
        ((j28) this.c).k();
        o02 o02Var = (o02) this.d;
        cn7 cn7Var = (cn7) this.b;
        Objects.requireNonNull(cn7Var);
        o02Var.q(new ap2(cn7Var, 0), true);
    }

    @Override // defpackage.gsb
    public void l() {
        zu4 zu4Var = (zu4) this.b;
        ((ta4) zu4Var.a).setSessionInfo(null);
        zu4Var.b = null;
        ((wh5) this.c).e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r0 != 4) goto L27;
     */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.xx6 m(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            xde r0 = (defpackage.xde) r0
            java.util.Set r0 = r0.r()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            xyc r2 = (defpackage.xyc) r2
            long r2 = r2.a
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto Lc
            goto L21
        L20:
            r1 = 0
        L21:
            xyc r1 = (defpackage.xyc) r1
            if (r1 != 0) goto L26
            goto L46
        L26:
            int r0 = r1.c
            int r0 = defpackage.qt4.D(r0)
            if (r0 == 0) goto L49
            r1 = 1
            if (r0 == r1) goto L49
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 4
            if (r0 == r1) goto L49
            goto L46
        L38:
            java.lang.Object r4 = r4.d
            pyc r4 = (defpackage.pyc) r4
            if (r4 == 0) goto L46
            xx6 r4 = r4.m(r5)
            if (r4 != 0) goto L45
            goto L46
        L45:
            return r4
        L46:
            o66 r4 = defpackage.o66.a
            return r4
        L49:
            java.lang.Object r4 = r4.c
            i1m r4 = (defpackage.i1m) r4
            xx6 r4 = r4.m(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euc.m(long):xx6");
    }

    @Override // defpackage.bn7
    public synchronized void o(dn7 dn7Var, long j) {
        ((j28) this.c).v(dn7Var, j);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        if (z) {
            ((ufk) this.c).a.N.log("OKRTCCall", "Screen capture has started, fast=true");
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        ((ufk) this.c).a(true);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            ((nue) this.b).getClass();
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = (CapturerObserver) this.d;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        ((kzi) this.b).onWebRtcAudioRecordError(str);
        CidLogger cidLogger = (CidLogger) this.c;
        cidLogger.log("SharedPeerConnectionFac", "onWebRtcAudioRecordError: " + str);
        cidLogger.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(qv1.k("onWebRtcAudioRecordError ", str)));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        ((kzi) this.b).onWebRtcAudioRecordInitError(str);
        CidLogger cidLogger = (CidLogger) this.c;
        cidLogger.log("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError: " + str);
        cidLogger.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(qv1.k("onWebRtcAudioRecordInitError ", str)));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((kzi) this.b).onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        ((CidLogger) this.c).log("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError: . " + str);
        ((zzf) this.d).a.execute(new yde(this, 23, str));
    }

    @Override // defpackage.io6
    public boolean p(lmf lmfVar) {
        yc2 yc2Var = new yc2();
        zx3 zx3Var = new zx3();
        bg2 bg2Var = (bg2) this.b;
        qd2 qd2Var = new qd2(((qb2) bg2Var).a, false);
        ch2 ch2Var = (ch2) this.d;
        we2 we2Var = new we2(yc2Var, zx3Var, qd2Var, ch2Var, new c2k(), new h0a(ch2Var.a()), bg2Var, null, null);
        s66 s66Var = s66.a;
        return ((Boolean) yab.A0(k66.a, new qc5(this, we2Var.a(0, lmfVar, true, null, null, s66Var, s66Var), (lq4) null, 12))).booleanValue();
    }

    @Override // defpackage.bn7
    public synchronized void q() {
        ((j28) this.c).x();
    }

    public List r() {
        Set<SelectionKey> setKeys;
        Selector selector = (Selector) this.c;
        if (selector == null || (setKeys = selector.keys()) == null) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList(yw3.W0(setKeys, 10));
        Iterator<T> it = setKeys.iterator();
        while (it.hasNext()) {
            arrayList.add((wdf) ((SelectionKey) it.next()).attachment());
        }
        return arrayList;
    }

    @Override // defpackage.dch
    public void release() {
        switch (this.a) {
            case 10:
                ((HashSet) this.b).clear();
                LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.d;
                if (loudnessCodecController != null) {
                    loudnessCodecController.close();
                }
                break;
        }
    }

    public boolean s() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.b) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.b = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.c).readLine();
                this.b = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.b = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    @Override // defpackage.t65
    public Object t() {
        l6m l6mVar = CallScreen.D1;
        String str = (String) this.b;
        ha9 ha9Var = (ha9) this.c;
        c32 c32Var = (c32) this.d;
        l6mVar.getClass();
        return new CallScreen(n1g.i(new ylc("type", "ACTIVE"), new ylc("action", str), new ylc("call_start_source", c32Var != null ? c32Var.a : null), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public String toString() {
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                fik fikVar = (fik) ((fik) this.c).c;
                String str = "";
                while (fikVar != null) {
                    Object obj = fikVar.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    fikVar = (fik) fikVar.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 17:
                return "SurfaceProcessorWithExecutor(" + ((t0j) this.b) + ")";
            case 19:
                return "VideoMessageQuality(fps=" + ((Range) this.b) + "|color=" + fx5.d + "|encoder=" + ((y0e) this.c) + "|video=" + ((pi0) this.d) + ")";
            default:
                return super.toString();
        }
    }

    public String u() {
        if (!s()) {
            qr7.d();
            return null;
        }
        String str = (String) this.b;
        this.b = null;
        return str;
    }

    public void v(wdf wdfVar) {
        ((ze9) this.b).b("Poller", new zn3(14));
        wdfVar.onConnected();
    }

    @Override // defpackage.m1k
    public float w() {
        return 1.0f;
    }

    public void x() throws IOException {
        ze9 ze9Var = (ze9) this.b;
        ze9Var.b("Poller", new gvc(22));
        dki dkiVar = (dki) this.d;
        dkiVar.a(true);
        int iD = qt4.D(dkiVar.c);
        if (iD != 0) {
            if (iD != 1) {
                ore.o();
                return;
            }
            nr6 nr6Var = new nr6(ze9Var);
            Pipe.SourceChannel sourceChannelSource = nr6Var.b.source();
            mr6 mr6Var = new mr6(this, ze9Var, sourceChannelSource, new bad(this, 24, dkiVar));
            sourceChannelSource.configureBlocking(false);
            ze9Var.b("Poller", new zn3(9));
            sourceChannelSource.register((Selector) this.c, 1, mr6Var);
            dkiVar.n.complete(nr6Var);
        }
    }

    @Override // defpackage.an7
    public synchronized void y() {
        ((j28) this.c).y();
    }

    @Override // defpackage.an7
    public void z(dn7 dn7Var) {
        ((o02) this.d).q(new zo2(this, 0, dn7Var), true);
    }

    public /* synthetic */ euc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public euc(nue nueVar, ufk ufkVar) {
        this.a = 15;
        nueVar.getClass();
        ufkVar.getClass();
        this.b = nueVar;
        this.c = ufkVar;
    }

    public euc(zzf zzfVar, kzi kziVar, CidLogger cidLogger) {
        this.a = 16;
        this.d = zzfVar;
        this.b = kziVar;
        this.c = cidLogger;
    }

    public euc(Context context, String str, Logger logger) {
        this.a = 20;
        this.c = context;
        this.b = str;
        this.d = logger;
    }

    public /* synthetic */ euc(int i, boolean z) {
        this.a = i;
    }

    public euc(String str, x18 x18Var) {
        this.a = 9;
        this.b = HttpPost.METHOD_NAME;
        this.c = str;
        this.d = x18Var;
    }

    public euc(Context context) {
        this.a = 0;
        this.b = euc.class.getName();
        this.c = context.getApplicationContext();
        this.d = new String[]{"contact_id", "mimetype", "data2", "data3", "data5", "is_primary", "_id", "data1", "display_name", "photo_uri", "photo_thumb_uri"};
    }

    public euc(wm7 wm7Var, cn7 cn7Var, cn7 cn7Var2, o02 o02Var) {
        this.a = 5;
        lvb.S(cn7Var != cn7Var2, "Creating a self loop in the chain: %s", cn7Var);
        this.b = cn7Var;
        this.c = new j28(wm7Var, cn7Var2, o02Var);
        this.d = o02Var;
    }

    public euc(xxi xxiVar) {
        this.a = 17;
        t0j t0jVar = xxiVar.e;
        Objects.requireNonNull(t0jVar);
        this.b = t0jVar;
        this.c = xxiVar.d;
        this.d = xxiVar.f;
    }

    public euc(kg2 kg2Var) {
        this.a = 6;
        this.b = kg2Var;
        this.d = (Rect) ((qb2) kg2Var.b).c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public euc(String str) {
        this.a = 11;
        fik fikVar = new fik(22, false);
        this.c = fikVar;
        this.d = fikVar;
        this.b = str;
    }

    public euc(dki dkiVar, ze9 ze9Var) {
        this.a = 18;
        this.d = dkiVar;
        this.a = 18;
        this.b = ze9Var;
    }

    public euc(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 12;
        this.d = arrayDeque;
        this.c = bufferedReader;
    }
}
