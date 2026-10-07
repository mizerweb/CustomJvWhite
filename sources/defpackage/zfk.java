package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zfk extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ r6a e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfk(r6a r6aVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = r6aVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objP = this.e.p(null, this);
        return objP == hu4.a ? objP : new roe(objP);
    }
}
