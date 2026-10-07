package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nq4 extends mq0 {
    public final vt4 b;
    public transient lq4 c;

    public nq4(lq4 lq4Var) {
        this(lq4Var, lq4Var != null ? lq4Var.getContext() : null);
    }

    @Override // defpackage.lq4
    public vt4 getContext() {
        return this.b;
    }

    public final lq4 intercepted() {
        lq4 lq4Var = this.c;
        if (lq4Var != null) {
            return lq4Var;
        }
        xt4 xt4Var = (xt4) getContext().x0(khb.f);
        lq4 sn5Var = xt4Var != null ? new sn5(xt4Var, this) : this;
        this.c = sn5Var;
        return sn5Var;
    }

    @Override // defpackage.mq0
    public void releaseIntercepted() {
        lq4 lq4Var = this.c;
        if (lq4Var != null && lq4Var != this) {
            ((xt4) getContext().x0(khb.f)).getClass();
            sn5 sn5Var = (sn5) lq4Var;
            sn5Var.i();
            ek2 ek2VarL = sn5Var.l();
            if (ek2VarL != null) {
                ek2VarL.o();
            }
        }
        this.c = r64.b;
    }

    public nq4(lq4 lq4Var, vt4 vt4Var) {
        super(lq4Var);
        this.b = vt4Var;
    }
}
