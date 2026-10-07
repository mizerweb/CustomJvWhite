package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zhk extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hik e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhk(hik hikVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = hikVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objA = this.e.a(null, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
