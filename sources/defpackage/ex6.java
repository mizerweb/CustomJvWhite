package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ex6 extends nq4 {
    public long d;
    public i64 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ix6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex6(ix6 ix6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = ix6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, this);
    }
}
