package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wv2 implements fdd {
    public final /* synthetic */ qw2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wv2(qw2 qw2Var, boolean z, boolean z2) {
        this.a = qw2Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.fdd
    public final boolean test(Object obj) {
        rt2 rt2Var = (rt2) obj;
        int i = rt2Var.b.m;
        boolean z = this.b;
        if (i <= 0 && (!z || !rt2Var.H0())) {
            return false;
        }
        if ((!this.c && rt2Var.s0(this.a.p.a) && !rt2Var.T()) || rt2Var.Z()) {
            return false;
        }
        if (rt2Var.C0() && rt2Var.G0()) {
            return true;
        }
        return z && rt2Var.H0();
    }
}
