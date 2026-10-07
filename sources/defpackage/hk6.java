package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.WindowManager;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class hk6 {
    public static final /* synthetic */ zv8[] k;
    public final ha9 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public ev1 i;
    public final p3c j = qyj.S();

    static {
        z8b z8bVar = new z8b(hk6.class, "pipStateJob", "getPipStateJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public hk6(j1d j1dVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ha9 ha9Var) {
        this.a = ha9Var;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = rx8.P(3, new x5(j1dVar, 13, this));
    }

    public final ev1 a(MainActivity mainActivity, hve hveVar) {
        ev1 ev1Var = new ev1(mainActivity, this.a);
        ev1Var.setPipTheme(pq3.j.l(ev1Var).b);
        ev1Var.setPipMode(bv1.c);
        ev1Var.setApplicationPipDepended(new r6a(this, ev1Var, mainActivity));
        ev1Var.setListener(new gk6(hveVar));
        ev1Var.setVideoLayoutUpdatesControllerProvider(new mp5(3, this));
        return ev1Var;
    }

    public final i1d b() {
        return (i1d) this.h.getValue();
    }

    public final WindowManager c() {
        Context context;
        ev1 ev1Var = this.i;
        if (ev1Var == null || (context = ev1Var.getContext()) == null) {
            return null;
        }
        return sb8.M(context);
    }

    public final void d() {
        gm0.n("FakePipController", "try to hide local pip");
        ev1 ev1Var = this.i;
        if (ev1Var == null) {
            return;
        }
        if (!isk.g(ev1Var)) {
            gm0.n("FakePipController", "local pip in hidden progress");
            return;
        }
        okg okgVar = (okg) this.b.getValue();
        String strA = ns4.a(((f62) ((n42) ((k42) this.f.getValue())).f.a.getValue()).i);
        mjg mjgVar = okgVar.a;
        if (mjgVar.getValue() == nkg.b) {
            okgVar.a(strA, false);
        }
        mjgVar.j(null, nkg.a);
        isk.c(ev1Var, false, 50L, new w14(this, 16, ev1Var));
    }

    public final void e(MainActivity mainActivity, hve hveVar) {
        gm0.n("FakePipController", "start preparing local pip");
        try {
            if (this.i != null) {
                gm0.n("FakePipController", "local pip already prepared");
                return;
            }
            ev1 ev1VarA = a(mainActivity, hveVar);
            this.i = ev1VarA;
            ev1VarA.setAlpha(0.0f);
            ev1VarA.d((qgc) b().f().a.getValue());
            WindowManager windowManagerC = c();
            if (windowManagerC != null) {
                WindowManager.LayoutParams windowsViewLayoutParams = ev1VarA.getWindowsViewLayoutParams();
                PointF pointFE = ((rn1) ((qn1) this.c.getValue())).e();
                k4f k4fVarO = f55.o(mainActivity);
                int iK = gm0.K(l1d.a().b() * yl5.d().getDisplayMetrics().density);
                int iK2 = gm0.K(l1d.a().a() * yl5.d().getDisplayMetrics().density);
                windowsViewLayoutParams.x = oc9.v((int) pointFE.x, 0, k4fVarO.b - iK);
                windowsViewLayoutParams.y = oc9.v((int) pointFE.y, 0, k4fVarO.a - iK2);
                windowManagerC.addView(ev1VarA, windowsViewLayoutParams);
            }
            b().a(ev1VarA);
            this.j.B(this, k[0], yab.i0((y82) this.d.getValue(), ((n0c) ((xhh) this.e.getValue())).c(), 0, new qy3(this, null, 17), 2));
            ((bn1) this.g.getValue()).a(ev1VarA);
        } catch (IllegalArgumentException e) {
            gm0.V("FakePipController", "can't prepare local pip", e);
        }
    }
}
