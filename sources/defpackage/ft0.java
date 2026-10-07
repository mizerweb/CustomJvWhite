package defpackage;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.ContentInfo;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;
import one.me.chatmedia.viewer.video.BaseVideoViewerWidget;
import one.me.settings.multilang.LocaleBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;

/* JADX INFO: loaded from: classes2.dex */
public class ft0 implements q5j, zf2, zc0, ine, rg4, ph6, v7h, i8c, btb, wo4, kg7, x18, aqg, qsf, xcj, qlg {
    public Object a;

    public ft0(zo4 zo4Var) {
        f82.r();
        ContentInfo contentInfoA = zo4Var.a.a();
        Objects.requireNonNull(contentInfoA);
        this.a = f82.l(f82.n(contentInfoA));
    }

    public static ft0 t() {
        return new ft0();
    }

    public void A(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ((Handler) this.a).post(new yde(this, 7, runnable));
        } else {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    public void B(String str, Bundle bundle) {
        if (str != null && ((str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) && (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)))) {
            ore.p(c0a.o("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        } else {
            ((MediaController.TransportControls) this.a).sendCustomAction(str, bundle);
        }
    }

    public void C(float f) {
        if (f == 0.0f) {
            ore.p("speed must not be zero");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, f);
        B(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED, bundle);
    }

    public bwd D() {
        if (((ceg) this.a) == null) {
            xy8.b.current();
            this.a = bwd.b.a;
        }
        ceg cegVar = (ceg) this.a;
        if (cegVar != null) {
            return new bwd(cegVar);
        }
        Logger logger = gq.a;
        Level level = Level.FINEST;
        Logger logger2 = gq.a;
        if (logger2.isLoggable(level)) {
            logger2.log(level, "context is null", (Throwable) new AssertionError());
        }
        return bwd.b;
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((qhg) this.a).invoke(Integer.valueOf(i));
        }
        return null;
    }

    @Override // defpackage.qlg
    public void M(tlg tlgVar) {
        nng nngVar = nng.b;
        long j = tlgVar.a;
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
        zv8[] zv8VarArr = StickersSearchScreen.l;
        vv vvVar = stickersSearchScreen.a;
        zv8 zv8Var = StickersSearchScreen.l[0];
        long jLongValue = ((Number) vvVar.a(stickersSearchScreen)).longValue();
        o65 o65VarB = nngVar.b();
        StringBuilder sbS = qt4.s(j, ":stickers/preview?sticker_id=", "&chat_id=");
        sbS.append(jLongValue);
        o65.c(o65VarB, sbS.toString(), null, null, 6);
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        ((sl8) vpgVar).d.setText((CharSequence) G(i));
    }

    @Override // defpackage.qlg
    public void T(tlg tlgVar) {
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
        g4b g4bVarJ = ((h4b) stickersSearchScreen.d.getValue()).J(9);
        vng vngVarP1 = stickersSearchScreen.p1();
        long j = vngVarP1.c;
        if (j <= 0) {
            ((h4b) vngVarP1.g.getValue()).B(f4b.EMPTY_CHAT, g4bVarJ);
        } else {
            vkf vkfVar = new vkf(1, j, tlgVar.a);
            vkfVar.g = g4bVarJ;
            ((wzj) vngVarP1.f.getValue()).c(new wkf(vkfVar, (byte) 0));
            a8j.x(vngVarP1.j, rt3.b);
        }
        ia8 ia8Var = (ia8) stickersSearchScreen.b.getAccessor().f();
        if (ia8Var != null) {
            ia8Var.f(a.p1(new ha8[]{new ha8(fa8.SEND_5_MESSAGES, 1), new ha8(fa8.SEND_3_STICKERS, 1)}), y3f.CHAT);
        }
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        r72 r72Var = (r72) this.a;
        try {
            r72Var.b(obj);
        } catch (Throwable th) {
            r72Var.d(th);
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        ((zi1) this.a).b.reportException("CallFinishHandler", "BitrateDumpFileSendTrigger handling failed. reason " + th, th);
    }

    @Override // defpackage.wo4
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.a).setLinkUri(uri);
    }

    @Override // defpackage.wo4
    public zo4 build() {
        return new zo4(new rj5(((ContentInfo.Builder) this.a).build()));
    }

