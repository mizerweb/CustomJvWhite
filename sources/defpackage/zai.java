package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends s3f {
    public final ThreadLocal g;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public zai(lq4 lq4Var, vt4 vt4Var) {
        ure ureVar = ure.c;
        super(lq4Var, vt4Var.x0(ureVar) == null ? vt4Var.u0(ureVar) : vt4Var);
        this.g = new ThreadLocal();
        if (lq4Var.getContext().x0(khb.f) instanceof xt4) {
            return;
        }
        Object objI = np4.I(vt4Var, null);
        np4.A(vt4Var, objI);
        s0(vt4Var, objI);
    }

    @Override // defpackage.s3f
    public final void n0() {
        q0();
    }

    @Override // defpackage.s3f, defpackage.up8
    public final void o(Object obj) {
        q0();
        Object objE = cqk.E(obj);
        lq4 lq4Var = this.f;
        vt4 context = lq4Var.getContext();
        Object objI = np4.I(context, null);
        zai zaiVarF0 = objI != np4.d ? n1g.f0(lq4Var, context, objI) : null;
        try {
            lq4Var.resumeWith(objE);
        } finally {
            if (zaiVarF0 == null || zaiVarF0.p0()) {
                np4.A(context, objI);
            }
        }
    }

    public final boolean p0() {
        boolean z = this.threadLocalIsSet && this.g.get() == null;
        this.g.remove();
        return !z;
    }

    public final void q0() {
        if (this.threadLocalIsSet) {
            ylc ylcVar = (ylc) this.g.get();
            if (ylcVar != null) {
                np4.A((vt4) ylcVar.a, ylcVar.b);
            }
            this.g.remove();
        }
    }

    public final void s0(vt4 vt4Var, Object obj) {
        this.threadLocalIsSet = true;
        this.g.set(new ylc(vt4Var, obj));
    }
}
