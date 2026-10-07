package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g9k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ xde e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9k(xde xdeVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = xdeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objJ = this.e.j(this);
        return objJ == hu4.a ? objJ : new m4k((String) objJ);
    }
}
