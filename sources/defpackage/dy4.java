package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dy4 extends nq4 {
    public long d;
    public long e;
    public String f;
    public sy4 g;
    public j9b h;
    public int i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ sy4 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.n = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(0L, this, null);
    }
}
