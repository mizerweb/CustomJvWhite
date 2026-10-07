package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wk7 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ xk7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk7(xk7 xk7Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = xk7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
