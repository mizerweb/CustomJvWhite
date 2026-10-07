package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kp2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ op2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp2(op2 op2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = op2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return op2.C(this.e, null, this);
    }
}
