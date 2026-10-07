package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt4 extends n0 implements tt4 {
    public static final wt4 b = new wt4(khb.f, new ik4(3));

    public xt4() {
        super(khb.f);
    }

    public abstract void D0(vt4 vt4Var, Runnable runnable);

    @Override // defpackage.n0, defpackage.vt4
    public final vt4 I(ut4 ut4Var) {
        if (ut4Var instanceof wt4) {
            wt4 wt4Var = (wt4) ut4Var;
            ut4 ut4Var2 = this.a;
            if ((ut4Var2 != wt4Var && wt4Var.b != ut4Var2) || ((tt4) wt4Var.a.invoke(this)) == null) {
                return this;
            }
        } else if (khb.f != ut4Var) {
            return this;
        }
        return k66.a;
    }

    public void I0(vt4 vt4Var, Runnable runnable) {
        e9i.z0(this, vt4Var, runnable);
    }

    public boolean P0(vt4 vt4Var) {
        return !(this instanceof yai);
    }

    public xt4 R0(int i, String str) {
        n1g.m(i);
        return new l19(this, i, str);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f55.n(this);
    }

    @Override // defpackage.n0, defpackage.vt4
    public final tt4 x0(ut4 ut4Var) {
        tt4 tt4Var;
        if (ut4Var instanceof wt4) {
            wt4 wt4Var = (wt4) ut4Var;
            ut4 ut4Var2 = this.a;
            if ((ut4Var2 == wt4Var || wt4Var.b == ut4Var2) && (tt4Var = (tt4) wt4Var.a.invoke(this)) != null) {
                return tt4Var;
            }
        } else if (khb.f == ut4Var) {
            return this;
        }
        return null;
    }
}
