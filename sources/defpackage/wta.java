package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wta extends nq4 {
    public kmb d;
    public hua e;
    public long[] f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ xta p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wta(xta xtaVar, lq4 lq4Var) {
        super(lq4Var);
        this.p = xtaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(this);
    }
}
