package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk9 extends xt4 {
    @Override // defpackage.xt4
    public xt4 R0(int i, String str) {
        n1g.m(i);
        return str != null ? new qab(this, str) : this;
    }

    public abstract lk9 S0();

    @Override // defpackage.xt4
    public String toString() {
        lk9 lk9VarS0;
        String str;
        ao5 ao5Var = ao5.a;
        lk9 lk9Var = rk9.a;
        if (this == lk9Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                lk9VarS0 = lk9Var.S0();
            } catch (UnsupportedOperationException unused) {
                lk9VarS0 = null;
            }
            str = this == lk9VarS0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + f55.n(this);
    }
}
