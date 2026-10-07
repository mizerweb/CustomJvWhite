package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ji8 extends nq4 {
    public gda d;
    public q24 e;
    public Long f;
    public long g;
    public boolean h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ki8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji8(ki8 ki8Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = ki8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(0L, null, this, null, null, false, false);
    }
}
