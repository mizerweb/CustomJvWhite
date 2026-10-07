package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lp2 extends nq4 {
    public Throwable d;
    public /* synthetic */ Object e;
    public final /* synthetic */ op2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp2(op2 op2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = op2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return op2.D(this.f, null, this);
    }
}
