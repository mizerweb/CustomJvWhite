package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dr5 extends nq4 {
    public sfa d;
    public u60 e;
    public e70 f;
    public int g;
    public long h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ er5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr5(er5 er5Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = er5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r(null, null, 0, 0L, 0L, null, this);
    }
}
