package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp8 extends gp8 {
    public final up8 h;
    public final np8 i;
    public final wp3 j;
    public final Object k;

    public mp8(up8 up8Var, np8 np8Var, wp3 wp3Var, Object obj) {
        this.h = up8Var;
        this.i = np8Var;
        this.j = wp3Var;
        this.k = obj;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return false;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        wp3 wp3Var = this.j;
        wp3 wp3VarT = up8.T(wp3Var);
        up8 up8Var = this.h;
        np8 np8Var = this.i;
        Object obj = this.k;
        if (wp3VarT == null || !up8Var.i0(np8Var, wp3VarT, obj)) {
            np8Var.a.c(new e79(2), 2);
            wp3 wp3VarT2 = up8.T(wp3Var);
            if (wp3VarT2 == null || !up8Var.i0(np8Var, wp3VarT2, obj)) {
                up8Var.n(up8Var.x(np8Var, obj));
            }
        }
    }
}
