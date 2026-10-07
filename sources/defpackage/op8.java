package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class op8 extends gp8 {
    public final tdf h;
    public final /* synthetic */ up8 i;

    public op8(up8 up8Var, tdf tdfVar) {
        this.i = up8Var;
        this.h = tdfVar;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return false;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        up8 up8Var = this.i;
        Object objJ = up8Var.J();
        if (!(objJ instanceof s64)) {
            objJ = rx8.m0(objJ);
        }
        ((sdf) this.h).l(up8Var, objJ);
    }
}
