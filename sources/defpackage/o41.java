package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o41 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ p41 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(p41 p41Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = p41Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objL = this.e.L(null, 0, 0L, this);
        return objL == hu4.a ? objL : new ds2(objL);
    }
}
