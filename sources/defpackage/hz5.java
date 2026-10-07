package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hz5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ iz5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz5(iz5 iz5Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = iz5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.N(this);
    }
}
