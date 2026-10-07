package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class uwj extends xwj {
    public final WindowInsets.Builder c;

    public uwj(ixj ixjVar) {
        super(ixjVar);
        WindowInsets windowInsetsF = ixjVar.f();
        this.c = windowInsetsF != null ? j4f.g(windowInsetsF) : j4f.f();
    }

    @Override // defpackage.xwj
    public ixj b() {
        a();
        ixj ixjVarG = ixj.g(this.c.build(), null);
        ixjVarG.a.p(this.b);
        return ixjVarG;
    }

    @Override // defpackage.xwj
    public void d(mi8 mi8Var) {
        this.c.setMandatorySystemGestureInsets(mi8Var.d());
    }

    @Override // defpackage.xwj
    public void e(mi8 mi8Var) {
        this.c.setStableInsets(mi8Var.d());
    }

    @Override // defpackage.xwj
    public void f(mi8 mi8Var) {
        this.c.setSystemGestureInsets(mi8Var.d());
    }

    @Override // defpackage.xwj
    public void g(mi8 mi8Var) {
        this.c.setSystemWindowInsets(mi8Var.d());
    }

    @Override // defpackage.xwj
    public void h(mi8 mi8Var) {
        this.c.setTappableElementInsets(mi8Var.d());
    }

    public uwj() {
        this.c = j4f.f();
    }
}
