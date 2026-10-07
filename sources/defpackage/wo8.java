package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wo8 extends up8 {
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x003d  */
    public wo8(vo8 vo8Var) {
        super(true);
        boolean z = true;
        N(vo8Var);
        vp3 vp3VarH = H();
        wp3 wp3Var = vp3VarH instanceof wp3 ? (wp3) vp3VarH : null;
        if (wp3Var == null) {
            z = false;
            break;
        }
        up8 up8Var = wp3Var.g;
        up8Var = up8Var == null ? null : up8Var;
        if (up8Var == null) {
            z = false;
            break;
        }
        while (!up8Var.C()) {
            vp3 vp3VarH2 = up8Var.H();
            wp3 wp3Var2 = vp3VarH2 instanceof wp3 ? (wp3) vp3VarH2 : null;
            if (wp3Var2 != null) {
                up8Var = wp3Var2.g;
                if (up8Var == null) {
                    up8Var = null;
                }
                if (up8Var == null) {
                }
            }
            z = false;
        }
        this.e = z;
    }

    @Override // defpackage.up8
    public final boolean C() {
        return this.e;
    }

    @Override // defpackage.up8
    public final boolean F() {
        return true;
    }

    public final void j0() {
        Q(sbi.a);
    }
}
