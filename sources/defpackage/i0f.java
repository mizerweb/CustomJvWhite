package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i0f extends nq4 {
    public long d;
    public long e;
    public long f;
    public yv3 g;
    public ns5 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ j0f j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0f(j0f j0fVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = j0fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(0L, null, 0L, 0L, null, this);
    }
}
