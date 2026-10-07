package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uoj implements xx6 {
    public final /* synthetic */ xx6 a;
    public final /* synthetic */ long b;

    public uoj(pzf pzfVar, long j) {
        this.a = pzfVar;
        this.b = j;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect = this.a.collect(new toj(yx6Var, this.b), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
