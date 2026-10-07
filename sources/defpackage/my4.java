package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class my4 extends nq4 {
    public vy2 d;
    public f9b e;
    public r17 f;
    public Object g;
    public bre h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sy4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(null, this);
    }
}
