package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mi5 extends nq4 {
    public mw d;
    public m8b e;
    public long[] f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ aj5 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi5(aj5 aj5Var, lq4 lq4Var) {
        super(lq4Var);
        this.q = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, this);
    }
}
