package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp8 extends ek2 {
    public final up8 k;

    public lp8(lq4 lq4Var, up8 up8Var) {
        super(1, lq4Var);
        this.k = up8Var;
    }

    @Override // defpackage.ek2
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.ek2
    public final Throwable q(up8 up8Var) {
        Throwable thD;
        Object objJ = this.k.J();
        if (!(objJ instanceof np8) || (thD = ((np8) objJ).d()) == null) {
            return objJ instanceof s64 ? ((s64) objJ).a : up8Var.A();
        }
        return thD;
    }
}
