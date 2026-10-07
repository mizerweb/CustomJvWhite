package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t4c extends nq4 {
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ v4c g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4c(v4c v4cVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = v4cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(0L, this);
    }
}
