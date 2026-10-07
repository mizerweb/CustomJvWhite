package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x6k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ m7k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6k(m7k m7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = m7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objH = this.e.h(this);
        return objH == hu4.a ? objH : new roe(objH);
    }
}
