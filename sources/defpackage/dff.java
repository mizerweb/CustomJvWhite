package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dff implements xx6 {
    public final /* synthetic */ hz1 a;
    public final /* synthetic */ hff b;
    public final /* synthetic */ boolean c;

    public dff(hz1 hz1Var, hff hffVar, boolean z) {
        this.a = hz1Var;
        this.b = hffVar;
        this.c = z;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect = this.a.collect(new cff(yx6Var, this.b, this.c), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
