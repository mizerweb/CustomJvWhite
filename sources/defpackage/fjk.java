package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fjk extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ kr6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjk(kr6 kr6Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = kr6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objW = this.e.w(null, null, this);
        return objW == hu4.a ? objW : new roe(objW);
    }
}
