package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n41 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ p41 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(p41 p41Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = p41Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objK = p41.K(this.e, this);
        return objK == hu4.a ? objK : new ds2(objK);
    }
}
