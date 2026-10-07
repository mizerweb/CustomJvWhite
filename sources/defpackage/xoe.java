package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xoe extends gp8 {
    public final lp8 h;

    public xoe(lp8 lp8Var) {
        this.h = lp8Var;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return false;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        up8 up8Var = this.g;
        if (up8Var == null) {
            up8Var = null;
        }
        Object objJ = up8Var.J();
        boolean z = objJ instanceof s64;
        lp8 lp8Var = this.h;
        if (z) {
            lp8Var.resumeWith(new poe(((s64) objJ).a));
        } else {
            lp8Var.resumeWith(rx8.m0(objJ));
        }
    }
}
