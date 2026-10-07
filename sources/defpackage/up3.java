package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class up3 extends gp8 {
    public final ek2 h;

    public up3(ek2 ek2Var) {
        this.h = ek2Var;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return true;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        up8 up8Var = this.g;
        if (up8Var == null) {
            up8Var = null;
        }
        ek2 ek2Var = this.h;
        Throwable thQ = ek2Var.q(up8Var);
        if (!ek2Var.y() ? false : ((sn5) ek2Var.d).o(thQ)) {
            return;
        }
        ek2Var.n(thQ);
        if (ek2Var.y()) {
            return;
        }
        ek2Var.o();
    }
}
