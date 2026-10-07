package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kj2 extends nq4 {
    public q24 d;
    public z5e e;
    public long f;
    public long g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mj2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(mj2 mj2Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = mj2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, 0L, null, this);
    }
}
