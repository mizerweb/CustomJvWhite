package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mei extends nq4 {
    public r17 d;
    public m8b e;
    public long[] f;
    public long[] g;
    public m8b h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nei r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mei(nei neiVar, nq4 nq4Var) {
        super(nq4Var);
        this.r = neiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.h(null, null, false, this);
    }
}
