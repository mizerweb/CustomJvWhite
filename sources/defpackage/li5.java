package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class li5 extends nq4 {
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ aj5 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, 0, this);
    }
}
