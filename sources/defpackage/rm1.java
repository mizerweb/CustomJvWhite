package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rm1 implements f22 {
    public final /* synthetic */ ym1 a;

    public rm1(ym1 ym1Var) {
        this.a = ym1Var;
    }

    @Override // defpackage.f22
    public final void i(String str) {
        ym1 ym1Var = this.a;
        f62 f62Var = (f62) ((n42) ym1Var.a).f.a.getValue();
        boolean zA = ed8.a(f62Var.k);
        if (!(f62Var.k instanceof hi6) || f62Var.l || !zA) {
            ym1Var.o(false);
            return;
        }
        sgg sggVar = ym1Var.w;
        if (sggVar == null || !sggVar.isActive()) {
            ym1Var.w = yab.i0(ym1Var.v, null, 0, new um1(ym1Var, null, 0), 3);
        }
    }

    @Override // defpackage.f22
    public final void l() {
        this.a.y(false);
    }

    @Override // defpackage.f22
    public final void m(String str) {
        this.a.u = false;
    }
}
