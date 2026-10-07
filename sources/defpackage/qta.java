package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qta extends nq4 {
    public hua d;
    public long[] e;
    public long[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pta o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta(pta ptaVar, lq4 lq4Var) {
        super(lq4Var);
        this.o = ptaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(this);
    }
}
