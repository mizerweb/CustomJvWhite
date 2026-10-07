package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.AudioRecord;
import android.net.Uri;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.ProcessingException;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.a;
import okcalls.f;
import okcalls.h;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xp9 implements otb, m1k, qeh, kg7, aqg, fsh, xb8, wm7, o78, d8h, PeerConnection.Observer, m72 {
    public static final Integer[] d = {48000, 44100, 24000, 16000, 8000};
    public static boolean e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public xp9(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new qhe();
                this.c = gvk.c(r66.a);
                break;
            case 12:
                this.b = new HashMap();
                this.c = new ArrayList();
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                this.b = new Object();
                this.c = new ArrayList();
                break;
            case 23:
                this.b = new fik(13);
                break;
            case 25:
                this.b = new nmc();
                this.c = new dfc();
                break;
            case 27:
                this.b = new rp4(R.id.link_context_menu_action_open_mail, new tnh(R.string.link_context_menu_action_open_mail_link), Integer.valueOf(R.drawable.icon_email), (Integer) null, 20);
                this.c = new rp4(R.id.link_context_menu_action_copy_mail, new tnh(R.string.link_context_menu_action_copy_mail_link), Integer.valueOf(R.drawable.icon_copy), (Integer) null, 20);
                break;
            default:
                this.b = new AtomicReference(Float.valueOf(0.0f));
                this.c = new AtomicBoolean(false);
                break;
        }
    }

    public static boolean P(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static void T(xp9 xp9Var, long j) {
        xp9Var.L(Long.valueOf(j), "exo_len");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f2 A[PHI: r12 r14 r16
  0x00f2: PHI (r12v4 java.lang.Integer) = (r12v3 java.lang.Integer), (r12v8 java.lang.Integer) binds: [B:57:0x0124, B:39:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r14v7 java.lang.Integer) = (r14v5 java.lang.Integer), (r14v3 java.lang.Integer) binds: [B:57:0x0124, B:39:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r16v15 boolean) = (r16v9 boolean), (r16v18 boolean) binds: [B:57:0x0124, B:39:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.m72
    public void A(y8e y8eVar, pne pneVar) {
        String strSubstring;
        yf2 yf2Var = pneVar.m;
        boolean z = true;
        try {
            ((l9e) this.b).a(pneVar, yf2Var);
            y8e y8eVar2 = (y8e) yf2Var.b;
            if (y8eVar2.k) {
                throw new IllegalStateException("Check failed.");
            }
            y8eVar2.k = true;
            y8eVar2.f.j();
            c9e c9eVarD = ((jd6) yf2Var.e).d();
            Socket socket = c9eVarD.d;
            u8e u8eVar = c9eVarD.h;
            s8e s8eVar = c9eVarD.i;
            int i = 0;
            socket.setSoTimeout(0);
            c9eVarD.k();
            b9e b9eVar = new b9e(u8eVar, s8eVar, yf2Var);
            hu7 hu7Var = pneVar.f;
            int size = hu7Var.size();
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            Integer numB0 = null;
            Integer numB1 = null;
            while (i2 < size) {
                if (z5h.G0(hu7Var.b(i2), "Sec-WebSocket-Extensions", z)) {
                    String strF = hu7Var.f(i2);
                    int i3 = i;
                    while (i3 < strF.length()) {
                        boolean z6 = z;
                        int iH = uqi.h(strF, ',', i3, i, 4);
                        int iF = uqi.f(';', i3, iH, strF);
                        String strZ = uqi.z(i3, iF, strF);
                        int i4 = iF + 1;
                        if (strZ.equalsIgnoreCase("permessage-deflate")) {
                            if (z2) {
                                z5 = z6;
                            }
                            i3 = i4;
                            while (i3 < iH) {
                                int iF2 = uqi.f(';', i3, iH, strF);
                                int iF3 = uqi.f('=', i3, iF2, strF);
                                String strZ2 = uqi.z(i3, iF3, strF);
                                if (iF3 < iF2) {
                                    String strZ3 = uqi.z(iF3 + 1, iF2, strF);
                                    hu7Var = hu7Var;
                                    iH = iH;
                                    if (strZ3.length() >= 2 && r5h.n1(strZ3, "\"", false) && r5h.O0("\"", strZ3)) {
                                        strSubstring = strZ3.substring(z6 ? 1 : 0, strZ3.length() - 1);
                                    } else {
                                        strSubstring = strZ3;
                                    }
                                } else {
                                    hu7Var = hu7Var;
                                    iH = iH;
                                    strSubstring = null;
                                }
                                i3 = iF2 + 1;
                                if (strZ2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (numB0 != null) {
                                        z5 = true;
                                    }
                                    numB0 = strSubstring != null ? y5h.B0(strSubstring) : null;
                                    if (numB0 == null) {
                                        z5 = true;
                                    }
                                } else if (strZ2.equalsIgnoreCase("client_no_context_takeover")) {
                                    if (z3) {
                                        z5 = true;
                                    }
                                    if (strSubstring != null) {
                                        z5 = true;
                                    }
                                    z3 = true;
                                } else {
                                    if (strZ2.equalsIgnoreCase("server_max_window_bits")) {
                                        if (numB1 != null) {
                                            z5 = true;
                                        }
                                        numB1 = strSubstring != null ? y5h.B0(strSubstring) : null;
                                        if (numB1 == null) {
                                        }
                                    } else if (strZ2.equalsIgnoreCase("server_no_context_takeover")) {
                                        if (z4) {
                                            z5 = true;
                                        }
                                        if (strSubstring != null) {
                                            z5 = true;
                                        }
                                        z4 = true;
                                    }
                                    z5 = true;
                                }
                                z6 = true;
                            }
                            z = true;
                            i = 0;
                            z2 = true;
                        } else {
                            i3 = i4;
                            z = true;
                            i = 0;
                            z5 = true;
                        }
                    }
                }
                i2++;
                i = i;
                hu7Var = hu7Var;
                z = true;
            }
            ((l9e) this.b).e = new ntj(z2, numB0, z3, numB1, z4, z5);
            if (z5 || numB0 != null || (numB1 != null && !new hj8(8, 15, 1).c(numB1.intValue()))) {
                l9e l9eVar = (l9e) this.b;
                synchronized (l9eVar) {
                    l9eVar.p.clear();
                    l9eVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                ((l9e) this.b).d(uqi.g + " WebSocket " + ((dle) this.c).a.h(), b9eVar);
                l9e l9eVar2 = (l9e) this.b;
                l9eVar2.b.onOpen(l9eVar2, pneVar);
                ((l9e) this.b).e();
            } catch (Exception e2) {
                ((l9e) this.b).c(e2, null);
            }
        } catch (IOException e3) {
            ((l9e) this.b).c(e3, pneVar);
            uqi.d(pneVar);
            if (yf2Var != null) {
                yf2Var.a(true, true, null);
            }
        }
    }

    @Override // defpackage.m1k
    public Rect B() {
        return (Rect) ((qb2) ((kg2) this.b).b).c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // defpackage.qeh
    public int C() {
        return 0;
    }

    @Override // defpackage.o78
    public void D(n78 n78Var, Executor executor) {
        ((ch) this.b).D(new fv9(this, 18, n78Var), executor);
    }

    @Override // defpackage.m1k
    public xf5 E(float f, kli kliVar) {
        float fW = w();
        if (f > b() || fW > f) {
            ore.p("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapS0 = wm9.S0(new ylc(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f)));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ag2 ag2Var = bg2.U;
            bg2 bg2Var = ((kg2) this.b).b;
            ag2Var.getClass();
            if (i >= 34) {
                int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
                if (iArr != null && a.L0(1, iArr)) {
                    linkedHashMapS0.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
                }
            }
        }
        return kliVar.l(linkedHashMapS0, ili.b);
    }

    @Override // defpackage.d8h
    public int F() {
        return 1;
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((lsa) this.b).invoke(Integer.valueOf(i));
        }
        return null;
    }

    @Override // defpackage.o78
    public l78 H() {
        return N(((ch) this.b).H());
    }

    @Override // defpackage.wm7
    public void I(EGLDisplay eGLDisplay) throws GlUtil$GlException {
        EGLContext eGLContext = (EGLContext) this.c;
        if (eGLContext != null) {
            tab.o(eGLContext, eGLDisplay);
        }
    }

    public Integer J() {
        CidLogger cidLogger = (CidLogger) this.c;
        x80 x80Var = (x80) this.b;
        if (!x80Var.a) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= 5) {
                f fVar = new f("Can't find valid sample rate for audio recording");
                String message = fVar.getMessage();
                cidLogger.reportException("AudioUtils", message != null ? message : "", fVar);
                return null;
            }
            Integer[] numArr = d;
            Integer num = numArr[i];
            int iIntValue = num.intValue();
            if (AudioRecord.getMinBufferSize(iIntValue, 16, 2) > 0) {
                if (iIntValue < numArr[0].intValue() && x80Var.b && !e) {
                    h hVar = new h(zo5.h(iIntValue, "Unexpected sampling rate selected: "));
                    String message2 = hVar.getMessage();
                    cidLogger.reportException("AudioUtils", message2 != null ? message2 : "", hVar);
                    e = true;
                }
                cidLogger.log("AudioUtils", "Found usable recording sample rate: " + iIntValue);
                return num;
            }
            cidLogger.log("AudioUtils", "Recording sampling rate of " + iIntValue + " doesn't supported by device");
            i++;
        }
    }

    public jp6 K() {
        return new jp6((String) this.c, ((HashMap) this.b) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.b)));
    }

    public void L(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public vp9 M(Uri uri) {
        jj6 jj6Var;
        boolean zB;
        up9 up9Var = new up9((Context) this.b, uri);
        ra5 ra5Var = new ra5();
        synchronized (ra5Var) {
            ra5Var.e = 1;
        }
        synchronized (ra5Var) {
            ra5Var.f = 6;
        }
        Uri uri2 = up9Var.a.getUri();
        if (uri2 == null) {
            ore.p("Required value was null.");
            return null;
        }
        jj6[] jj6VarArrD = ra5Var.d(uri2, s66.a);
        if (jj6VarArrD.length == 1) {
            return new vp9(jj6VarArrD[0], up9Var);
        }
        int length = jj6VarArrD.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jj6Var = null;
                break;
            }
            jj6Var = jj6VarArrD[i];
            try {
                qa5 qa5Var = up9Var.c;
                if (qa5Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                zB = jj6Var.b(qa5Var);
                qa5 qa5Var2 = up9Var.c;
                if (qa5Var2 != null) {
                    qa5Var2.f = 0;
                }
            } catch (Throwable th) {
                try {
                    String str = up9Var.d;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Got error on sniffing extractor", th);
                        }
                    }
                    qa5 qa5Var3 = up9Var.c;
                    if (qa5Var3 != null) {
                        qa5Var3.f = 0;
                    }
                    zB = false;
                } catch (Throwable th2) {
                    qa5 qa5Var4 = up9Var.c;
                    if (qa5Var4 != null) {
                        qa5Var4.f = 0;
                    }
                    throw th2;
                }
            }
            if (zB) {
                break;
            }
            i++;
        }
        for (jj6 jj6Var2 : jj6VarArrD) {
            if (!cqk.d(jj6Var2, jj6Var)) {
                jj6Var2.release();
            }
        }
        if (jj6Var != null) {
            return new vp9(jj6Var, up9Var);
        }
        up9Var.close();
        return null;
    }

    public nof N(l78 l78Var) {
        ghh ghhVar;
        if (l78Var == null) {
            return null;
        }
        if (((hjd) this.c) == null) {
            ghhVar = ghh.b;
        } else {
            hjd hjdVar = (hjd) this.c;
            Pair pair = new Pair(hjdVar.h, hjdVar.i.get(0));
            ghh ghhVar2 = ghh.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            ghhVar = new ghh(arrayMap);
        }
        this.c = null;
        return new nof(l78Var, new Size(l78Var.getWidth(), l78Var.getHeight()), new hd2(new t28(null, ghhVar, l78Var.getImageInfo().getTimestamp())));
    }

    public KeyListener O(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((fik) ((ft0) this.c).a).getClass();
        if (keyListener instanceof x46) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new x46(keyListener);
    }

    public void Q(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, l3e.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            U(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        ((w35) vpgVar).d.setText((CharSequence) G(i));
    }

    public s46 S(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ft0 ft0Var = (ft0) this.c;
        if (inputConnection == null) {
            ft0Var.getClass();
            inputConnection2 = null;
        } else {
            fik fikVar = (fik) ft0Var.a;
            fikVar.getClass();
            if (!(inputConnection instanceof s46)) {
                inputConnection = new s46(editorInfo, inputConnection, (EditText) fikVar.b);
            }
            inputConnection2 = inputConnection;
        }
        return (s46) inputConnection2;
    }

    public void U(boolean z) {
        t56 t56Var = (t56) ((fik) ((ft0) this.c).a).c;
        if (t56Var.c != z) {
            if (t56Var.b != null) {
                l46 l46VarA = l46.a();
                s56 s56Var = t56Var.b;
                l46VarA.getClass();
                qyj.k(s56Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = l46VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    l46VarA.b.remove(s56Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            t56Var.c = z;
            if (z) {
                t56.a(t56Var.a, l46.a().b());
            }
        }
    }

    public void V(Annotation annotation) {
        if (((HashMap) this.b) == null) {
            this.b = new HashMap();
        }
        ((HashMap) this.b).put(annotation.annotationType(), annotation);
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        switch (this.a) {
            case 10:
                break;
            default:
                cch cchVar = (cch) obj;
                cchVar.getClass();
                try {
                    ((dch) ((g85) this.c).a).d(cchVar);
                } catch (ProcessingException e2) {
                    tvj.d("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e2);
                }
                break;
        }
    }

    @Override // defpackage.m1k
    public float b() {
        return ((Number) ((Range) this.c).getUpper()).floatValue();
    }

    @Override // defpackage.qeh
    public void c() {
        CallWaitingRoomEventsWidget.t1((CallWaitingRoomEventsWidget) this.b);
    }

    @Override // defpackage.o78
    public void close() {
        ((ch) this.b).close();
    }

    @Override // defpackage.o78
    public l78 d() {
        return N(((ch) this.b).d());
    }

    @Override // defpackage.o78
    public int e() {
        return ((ch) this.b).e();
    }

    @Override // defpackage.o78
    public void f() {
        ((ch) this.b).f();
    }

    @Override // defpackage.wm7
    public EGLSurface g(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ((fik) this.b).g(eGLDisplay, obj, i, z);
    }

    @Override // defpackage.o78
    public int getHeight() {
        return ((ch) this.b).getHeight();
    }

    @Override // defpackage.o78
    public Surface getSurface() {
        return ((ch) this.b).getSurface();
    }

    @Override // defpackage.o78
    public int getWidth() {
        return ((ch) this.b).getWidth();
    }

    @Override // defpackage.m1k
    public xf5 i(kli kliVar) {
        ArrayList arrayListR0 = xw3.R0(CaptureRequest.CONTROL_ZOOM_RATIO);
        if (Build.VERSION.SDK_INT >= 34) {
            arrayListR0.add(CaptureRequest.CONTROL_SETTINGS_OVERRIDE);
        }
        return kliVar.j(arrayListR0);
    }

    @Override // defpackage.otb
    public void j(Task task) {
        if (((kam) task).d) {
            gm0.Y(((gp7) this.b).b, "getPushToken cancelled");
            ((ek2) this.c).n(null);
        } else {
            if (!task.j()) {
                gm0.V(((gp7) this.b).b, "Fetching FCM registration token failed", gp7.j((gp7) this.b, task.g()) ? task.g() : new fp7(task.g()));
                ((ek2) this.c).resumeWith(new nqg(null, 3));
                return;
            }
            Object objH = task.h();
            if (objH == null) {
                ore.p("Required value was null.");
            } else {
                gm0.n(((gp7) this.b).b, "FCM token fetched");
                ((ek2) this.c).resumeWith(new nqg((String) objH, 2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:133:0x025f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0268  */
    /* JADX WARN: Code duplicated, block: B:136:0x0272  */
    /* JADX WARN: Code duplicated, block: B:138:0x027a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0282  */
    /* JADX WARN: Code duplicated, block: B:141:0x0286  */
    /* JADX WARN: Code duplicated, block: B:143:0x028e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0295  */
    /* JADX WARN: Code duplicated, block: B:146:0x029d  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:173:0x0303  */
    /* JADX WARN: Code duplicated, block: B:175:0x030b  */
    /* JADX WARN: Code duplicated, block: B:177:0x031b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0334  */
    /* JADX WARN: Code duplicated, block: B:181:0x0345  */
    /* JADX WARN: Code duplicated, block: B:184:0x034e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0350  */
    /* JADX WARN: Code duplicated, block: B:188:0x0359  */
    /* JADX WARN: Code duplicated, block: B:189:0x035b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0364  */
    /* JADX WARN: Code duplicated, block: B:196:0x036c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0376  */
    /* JADX WARN: Code duplicated, block: B:200:0x0389  */
    /* JADX WARN: Code duplicated, block: B:247:0x0453  */
    /* JADX WARN: Code duplicated, block: B:280:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:177:0x031b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d8h
    public void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var) {
        int iE;
        boolean z;
        ArrayList arrayListD;
        String strTrim;
        int i3;
        String string;
        boolean z2;
        Matcher matcher;
        String strGroup;
        byte b;
        int i4;
        boolean z3;
        xp9 xp9Var = this;
        nmc nmcVar = (nmc) xp9Var.b;
        nmcVar.L(i + i2, bArr);
        nmcVar.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            yuj.d(nmcVar);
            while (!TextUtils.isEmpty(nmcVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                byte b2 = -1;
                while (true) {
                    int i8 = 1;
                    if (b2 == -1) {
                        i7 = nmcVar.b;
                        String strN = nmcVar.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        nmcVar.N(i7);
                        if (b2 == 0) {
                            dc9 dc9Var = new dc9(arrayList2);
                            long[] jArr = (long[]) dc9Var.d;
                            long j = c8hVar.b;
                            if (j == -9223372036854775807L) {
                                iE = 0;
                            } else {
                                iE = dc9Var.e(j);
                                if (iE == -1) {
                                    iE = jArr.length;
                                } else if (iE > 0 && dc9Var.m(iE - 1) == j) {
                                    iE--;
                                }
                            }
                            if (j != -9223372036854775807L) {
                                List listH = dc9Var.h(j);
                                long jM = dc9Var.m(iE);
                                if (((ArrayList) listH).isEmpty() || iE >= jArr.length) {
                                    z = false;
                                } else {
                                    long j2 = c8hVar.b;
                                    if (j2 < jM) {
                                        qg4Var.accept(new bz4(j2, jM - j2, listH));
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                }
                            } else {
                                z = false;
                            }
                            for (int i9 = iE; i9 < jArr.length; i9++) {
                                if (Thread.currentThread().isInterrupted()) {
                                    return;
                                }
                                rel.a(dc9Var, i9, qg4Var);
                            }
                            if (c8hVar.a) {
                                if (z) {
                                    iE--;
                                }
                                for (int i10 = 0; i10 < iE; i10++) {
                                    if (Thread.currentThread().isInterrupted()) {
                                        return;
                                    }
                                    rel.a(dc9Var, i10, qg4Var);
                                }
                                if (z) {
                                    qg4Var.accept(new bz4(dc9Var.m(iE), j - dc9Var.m(iE), dc9Var.h(j)));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (Thread.currentThread().isInterrupted()) {
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(nmcVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    ore.p("A style block was found after the first cue.");
                                    return;
                                }
                                nmcVar.n(StandardCharsets.UTF_8);
                                dfc dfcVar = (dfc) xp9Var.c;
                                nmc nmcVar2 = dfcVar.a;
                                StringBuilder sb = dfcVar.b;
                                sb.setLength(0);
                                int i11 = nmcVar.b;
                                while (!TextUtils.isEmpty(nmcVar.n(StandardCharsets.UTF_8))) {
                                }
                                nmcVar2.L(nmcVar.b, nmcVar.a);
                                nmcVar2.N(i11);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    dfc.c(nmcVar2);
                                    if (nmcVar2.a() >= 5 && "::cue".equals(nmcVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i12 = nmcVar2.b;
                                        String strB = dfc.b(nmcVar2, sb);
                                        if (strB == null) {
                                            strTrim = null;
                                        } else if ("{".equals(strB)) {
                                            nmcVar2.N(i12);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i13 = nmcVar2.b;
                                                int i14 = nmcVar2.c;
                                                int i15 = i5;
                                                while (i13 < i14 && i15 == 0) {
                                                    int i16 = i13 + 1;
                                                    i15 = ((char) nmcVar2.a[i13]) == ')' ? i8 : 0;
                                                    i13 = i16;
                                                }
                                                strTrim = nmcVar2.y((i13 - 1) - nmcVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = null;
                                            }
                                            if (!")".equals(dfc.b(nmcVar2, sb))) {
                                                strTrim = null;
                                            }
                                        }
                                    } else {
                                        strTrim = null;
                                    }
                                    if (strTrim != null && "{".equals(dfc.b(nmcVar2, sb))) {
                                        ruj rujVar = new ruj();
                                        if ("".equals(strTrim)) {
                                            i3 = 0;
                                        } else {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i6) {
                                                Matcher matcher2 = dfc.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i8);
                                                    strGroup2.getClass();
                                                    rujVar.d = strGroup2;
                                                }
                                                i3 = 0;
                                                strTrim = strTrim.substring(0, iIndexOf);
                                            } else {
                                                i3 = 0;
                                            }
                                            String str = vqi.a;
                                            String[] strArrSplit = strTrim.split("\\.", -1);
                                            String str2 = strArrSplit[i3];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != -1) {
                                                rujVar.b = str2.substring(i3, iIndexOf2);
                                                rujVar.a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                rujVar.b = str2;
                                            }
                                            if (strArrSplit.length > 1) {
                                                int length = strArrSplit.length;
                                                lvb.R(length <= strArrSplit.length ? 1 : i3);
                                                rujVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, 1, length)));
                                            }
                                        }
                                        int i17 = i3;
                                        String str3 = null;
                                        while (i17 == 0) {
                                            int i18 = nmcVar2.b;
                                            String strB2 = dfc.b(nmcVar2, sb);
                                            int i19 = (strB2 == null || "}".equals(strB2)) ? 1 : i3;
                                            if (i19 == 0) {
                                                nmcVar2.N(i18);
                                                dfc.c(nmcVar2);
                                                String strA = dfc.a(nmcVar2, sb);
                                                if (!"".equals(strA) && ":".equals(dfc.b(nmcVar2, sb))) {
                                                    dfc.c(nmcVar2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z4 = false;
                                                    while (true) {
                                                        if (z4) {
                                                            strB2 = strB2;
                                                            i19 = i19;
                                                            string = sb2.toString();
                                                        } else {
                                                            strB2 = strB2;
                                                            int i20 = nmcVar2.b;
                                                            i19 = i19;
                                                            String strB3 = dfc.b(nmcVar2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                nmcVar2.N(i20);
                                                                z4 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string != null && !"".equals(string)) {
                                                        int i21 = nmcVar2.b;
                                                        String strB4 = dfc.b(nmcVar2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                z2 = true;
                                                                rujVar.f = hx3.a(string, true);
                                                                rujVar.g = true;
                                                            } else {
                                                                z2 = true;
                                                                if ("background-color".equals(strA)) {
                                                                    rujVar.h = hx3.a(string, true);
                                                                    rujVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("over".equals(string)) {
                                                                        rujVar.p = 1;
                                                                    } else if ("under".equals(string)) {
                                                                        rujVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(strA)) {
                                                                    if ("all".equals(string)) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    rujVar.q = z3;
                                                                } else if ("text-decoration".equals(strA)) {
                                                                    if ("underline".equals(string)) {
                                                                        z2 = true;
                                                                        rujVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(strA)) {
                                                                    rujVar.e = n1g.b0(string);
                                                                } else if ("font-weight".equals(strA)) {
                                                                    z2 = true;
                                                                    if ("font-style".equals(strA)) {
                                                                        if ("italic".equals(string)) {
                                                                            rujVar.m = 1;
                                                                        }
                                                                    } else if ("font-size".equals(strA)) {
                                                                        matcher = dfc.d.matcher(n1g.b0(string));
                                                                        if (matcher.matches()) {
                                                                            strGroup = matcher.group(2);
                                                                            strGroup.getClass();
                                                                            switch (strGroup.hashCode()) {
                                                                                case LangUtils.HASH_OFFSET /* 37 */:
                                                                                    if (!strGroup.equals("%")) {
                                                                                        b = 0;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            c.t();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup3 = matcher.group(i4);
                                                                                    strGroup3.getClass();
                                                                                    rujVar.o = Float.parseFloat(strGroup3);
                                                                                    break;
                                                                                case 3240:
                                                                                    if (!strGroup.equals("em")) {
                                                                                        b = 1;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            c.t();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup4 = matcher.group(i4);
                                                                                    strGroup4.getClass();
                                                                                    rujVar.o = Float.parseFloat(strGroup4);
                                                                                    break;
                                                                                case 3592:
                                                                                    if (!strGroup.equals("px")) {
                                                                                        b = 2;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            c.t();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup5 = matcher.group(i4);
                                                                                    strGroup5.getClass();
                                                                                    rujVar.o = Float.parseFloat(strGroup5);
                                                                                    break;
                                                                            }
                                                                            b = -1;
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i4 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i4 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i4 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup6 = matcher.group(i4);
                                                                            strGroup6.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup6);
                                                                        } else {
                                                                            lvb.G0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                        }
                                                                    }
                                                                } else if ("bold".equals(string)) {
                                                                    z2 = true;
                                                                    rujVar.l = 1;
                                                                }
                                                            }
                                                        } else if ("}".equals(strB4)) {
                                                            nmcVar2.N(i21);
                                                            if ("color".equals(strA)) {
                                                                z2 = true;
                                                                rujVar.f = hx3.a(string, true);
                                                                rujVar.g = true;
                                                            } else {
                                                                z2 = true;
                                                                if ("background-color".equals(strA)) {
                                                                    rujVar.h = hx3.a(string, true);
                                                                    rujVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("over".equals(string)) {
                                                                        rujVar.p = 1;
                                                                    } else if ("under".equals(string)) {
                                                                        rujVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(strA)) {
                                                                    if ("all".equals(string) || string.startsWith("digits")) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    rujVar.q = z3;
                                                                } else if ("text-decoration".equals(strA)) {
                                                                    if ("underline".equals(string)) {
                                                                        z2 = true;
                                                                        rujVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(strA)) {
                                                                    rujVar.e = n1g.b0(string);
                                                                } else if ("font-weight".equals(strA)) {
                                                                    z2 = true;
                                                                    if ("font-style".equals(strA)) {
                                                                        if ("italic".equals(string)) {
                                                                            rujVar.m = 1;
                                                                        }
                                                                    } else if ("font-size".equals(strA)) {
                                                                        matcher = dfc.d.matcher(n1g.b0(string));
                                                                        if (matcher.matches()) {
                                                                            lvb.G0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                        } else {
                                                                            strGroup = matcher.group(2);
                                                                            strGroup.getClass();
                                                                            switch (strGroup.hashCode()) {
                                                                                case LangUtils.HASH_OFFSET /* 37 */:
                                                                                    if (!strGroup.equals("%")) {
                                                                                        b = 0;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            c.t();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup7 = matcher.group(i4);
                                                                                    strGroup7.getClass();
                                                                                    rujVar.o = Float.parseFloat(strGroup7);
                                                                                    break;
                                                                                case 3240:
                                                                                    if (!strGroup.equals("em")) {
                                                                                        b = 1;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            c.t();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup8 = matcher.group(i4);
                                                                                    strGroup8.getClass();
                                                                                    rujVar.o = Float.parseFloat(strGroup8);
                                                                                    break;
                                                                                case 3592:
                                                                                    if (!strGroup.equals("px")) {
                                                                                        b = 2;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i4 = 1;
                                                                                            rujVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            c.t();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup9 = matcher.group(i4);
                                                                                    strGroup9.getClass();
                                                                                    rujVar.o = Float.parseFloat(strGroup9);
                                                                                    break;
                                                                            }
                                                                            b = -1;
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i4 = 1;
                                                                                    rujVar.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i4 = 1;
                                                                                    rujVar.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i4 = 1;
                                                                                    rujVar.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    c.t();
                                                                                    return;
                                                                            }
                                                                            String strGroup10 = matcher.group(i4);
                                                                            strGroup10.getClass();
                                                                            rujVar.o = Float.parseFloat(strGroup10);
                                                                        }
                                                                    }
                                                                } else if ("bold".equals(string)) {
                                                                    z2 = true;
                                                                    rujVar.l = 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    strB2 = strB2;
                                                    i19 = i19;
                                                }
                                            } else {
                                                strB2 = strB2;
                                                i19 = i19;
                                            }
                                            str3 = strB2;
                                            i17 = i19;
                                            i3 = 0;
                                        }
                                        if ("}".equals(str3)) {
                                            arrayList3.add(rujVar);
                                        }
                                        i8 = 1;
                                        i5 = 0;
                                        i6 = -1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = ifc.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = nmcVar.n(charset);
                                if (strN2 == null) {
                                    arrayListD = null;
                                } else {
                                    Pattern pattern2 = ifc.a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        arrayListD = ifc.d(null, matcher3, nmcVar, arrayList);
                                    } else {
                                        arrayListD = null;
                                        String strN3 = nmcVar.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                arrayListD = ifc.d(strN2.trim(), matcher4, nmcVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (arrayListD != null) {
                                    arrayList2.addAll(arrayListD);
                                }
                            }
                            xp9Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // defpackage.xb8
    public void l(wf5 wf5Var) {
        synchronized (this.b) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                if (cqk.d(((yb8) it.next()).b, wf5Var)) {
                    wf5Var.a();
                }
            }
        }
    }

    @Override // defpackage.fsh
    public long m() {
        return ((Long) ((s63) this.b).mo41apply(Long.valueOf(((nv8) this.c).m()))).longValue();
    }

    @Override // defpackage.o78
    public int n() {
        return ((ch) this.b).n();
    }

    @Override // defpackage.wm7
    public dn7 o(int i, int i2, int i3) {
        return ((fik) this.b).o(i, i2, i3);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        String string;
        qpc qpcVar = (qpc) this.c;
        y3e y3eVar = qpcVar.w;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddStream, ");
        sb.append(qpcVar);
        sb.append(", stream =");
        sb.append(uza.b(mediaStream));
        sb.append(", video tracks=");
        List<VideoTrack> list = mediaStream.videoTracks;
        if (list == null || list.isEmpty()) {
            string = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            for (VideoTrack videoTrack : list) {
                if (!z) {
                    sb2.append(", ");
                }
                if (videoTrack != null) {
                    sb2.append(videoTrack.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(videoTrack));
                } else {
                    sb2.append((char) 216);
                }
                z = false;
            }
            sb2.append(']');
            string = sb2.toString();
        }
        sb.append(string);
        y3eVar.log("PeerConnectionClient", sb.toString());
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        String string;
        qpc qpcVar = (qpc) this.c;
        y3e y3eVar = qpcVar.w;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddTrack, ");
        sb.append(qpcVar);
        sb.append(", receiver=");
        sb.append(rtpReceiver);
        sb.append(", streams=");
        boolean z = uza.a;
        if (mediaStreamArr == null || mediaStreamArr.length == 0) {
            string = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int length = mediaStreamArr.length;
            boolean z2 = true;
            int i = 0;
            while (i < length) {
                MediaStream mediaStream = mediaStreamArr[i];
                if (!z2) {
                    sb2.append(", ");
                }
                if (mediaStream != null) {
                    sb2.append(mediaStream.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(mediaStream));
                } else {
                    sb2.append((char) 216);
                }
                i++;
                z2 = false;
            }
            sb2.append(']');
            string = sb2.toString();
        }
        sb.append(string);
        y3eVar.log("PeerConnectionClient", sb.toString());
        rtpReceiver.SetObserver(new ipc(qpcVar));
        qpcVar.b0.j(rtpReceiver, mediaStreamArr);
        qpcVar.r.post(new i7b(qpcVar, 10, mediaStreamArr));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handleConnectionStateChanged, " + qpcVar + " state " + peerConnectionState);
        qpcVar.r.post(new i7b(qpcVar, 9, peerConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        qpc qpcVar = (qpc) this.c;
        y3e y3eVar = qpcVar.w;
        if ("animoji".equals(dataChannel.label()) && qpcVar.g0 == 2) {
            f25 f25Var = new f25(dataChannel, y3eVar);
            hm hmVar = qpcVar.j;
            if (hmVar != null) {
                f25 f25Var2 = hmVar.c;
                if (f25Var2 != null) {
                    f25Var2.c(hmVar);
                }
                hmVar.c = f25Var;
                d0c d0cVar = hmVar.b;
                ((AtomicInteger) d0cVar.e).set(0);
                ((AtomicInteger) d0cVar.f).set(0);
                f25Var.a(hmVar);
            }
            an anVar = qpcVar.h;
            if (anVar != null) {
                anVar.f(f25Var);
            }
        }
        y3eVar.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + "/" + dataChannel.id());
    }

    @Override // defpackage.qeh
    public void onDismiss() {
        CallWaitingRoomEventsWidget.t1((CallWaitingRoomEventsWidget) this.b);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 10:
                wxl.a();
                hjd hjdVar = (hjd) this.b;
                js8 js8Var = (js8) this.c;
                if (hjdVar == ((hjd) js8Var.a)) {
                    tvj.g("CaptureNode", "request aborted, id=" + ((hjd) js8Var.a).a);
                    xp9 xp9Var = (xp9) js8Var.f;
                    if (xp9Var != null) {
                        xp9Var.c = null;
                    }
                    js8Var.a = null;
                }
                break;
            default:
                int i = ((zbh) this.b).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    tvj.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    tvj.i("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + yvl.b(i), th);
                }
                break;
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionIceCandidate, " + qpcVar);
        qpcVar.j(new bjk(qpcVar, new jpc(qpcVar, iceCandidate, 1), 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent) {
        qpc qpcVar = (qpc) this.c;
        y3e y3eVar = qpcVar.w;
        StringBuilder sb = new StringBuilder("handlePeerConnectionIceCandidateError, ");
        sb.append(qpcVar);
        sb.append(", event=");
        iceCandidateErrorEvent.getClass();
        String str = iceCandidateErrorEvent.address;
        int i = iceCandidateErrorEvent.port;
        String str2 = iceCandidateErrorEvent.url;
        int i2 = iceCandidateErrorEvent.errorCode;
        String str3 = iceCandidateErrorEvent.errorText;
        StringBuilder sbR = c0a.r(i, "\n        IceCandidateErrorEvent(address = ", str, ", port = ", ", url = ");
        sbR.append(str2);
        sbR.append(", errorCode = ");
        sbR.append(i2);
        sbR.append(", errorText ");
        sbR.append(str3);
        sbR.append("\n    ");
        sb.append(s5h.x0(sbR.toString()));
        y3eVar.log("PeerConnectionClient", sb.toString());
        qpcVar.r.post(new i7b(qpcVar, 7, iceCandidateErrorEvent));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionIceCandidatesRemoved, " + qpcVar);
        qpcVar.j(new bjk(qpcVar, new bm5(qpcVar, 4, iceCandidateArr), 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        qpc qpcVar = (qpc) this.c;
        p38 p38Var = qpcVar.A;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionIceConnectionChange, " + qpcVar + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        if (iceConnectionState == iceConnectionState2) {
            if (p38Var.c != 0 && !p38Var.d) {
                p38Var.d = true;
            }
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED && p38Var.c != 0 && !p38Var.d) {
            p38Var.d = true;
        }
        if (iceConnectionState == iceConnectionState2 && qpcVar.i) {
            gle gleVar = new gle(true);
            rve rveVar = qpcVar.B;
            if (rveVar != null) {
                rveVar.d(new dc9(new kr6(gleVar)));
            }
        }
        qpcVar.r.post(new i7b(qpcVar, 8, iceConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionIceGatheringChange, " + qpcVar + ", state=" + iceGatheringState);
        qpcVar.r.post(new i7b(qpcVar, 5, iceGatheringState));
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            qpcVar.A.getClass();
            SystemClock.elapsedRealtime();
        }
        qpcVar.j(new bjk(qpcVar, new bm5(qpcVar, 1, iceGatheringState), 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionRemoveStream, " + qpcVar + ", stream=" + uza.b(mediaStream));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionRenegotiationNeeded, " + qpcVar);
        qpcVar.r.post(new dpc(qpcVar, 4));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        kzi kziVar = (kzi) this.b;
        if (candidatePairChangeEvent != null) {
            lhk lhkVar = new lhk(candidatePairChangeEvent.local, candidatePairChangeEvent.remote);
            ((y3e) kziVar.a).log("ConnectionLogger", "Active connection: " + ((lhk) kziVar.b) + "-> " + lhkVar + ", reason=" + candidatePairChangeEvent.reason);
            kziVar.b = lhkVar;
        }
        qpc qpcVar = (qpc) this.c;
        y3e y3eVar = qpcVar.w;
        StringBuilder sb = new StringBuilder("handleSelectedCandidatePairChanged, ");
        sb.append(qpcVar);
        sb.append(", event=");
        sb.append("CandidatePairChangeEvent\nlocal=" + candidatePairChangeEvent.local + "\nremote=" + candidatePairChangeEvent.remote + "\nlastDataReceivedMs=" + candidatePairChangeEvent.lastDataReceivedMs + "\nreason=" + candidatePairChangeEvent.reason + "\nestimatedDisconnectedTimeMs=" + candidatePairChangeEvent.estimatedDisconnectedTimeMs);
        y3eVar.log("PeerConnectionClient", sb.toString());
        qpcVar.r.post(new i7b(qpcVar, 4, candidatePairChangeEvent));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        qpc qpcVar = (qpc) this.c;
        qpcVar.w.log("PeerConnectionClient", "handlePeerConnectionSignalingChange, " + qpcVar + ", state=" + signalingState);
        qpcVar.r.post(new i7b(qpcVar, 6, signalingState));
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(new TextView(viewGroup.getContext()));
        return new w35(frameLayout, (bx5) this.c);
    }

    @Override // defpackage.wm7
    public EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        ((fik) this.b).getClass();
        return tab.l(eGLContext, eGLDisplay);
    }

    @Override // defpackage.m72
    public void r(y8e y8eVar, IOException iOException) {
        ((l9e) this.b).c(iOException, null);
    }

    @Override // defpackage.qeh
    public int s() {
        return ((FrameLayout) this.c).getMeasuredHeight();
    }

    @Override // defpackage.xb8
    public void t() {
        synchronized (this.b) {
            try {
                for (yb8 yb8Var : (ArrayList) this.c) {
                    yb8Var.c.l(yb8Var.a, null);
                    yb8Var.b.a();
                }
                ((ArrayList) this.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xb8
    public void u(int i, wf5 wf5Var, ze2 ze2Var) {
        synchronized (this.b) {
            ((ArrayList) this.c).add(new yb8(i, wf5Var, ze2Var));
        }
    }

    @Override // defpackage.qeh
    public int v() {
        return ((FrameLayout) this.c).getBottom();
    }

    @Override // defpackage.m1k
    public float w() {
        return ((Number) ((Range) this.c).getLower()).floatValue();
    }

    @Override // defpackage.fsh
    public long x() {
        return ((Long) ((s63) this.b).mo41apply(Long.valueOf(((nv8) this.c).x()))).longValue();
    }

    @Override // defpackage.wm7
    public EGLContext y(EGLDisplay eGLDisplay, int i, int[] iArr) {
        if (((EGLContext) this.c) == null) {
            this.c = ((fik) this.b).y(eGLDisplay, i, iArr);
        }
        return (EGLContext) this.c;
    }

    @Override // defpackage.qeh
    public View z() {
        return (FrameLayout) this.c;
    }

    public /* synthetic */ xp9(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ xp9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xp9(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ xp9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public xp9(CidLogger cidLogger) {
        this.a = 6;
        this.b = cidLogger;
        this.c = new w74();
    }

    public xp9(lsa lsaVar) {
        this.a = 13;
        this.b = lsaVar;
        this.c = bx5.b;
    }

    public xp9(Context context) {
        this.a = 0;
        this.b = context;
        this.c = xp9.class.getName();
    }

    public xp9(ExecutorService executorService) {
        this.a = 29;
        this.c = new mw(0);
        this.b = executorService;
    }

    public xp9(EditText editText) {
        this.a = 4;
        this.b = editText;
        ft0 ft0Var = new ft0();
        ft0Var.a = new fik(editText);
        this.c = ft0Var;
    }

    public xp9(String str) {
        this.a = 17;
        this.b = null;
        this.c = str;
    }

    public xp9(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 19;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public xp9(int i, int i2) {
        this.a = 19;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public xp9(int i, int i2, int i3) {
        this.a = 19;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public xp9(rf5 rf5Var) {
        this.a = 14;
        this.c = rf5Var;
    }
}
