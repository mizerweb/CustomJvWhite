package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wck extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ g9i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wck(g9i g9iVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = g9iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objB = this.e.b(null, this);
        return objB == hu4.a ? objB : new roe(objB);
    }
}
