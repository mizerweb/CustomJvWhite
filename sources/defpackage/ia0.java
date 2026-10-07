package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements axd {
    public final /* synthetic */ ka0 a;

    public ia0(ka0 ka0Var) {
        this.a = ka0Var;
    }

    @Override // defpackage.axd
    public final void a() {
        ka0 ka0Var = this.a;
        w7b w7bVar = ka0Var.a;
        if (ka0.c(ka0Var)) {
            return;
        }
        xte xteVar = w7bVar.a;
        xteVar.getClass();
        p70 p70Var = new p70(1, 0, 2, 1, 0, false, true);
        iu9 iu9Var = xteVar.g;
        if (iu9Var != null) {
            iu9Var.T(p70Var, false);
        }
        ka0Var.b.c();
        long jLongValue = ((Number) w7bVar.a.n.a.getValue()).longValue() - 1000;
        xte xteVar2 = w7bVar.a;
        yab.i0(xteVar2.d, null, 0, new tl1(xteVar2, jLongValue, null, 7), 3);
    }

    @Override // defpackage.axd
    public final void b() {
        ka0 ka0Var = this.a;
        w7b w7bVar = ka0Var.a;
        if (ka0.c(ka0Var)) {
            return;
        }
        xte xteVar = w7bVar.a;
        xteVar.getClass();
        p70 p70Var = new p70(1, 0, 1, 1, 0, false, true);
        iu9 iu9Var = xteVar.g;
        if (iu9Var != null) {
            iu9Var.T(p70Var, false);
        }
        ka0Var.b.d();
        w7bVar.b();
    }
}
