package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml1 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ nl1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(nl1 nl1Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = nl1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return nl1.a(this.e, this);
    }
}
