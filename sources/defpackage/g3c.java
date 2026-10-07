package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g3c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ i3c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objU = this.e.u(null, this);
        return objU == hu4.a ? objU : new roe(objU);
    }
}
