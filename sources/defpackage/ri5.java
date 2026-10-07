package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ri5 extends nq4 {
    public long d;
    public q2h e;
    public q2h f;
    public /* synthetic */ Object g;
    public final /* synthetic */ aj5 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.l(0L, this);
    }
}
