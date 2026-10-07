package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fn0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ in0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(in0 in0Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = in0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objF = this.e.f(this);
        return objF == hu4.a ? objF : new roe(objF);
    }
}