    @Override // defpackage.qsf
    public void c(long j) {
        LocaleBottomSheet localeBottomSheet = (LocaleBottomSheet) this.a;
        int i = LocaleBottomSheet.z;
        String str = localeBottomSheet.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "onSettingsItemClick: id: "), null);
            }
        }
        LocaleBottomSheet.F1((LocaleBottomSheet) this.a, j);
        ((LocaleBottomSheet) this.a).v1(true);
    }

    @Override // defpackage.ine
    public void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((qx0) this.a).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    @Override // defpackage.v7h
    public int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.zc0
    public void f(float f) {
        ha0 ha0Var = (ha0) this.a;
        Long l = ha0Var.G;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = ha0Var.F;
            if (l2 != null) {
                ha0Var.a.invoke(new ena(l2.longValue(), (long) (f * jLongValue), jLongValue));
            }
        }
    }

    @Override // defpackage.ph6
    public w8b g() {
        throw null;
    }

    @Override // defpackage.x18
    public long getContentLength() {
        return ((File) this.a).length();
    }

    @Override // defpackage.x18
    public String getContentType() {
        return "application/octet-stream";
    }

    @Override // defpackage.v7h
    public List h(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.wo4
    public void i(ClipData clipData) {
        ((ContentInfo.Builder) this.a).setClip(clipData);
    }

    @Override // defpackage.q5j
    public boolean isDebugEnabled() {
        BaseVideoViewerWidget baseVideoViewerWidget = (BaseVideoViewerWidget) this.a;
        if (((xb9) ((et3) baseVideoViewerWidget.f.getValue())).g0()) {
            return ((Boolean) ((e5d) baseVideoViewerWidget.h.getValue()).x().i()).booleanValue();
        }
        ((wxb) baseVideoViewerWidget.g.getValue()).getClass();
        return false;
    }

    @Override // defpackage.zc0
    public void j(float f) {
        ha0 ha0Var = (ha0) this.a;
        if (((Boolean) ha0Var.b.invoke()).booleanValue()) {
            return;
        }
        ha0Var.r.f(f, true, true);
    }

    @Override // defpackage.q5j
    public int k() {
        rui ruiVar = ((BaseVideoViewerWidget) this.a).e;
        if (ruiVar != null) {
            return ruiVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.qsf
    public void l(long j, boolean z) {
        je9 je9Var = je9.d;
        LocaleBottomSheet localeBottomSheet = (LocaleBottomSheet) this.a;
        int i = LocaleBottomSheet.z;
        String str = localeBottomSheet.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, bc1.l(j, "onSwitchClick: id: ", ", isChecked: ", z), null);
        }
        if (z) {
            String str2 = ((LocaleBottomSheet) this.a).m;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.j(j, "onSwitchClick: id: "), null);
            }
            LocaleBottomSheet.F1((LocaleBottomSheet) this.a, j);
        }
        ((LocaleBottomSheet) this.a).v1(true);
    }

    @Override // defpackage.v7h
    public long m(int i) {
        lvb.R(i == 0);
        return 0L;
    }

    @Override // defpackage.q5j
    public int n() {
        rui ruiVar = ((BaseVideoViewerWidget) this.a).e;
        if (ruiVar != null) {
            return ruiVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.v7h
    public int o() {
        return 1;
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        ((r72) this.a).d(th);
    }

    @Override // defpackage.q5j
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = ft0.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "Base Media viewer. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        return new sl8(new AppCompatTextView(viewGroup.getContext()));
    }

    public jc2 r() {
        return new jc2(dhc.a((w8b) this.a));
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        rw3 rw3Var = (rw3) this.a;
        WeakHashMap weakHashMap = i7j.a;
        ixj ixjVar2 = rw3Var.getFitsSystemWindows() ? ixjVar : null;
        if (!Objects.equals(rw3Var.A, ixjVar2)) {
            rw3Var.A = ixjVar2;
            rw3Var.requestLayout();
        }
        return ixjVar.a.c();
    }

    @Override // defpackage.wo4
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.a).setExtras(bundle);
    }

    @Override // defpackage.wo4
    public void setFlags(int i) {
        ((ContentInfo.Builder) this.a).setFlags(i);
    }

    public void u(t94 t94Var) {
        for (bh0 bh0Var : t94Var.c()) {
            ((w8b) this.a).l(bh0Var, t94Var.g(bh0Var), t94Var.i(bh0Var));
        }
    }

    @Override // defpackage.q5j
    public int v() {
        return 2;
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        ((r1g) ((ji3) this.a)).b.invoke(j8cVar);
    }

    @Override // defpackage.x18
    public void writeTo(OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.a);
        try {
            egl.a(fileInputStream, outputStream);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.q5j
    public void x(Surface surface, uvi uviVar) {
        e3j e3jVarW0;
        String name = ft0.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Base Media viewer. Video viewer, set surface " + surface, null);
            }
        }
        BaseVideoViewerWidget baseVideoViewerWidget = (BaseVideoViewerWidget) this.a;
        zv8[] zv8VarArr = BaseVideoViewerWidget.j;
        a6j a6jVarQ1 = baseVideoViewerWidget.q1();
        if (a6jVarQ1 == null || (e3jVarW0 = a6jVarQ1.w0()) == null) {
            return;
        }
        e3jVarW0.H(surface);
        e3jVarW0.C(uviVar);
    }

    public void y(CameraExceptionImpl cameraExceptionImpl) {
        Object value;
        n2e n2eVar = ((k2e) this.a).d;
        Object obj = null;
        if (n2eVar == null) {
            n2eVar = null;
        }
        n2eVar.getClass();
        gm0.V("QuickCameraViewModel", "onCameraError", new m2e(cameraExceptionImpl.getCause()));
        mjg mjgVar = n2eVar.m;
        b2e b2eVar = (b2e) mjgVar.getValue();
        boolean zD = cqk.d(b2eVar, y1e.a);
        x1e x1eVar = x1e.a;
        if (zD) {
            obj = x1eVar;
        } else {
            boolean z = b2eVar instanceof z1e;
            a2e a2eVar = a2e.a;
            if (z) {
                obj = a2eVar;
            } else if (!cqk.d(b2eVar, x1eVar) && !cqk.d(b2eVar, a2eVar)) {
                ore.o();
                return;
            }
        }
        if (obj != null) {
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, obj));
        }
    }

    public void z() {
        long j;
        w15 w15Var = (w15) this.a;
        synchronized (gpk.b) {
            try {
                j = gpk.c ? gpk.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        w15Var.K = j;
        w15Var.A(true);
    }

    public ft0() {
        this.a = w8b.e();
    }

    public ft0(ClipData clipData, int i) {
        this.a = f82.k(clipData, i);
    }

    public /* synthetic */ ft0(Object obj) {
        this.a = obj;
    }
}
