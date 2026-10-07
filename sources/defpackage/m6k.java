package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m6k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ r7k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6k(r7k r7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = r7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objH = this.e.h(null, this);
        return objH == hu4.a ? objH : new roe(objH);
    }
}
