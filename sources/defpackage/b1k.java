package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.datastore.preferences.protobuf.a;
import com.vk.push.core.remote.config.omicron.util.UrlEncoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.ringtone.player.MediaSource$SoundConfigException;
import one.me.webview.FaqWebViewWidget;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.HardwareVideoEncoderExceptionHandler;
import org.webrtc.RTCStatsReport;
import org.webrtc.Size;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class b1k implements wba, cub, hu8, z32, CameraVideoCapturer.CaptureFormatHelper, qsf, wl4, stb, vtj, HardwareVideoEncoderExceptionHandler, zs3, JavaAudioDeviceModule.AudioRecordSampleHook, aki, t7b, z4a, xo, v8h {
    public final /* synthetic */ int a;
    public Object b;

    public b1k(String str) {
        this.a = 0;
        this.b = str;
        if (y("net.jpountz.xxhash.XXHash32".concat(str)) != null) {
            throw new ClassCastException();
        }
        if (y("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory") != null) {
            throw new ClassCastException();
        }
        if (y("net.jpountz.xxhash.XXHash64".concat(str)) != null) {
            throw new ClassCastException();
        }
        if (y("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory") != null) {
            throw new ClassCastException();
        }
        Random random = new Random();
        random.nextBytes(new byte[100]);
        random.nextInt();
        throw null;
    }

    public static b1k A() {
        if (!wqi.b) {
            synchronized (b1k.class) {
                D("JavaSafe");
                throw null;
            }
        }
        try {
            synchronized (b1k.class) {
                D("JavaUnsafe");
                throw null;
            }
        } catch (Throwable unused) {
            synchronized (b1k.class) {
                D("JavaSafe");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    public static mo6 C(kr7 kr7Var, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        List list2 = list;
        boolean z4 = list2 instanceof Collection;
        boolean z5 = false;
        if (!z4 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((cli) it.next()) instanceof z58) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z4 && list2.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    cli cliVar = (cli) it2.next();
                    if ((cliVar instanceof igd) || c2m.c(cliVar)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        }
        if (z4 && list2.isEmpty()) {
            z3 = false;
        } else {
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    cli cliVar2 = (cli) it3.next();
                    if ((cliVar2 instanceof igd) || (cliVar2 instanceof u48) || c2m.c(cliVar2)) {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            }
        }
        if (!z4 || !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                if (c2m.c((cli) it4.next())) {
                    z5 = true;
                    break;
                }
            }
        }
        int iOrdinal = kr7Var.a().ordinal();
        qmi qmiVar = qmi.b;
        qmi qmiVar2 = qmi.e;
        if (iOrdinal == 0) {
            string = qmiVar + " or " + qmiVar2;
            if (z2) {
                string = null;
            }
        } else if (iOrdinal == 1) {
            string = qmiVar + " or " + qmiVar2 + " or " + qmi.d;
            if (z3) {
                string = null;
            }
        } else {
            if (iOrdinal == 2) {
                ore.m();
                return null;
            }
            if (iOrdinal == 3) {
                string = qmi.c.toString();
                if (z) {
                    string = null;
                }
            } else {
                if (iOrdinal != 4) {
                    ore.o();
                    return null;
                }
                string = qmiVar2.toString();
                if (z5) {
                    string = null;
                }
            }
        }
        if (string != null) {
            return new mo6(string, kr7Var);
        }
        return null;
    }

    public static void D(String str) {
        try {
            new b1k(str);
            throw null;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static Object y(String str) {
        ClassLoader classLoader = b1k.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static b1k z() {
        boolean z;
        synchronized (sab.class) {
            z = sab.a;
        }
        if (!z && sab.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            A();
            throw null;
        }
        try {
            synchronized (b1k.class) {
                D("JNI");
                throw null;
            }
        } catch (Throwable unused) {
            A();
            throw null;
        }
    }

    public no6 B(ec1 ec1Var, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            no6 no6VarB = B(ec1Var, arrayList, i2, ww3.H1(arrayList.get(i), list));
            return no6VarB instanceof jo6 ? no6VarB : B(ec1Var, arrayList, i2, list);
        }
        LinkedHashSet linkedHashSetZ = lof.Z((Set) ec1Var.f, list);
        tvj.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetZ + ", useCases = " + ((List) ec1Var.h));
        ArrayList arrayList2 = new ArrayList(yw3.W0(linkedHashSetZ, 10));
        Iterator it = linkedHashSetZ.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kr7) it.next()).a());
        }
        for (xo6 xo6Var : ww3.k1(arrayList2)) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : linkedHashSetZ) {
                if (((kr7) obj).a() == xo6Var) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.size() > 1) {
                return ko6.a;
            }
        }
        nf2 nf2Var = (nf2) this.b;
        rj5 rj5Var = new rj5(1, linkedHashSetZ);
        Iterator it2 = linkedHashSetZ.iterator();
        while (it2.hasNext()) {
            ((kr7) it2.next()).getClass();
        }
        try {
            a2m.b(nf2Var, ec1Var, rj5Var);
            return new jo6(new rj5(1, linkedHashSetZ));
        } catch (CameraUseCaseAdapter$CameraException | IllegalArgumentException e) {
            tvj.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
        }
    }

    public void E(String str, t59 t59Var, MotionEvent motionEvent) {
        int i;
        List listP0;
        ProfileScreen profileScreen = ((dud) this.b).f;
        ljf ljfVar = ((grd) profileScreen.v1().I.getValue()).a;
        int iOrdinal = t59Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 4 || iOrdinal == 6) {
            if (y1m.b(str)) {
                i = 3;
            } else {
                i = y1m.c(str) ? 2 : 1;
            }
            int iD = qt4.D(i);
            if (iD != 0) {
                if (iD == 1) {
                    kzi kziVar = (kzi) ljfVar.d;
                    listP0 = xw3.P0((rp4) kziVar.a, (rp4) kziVar.b);
                } else if (iD != 2) {
                    ore.o();
                    return;
                } else {
                    xp9 xp9Var = (xp9) ljfVar.c;
                    listP0 = xw3.P0((rp4) xp9Var.b, (rp4) xp9Var.c);
                }
            } else if (t59Var == t59.e) {
                uvc uvcVar = (uvc) ((zo7) ljfVar.e).b;
                listP0 = xw3.P0((rp4) uvcVar.b, (rp4) uvcVar.c);
            } else {
                ih ihVar = (ih) ljfVar.b;
                listP0 = xw3.P0((rp4) ihVar.a, (rp4) ihVar.b);
            }
        } else {
            listP0 = null;
        }
        List list = listP0;
        if (list == null || list.isEmpty()) {
            return;
        }
        profileScreen.v1().M(2, str, t59Var);
        qp4 qp4VarBuild = opl.b(profileScreen, 1).g().n(motionEvent.getRawX(), motionEvent.getRawY()).p(n1g.i(new ylc("profile:contextmenu:link", str), new ylc("profile:contextmenu:link_type", Integer.valueOf(t59Var.ordinal())))).t(new xnh(str)).l(list).build();
        qp4 qp4Var = profileScreen.t;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        profileScreen.t = qp4VarBuild;
        qp4VarBuild.u(profileScreen);
        View view = profileScreen.getView();
        if (view != null) {
            p0m.a(view, mt7.LONG_PRESS);
        }
    }

    @Override // defpackage.wba
    public boolean F(yba ybaVar, MenuItem menuItem) {
        p8 p8Var = ((ActionMenuView) this.b).z;
        if (p8Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((uik) p8Var).b).G.b).iterator();
        while (it.hasNext()) {
            if (((ab7) it.next()).a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void G() {
        z58 z58Var = (z58) this.b;
        synchronized (z58Var.v) {
            try {
                Integer num = (Integer) z58Var.v.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != z58Var.L()) {
                    z58Var.P();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H(int i, c71 c71Var) {
        ((vu3) this.b).u(i, c71Var);
    }

    public void I(int i, Object obj, l3f l3fVar) {
        vu3 vu3Var = (vu3) this.b;
        vu3Var.G(i, 3);
        l3fVar.g((a) obj, vu3Var.a);
        vu3Var.G(i, 4);
    }

    @Override // defpackage.cub
    public /* synthetic */ void a(Object obj) {
        ((iu) this.b).invoke(obj);
    }

    @Override // defpackage.t7b
    public void b() {
        ((u3d) this.b).c();
    }

    @Override // defpackage.qsf
    public void c(long j) {
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = (ChatNotificationsSettingsScreen) this.b;
        zv8[] zv8VarArr = ChatNotificationsSettingsScreen.g;
        ((y83) chatNotificationsSettingsScreen.c.getValue()).D(j);
    }

    @Override // defpackage.t7b
    public void d(long j) {
        ((u3d) this.b).c();
    }

    @Override // defpackage.aki
    public void e(long j) {
        ((zec) this.b).e.f(null);
    }

    @Override // defpackage.t7b
    public void g() {
        ((u3d) this.b).c();
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List list, int i) {
        list.getClass();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = super.getClosestSupportedFramerateRange(list, i);
        y3e y3eVar = (y3e) this.b;
        y3eVar.log("CaptureFormatHelper", "available fps ranges are ".concat(ww3.z1(list, ", ", null, null, null, 62)));
        y3eVar.log("CaptureFormatHelper", "closest frame rate range for requested " + i + " is " + closestSupportedFramerateRange);
        closestSupportedFramerateRange.getClass();
        return closestSupportedFramerateRange;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public Size getClosestSupportedSize(List list, int i, int i2) {
        list.getClass();
        Size closestSupportedSize = super.getClosestSupportedSize(list, i, i2);
        y3e y3eVar = (y3e) this.b;
        y3eVar.log("CaptureFormatHelper", "available frame sizes are ".concat(ww3.z1(list, ", ", null, null, null, 62)));
        StringBuilder sb = new StringBuilder("closest frame size range for requested ");
        qt4.x(i, i2, "x", " is ", sb);
        sb.append(closestSupportedSize);
        y3eVar.log("CaptureFormatHelper", sb.toString());
        closestSupportedSize.getClass();
        return closestSupportedSize;
    }

    @Override // defpackage.xo
    public uo h() {
        return (uo) this.b;
    }

    @Override // org.webrtc.HardwareVideoEncoderExceptionHandler
    public void handle(Throwable th) {
        if (th != null) {
            CidLogger cidLogger = (CidLogger) this.b;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            cidLogger.reportException("HardwareVideoEncoderExceptionHandler", message, th);
        }
    }

    @Override // defpackage.t7b
    public void i() {
        ((u3d) this.b).c();
    }

    @Override // defpackage.t7b
    public void j() {
        ((u3d) this.b).c();
    }

    @Override // defpackage.t7b
    public void k() {
        ((u3d) this.b).c();
    }

    @Override // defpackage.qsf
    public void l(long j, boolean z) {
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = (ChatNotificationsSettingsScreen) this.b;
        zv8[] zv8VarArr = ChatNotificationsSettingsScreen.g;
        ((y83) chatNotificationsSettingsScreen.c.getValue()).D(j);
    }

    @Override // defpackage.vtj
    public void m(WebChromeClient.FileChooserParams fileChooserParams) {
        FaqWebViewWidget faqWebViewWidget = (FaqWebViewWidget) this.b;
        ldf ldfVar = FaqWebViewWidget.k;
        a8j.x(((bl6) faqWebViewWidget.j.getValue()).e, new er6(fileChooserParams));
    }

    @Override // defpackage.t7b
    public void n() {
        ((u3d) this.b).c();
    }

    @Override // defpackage.v8h
    public Object o(nq4 nq4Var) {
        jah jahVar = (jah) this.b;
        return yab.K0(((n0c) jahVar.g).a(), new ryf(jahVar, null, 15), nq4Var);
    }

    @Override // defpackage.stb
    public void onFailure(Throwable th) {
        ek2 ek2Var = (ek2) this.b;
        if (ek2Var.t() instanceof hib) {
            ek2Var.resumeWith(new poe(th));
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordSampleHook
    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        dlc blcVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 2) {
            blcVar = new blc(i5 >> 1, i4, 0, bArr);
        } else if (i == 3) {
            blcVar = new blc(i5, i4, 1, bArr);
        } else {
            if (i != 4) {
                ore.p(c0a.k(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
                return;
            }
            blcVar = new clc(bArr, i4, i5);
        }
        for (n3k n3kVar : (CopyOnWriteArraySet) this.b) {
            if (n3kVar.c < jElapsedRealtime) {
                n3kVar.c = n3kVar.b + jElapsedRealtime;
                n3kVar.a.onSample(i, i2, i3, blcVar);
            }
        }
    }

    @Override // defpackage.vtj
    public void p(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        xtj xtjVar;
        sp[] spVarArr = (sp[]) this.b;
        xtj[] xtjVarArr = new xtj[spVarArr.length];
        vu8Var.r();
        int length = spVarArr.length;
        for (int i = 0; i < length; i++) {
            sp spVar = spVarArr[i];
            vu8Var.p();
            String strName = vu8Var.name();
            int iHashCode = strName.hashCode();
            if (iHashCode != 3548) {
                if (iHashCode == 3135262 && strName.equals("fail")) {
                    xtjVar = new xtj(spVar, new tp());
                } else {
                    vu8Var.x();
                    xtjVar = new xtj(spVar, (Object) null);
                }
            } else if (strName.equals("ok")) {
                xtjVar = new xtj(spVar, spVar.b.getOkParser().parse(new yp3(vu8Var)));
            } else {
                vu8Var.x();
                xtjVar = new xtj(spVar, (Object) null);
            }
            vu8Var.t();
            xtjVarArr[i] = xtjVar;
        }
        vu8Var.q();
        return new tt0(xtjVarArr);
    }

    @Override // defpackage.xo
    public void s(uo uoVar) {
        this.b = uoVar;
    }

    @Override // defpackage.z4a
    public boolean t(MediaPlayer mediaPlayer, Context context) {
        try {
            mediaPlayer.setDataSource(context, (Uri) this.b);
            return true;
        } catch (IOException e) {
            gm0.X("SettingRingtoneViewModel", e, e.getMessage(), new Object[0]);
            return false;
        } catch (IllegalStateException e2) {
            gm0.X("SettingRingtoneViewModel", new MediaSource$SoundConfigException(e2), e2.getMessage(), new Object[0]);
            return false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return b1k.class.getSimpleName() + ":" + ((String) this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zs3
    public boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        zs3 zs3Var = ((dka) this.b).d;
        if (zs3Var != null) {
            return zs3Var.u(clickableSpan, i, i2, str, t59Var, motionEvent);
        }
        return false;
    }

    @Override // defpackage.wba
    public void w(yba ybaVar) {
        i1m i1mVar = ((ActionMenuView) this.b).u;
        if (i1mVar != null) {
            i1mVar.w(ybaVar);
        }
    }

    public void x(Object obj, String str) {
        StringBuilder sb = (StringBuilder) this.b;
        if (sb.length() > 0) {
            sb.append('&');
        }
        sb.append(str);
        sb.append('=');
        sb.append(UrlEncoder.encodeUtf8(obj));
    }

    public b1k(RTCStatsReport rTCStatsReport) {
        this.a = 28;
        rTCStatsReport.getClass();
        this.b = rTCStatsReport;
    }

    public b1k(CidLogger cidLogger) {
        this.a = 7;
        cidLogger.getClass();
        this.b = cidLogger;
    }

    public b1k(vu3 vu3Var) {
        this.a = 9;
        wj8.a(vu3Var, "output");
        this.b = vu3Var;
        vu3Var.a = this;
    }

    public b1k(int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new xe7(5, 1.0f, false);
                break;
            case 19:
                this.b = (ExtraCroppingQuirk) uk5.a(ExtraCroppingQuirk.class);
                break;
            case 21:
                this.b = new CopyOnWriteArraySet();
                break;
            case 25:
                this.b = new StringBuilder();
                break;
        }
    }

    public /* synthetic */ b1k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
