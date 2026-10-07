package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q10 extends nq4 {
    public a10 d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(y10 y10Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = y10Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.s(null, 0L, false, null, this);
    }
}
