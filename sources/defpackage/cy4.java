package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cy4 extends nq4 {
    public long d;
    public long e;
    public vy2 f;
    public u8b g;
    public sy4 h;
    public j9b i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ sy4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.p = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f(0L, null, null, this);
    }
}
