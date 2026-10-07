package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class hj2 extends FrameLayout implements oc2 {
    public final Executor a;
    public final ghd b;
    public final p09 c;
    public final wf2 d;
    public final ifh e;
    public zf2 f;
    public fee g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean j;

    public hj2(Context context) {
        super(context, null, 0, 0);
        this.a = np4.o(context);
        ghd ghdVar = new ghd(context);
        this.b = ghdVar;
        p09 p09Var = new p09(context);
        this.c = p09Var;
        wf2 wf2Var = new wf2();
        this.d = wf2Var;
        this.e = new ifh(new yk1(17, this));
        ghdVar.setKeepScreenOn(true);
        addView(ghdVar, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels + getStatusBarHeight()));
        ghdVar.getPreviewStreamState().e(wf2Var, new ij2(new j22(3, this)));
        ghdVar.setImplementationMode(dhd.COMPATIBLE);
        p09Var.n(fh2.c);
        p09Var.o(1);
        dne dneVar = new dne(ww6.d, new ene(new Size(1920, 1080)), null);
        wxl.a();
        if (p09Var.f != dneVar) {
            p09Var.f = dneVar;
            wxl.a();
            Integer numValueOf = Integer.valueOf(p09Var.e.u);
            p09Var.v();
            int iL = p09Var.e.L();
            p09Var.e = p09Var.e(numValueOf);
            p09Var.p(iL);
            p09Var.t(null);
        }
        ghdVar.getViewPort();
        wxl.a();
        p09Var.y = true;
        ghdVar.setController(p09Var);
    }

    private final ih2 getCameraStateType() {
        b99 b99VarB;
        wg0 wg0Var;
        p09 p09Var = this.c;
        p09Var.getClass();
        wxl.a();
        o09 o09Var = p09Var.q;
        nf2 nf2VarA = o09Var == null ? null : o09Var.a();
        if (nf2VarA == null || (b99VarB = ((r97) nf2VarA).a.b()) == null || (wg0Var = (wg0) b99VarB.d()) == null) {
            return null;
        }
        return wg0Var.a;
    }

    public final sd7 getFreezeCameraDetector() {
        return (sd7) this.e.getValue();
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        Insets insets;
        Window window;
        Context context = getContext();
        View decorView = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = new Rect();
            if (decorView != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            return rect.top;
        }
        if (decorView == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (insets = rootWindowInsets.getInsets(1)) == null) {
            return 0;
        }
        return insets.top;
    }

    public final void b(IssueKeyException issueKeyException) {
        zf2 zf2Var = this.f;
        if (zf2Var != null) {
            ((ft0) zf2Var).y(new CameraExceptionImpl(issueKeyException));
        }
    }

    public final void c() {
        try {
            this.c.o(1);
        } catch (IllegalStateException e) {
            b(new zi2(e));
        }
    }

    public final void d() {
        String name = hj2.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "startPreviewCamera " + Thread.currentThread(), null);
            }
        }
        if (this.h) {
            return;
        }
        this.h = true;
        try {
            p09 p09Var = this.c;
            wf2 wf2Var = this.d;
            p09Var.getClass();
            wxl.a();
            p09Var.L = wf2Var;
            p09Var.t(null);
        } catch (IllegalStateException e) {
            this.h = false;
            this.j = false;
            gm0.V(hj2.class.getName(), "failed to bind camera controller, start preview aborted", e);
            this.c.x();
            zf2 zf2Var = this.f;
            if (zf2Var != null) {
                ((ft0) zf2Var).y(new CameraExceptionImpl(e));
            }
        }
        if (this.h) {
            this.d.e();
        }
    }

    public final void e() {
        gm0.n(hj2.class.getName(), "stopPreviewCamera");
        this.h = false;
        this.j = false;
        wf2 wf2Var = this.d;
        Handler handler = wf2Var.b;
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            wf2Var.a.d(m09.ON_STOP);
        } else {
            handler.post(new vf2(wf2Var, 3));
        }
        if (this.e.d()) {
            getFreezeCameraDetector().a();
        }
    }

    public final void f(uvc uvcVar, ew5 ew5Var) {
        String strName;
        long j = ew5Var.a;
        je9 je9Var = je9.d;
        gm0.n(hj2.class.getName(), "takePicture");
        if (!this.h) {
            b(new bj2());
            return;
        }
        ih2 cameraStateType = getCameraStateType();
        String name = hj2.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, qv1.k("camera state ", cameraStateType != null ? cameraStateType.name() : null), null);
        }
        if (cameraStateType != ih2.c && cameraStateType != ih2.b) {
            ih2 cameraStateType2 = getCameraStateType();
            if (cameraStateType2 == null || (strName = cameraStateType2.name()) == null) {
                strName = "null";
            }
            b(new dj2("Camera state: ".concat(strName)));
            return;
        }
        n09 n09Var = this.d.a.d;
        if (!n09Var.a(n09.e)) {
            b(new cj2(qv1.k("Lifecycle state: ", n09Var.name())));
            return;
        }
        if (this.i) {
            gm0.V(hj2.class.getName(), "Camera is capturing", new xi2());
            return;
        }
        this.i = true;
        p09 p09Var = this.c;
        Executor executor = this.a;
        String name2 = uvc.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name2, qv1.k("Provide executor for ", ((fg2) uvcVar.c).name()), null);
        }
        int iOrdinal = ((fg2) uvcVar.c).ordinal();
        if (iOrdinal == 0) {
            executor = (ExecutorService) uvcVar.b;
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        }
        gj2 gj2Var = new gj2(this, j, 0);
        p09Var.getClass();
        wxl.a();
        qyj.l("Camera not initialized.", p09Var.r != null);
        wxl.a();
        qyj.l("ImageCapture disabled.", (p09Var.b & 1) != 0);
        wxl.a();
        if (p09Var.e.L() == 3 && (p09Var.i() == null || p09Var.i().b == null)) {
            ore.k("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        } else {
            p09Var.e.O(executor, gj2Var);
        }
    }

    @Override // android.view.View
    public View getRootView() {
        return this;
    }

    public void setCameraListener(zf2 zf2Var) {
        this.f = zf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    public void setFlash(String str) {
        int i;
        p09 p09Var;
        int iD;
        int i2 = 2;
        if (str != null) {
            if (str.equals("OFF")) {
                i = 1;
            } else if (str.equals("ON")) {
                i = 2;
            } else if (str.equals("AUTO")) {
                i = 3;
            } else if (str.equals("TORCH")) {
                i = 4;
            } else {
                ore.p("No enum constant ru.ok.tamtam.android.widgets.quickcamera.CameraApi.Flash.".concat(str));
            }
            p09Var = this.c;
            p09Var.getClass();
            wxl.a();
            if ((p09Var.b & 4) != 0) {
                p09Var.h(i == 4);
                return;
            }
            iD = qt4.D(i);
            if (iD != 0) {
                if (iD == 1) {
                    i2 = 1;
                } else {
                    if (iD == 2 && iD != 3) {
                        ore.o();
                        return;
                    }
                    i2 = 0;
                }
            }
            p09Var.p(i2);
        }
        ore.n("Name is null");
        i = 0;
        p09Var = this.c;
        p09Var.getClass();
        wxl.a();
        if ((p09Var.b & 4) != 0) {
            p09Var.h(i == 4);
            return;
        }
        iD = qt4.D(i);
        if (iD != 0) {
            if (iD == 1) {
                if (iD == 2) {
                }
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        p09Var.p(i2);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setPictureSize(w1e w1eVar) {
    }

    public void setVideoQuality(j3j j3jVar) {
        int iOrdinal = j3jVar.ordinal();
        p09 p09Var = this.c;
        switch (iOrdinal) {
            case 0:
                pi0 pi0Var = pi0.i;
                m1e m1eVar = m1e.c;
                p09Var.q(m1e.a(pi0Var, mh0.c));
                break;
            case 1:
                pi0 pi0Var2 = pi0.j;
                m1e m1eVar2 = m1e.c;
                p09Var.q(m1e.a(pi0Var2, mh0.c));
                break;
            case 2:
                pi0 pi0Var3 = pi0.i;
                m1e m1eVar3 = m1e.c;
                p09Var.q(m1e.a(pi0Var3, mh0.c));
                break;
            case 3:
                pi0 pi0Var4 = pi0.e;
                m1e m1eVar4 = m1e.c;
                p09Var.q(m1e.a(pi0Var4, mh0.c));
                break;
            case 4:
                pi0 pi0Var5 = pi0.f;
                m1e m1eVar5 = m1e.c;
                p09Var.q(m1e.a(pi0Var5, mh0.c));
                break;
            case 5:
                pi0 pi0Var6 = pi0.g;
                m1e m1eVar6 = m1e.c;
                p09Var.q(m1e.a(pi0Var6, mh0.c));
                break;
            case 6:
                pi0 pi0Var7 = pi0.h;
                m1e m1eVar7 = m1e.c;
                p09Var.q(m1e.a(pi0Var7, mh0.c));
                break;
            default:
                ore.o();
                break;
        }
    }
}
