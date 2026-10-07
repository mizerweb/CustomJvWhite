package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz6 implements xx6 {
    public final /* synthetic */ xx6 a;
    public final /* synthetic */ int b;

    public lz6(xx6 xx6Var, int i) {
        this.a = xx6Var;
        this.b = i;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect = this.a.collect(new nz6(new ufe(), this.b, yx6Var), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
