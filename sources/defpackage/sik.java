package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sik extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ n6k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sik(n6k n6kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = n6kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objA = this.e.a(null, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
