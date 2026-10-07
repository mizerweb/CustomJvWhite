package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xk3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ rl3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk3(rl3 rl3Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = rl3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return rl3.E(this.e, 0L, this);
    }
}
