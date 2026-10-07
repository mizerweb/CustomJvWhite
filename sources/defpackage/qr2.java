package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr2 extends mr2 {
    public final xx6 d;

    public qr2(int i, int i2, vt4 vt4Var, xx6 xx6Var) {
        super(vt4Var, i, i2);
        this.d = xx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[RETURN] */
    @Override // defpackage.mr2, defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect;
        int i = this.b;
        hu4 hu4Var = hu4.a;
        if (i == -3) {
            vt4 context = lq4Var.getContext();
            Boolean bool = Boolean.FALSE;
            dz dzVar = new dz(5);
            vt4 vt4Var = this.a;
            vt4 vt4VarU0 = !((Boolean) vt4Var.E(bool, dzVar)).booleanValue() ? context.u0(vt4Var) : n1g.w(context, vt4Var, false);
            if (cqk.d(vt4VarU0, context)) {
                Object objL = l(yx6Var, lq4Var);
                if (objL == hu4Var) {
                    return objL;
                }
            } else {
                khb khbVar = khb.f;
                if (cqk.d(vt4VarU0.x0(khbVar), context.x0(khbVar))) {
                    Object objD = xkl.d(vt4VarU0, xkl.a(yx6Var, lq4Var.getContext()), new qt1(this, null, 22), lq4Var);
                    if (objD == hu4Var) {
                        return objD;
                    }
                } else {
                    objCollect = super.collect(yx6Var, lq4Var);
                    if (objCollect == hu4Var) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(yx6Var, lq4Var);
            if (objCollect == hu4Var) {
                return objCollect;
            }
        }
        return sbi.a;
    }

    @Override // defpackage.mr2
    public final Object f(njd njdVar, lq4 lq4Var) {
        Object objL = l(new mhf(njdVar), lq4Var);
        return objL == hu4.a ? objL : sbi.a;
    }

    public abstract Object l(yx6 yx6Var, lq4 lq4Var);

    @Override // defpackage.mr2
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
