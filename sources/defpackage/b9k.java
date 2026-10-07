package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b9k extends nq4 {
    public w9k d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w9k g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9k(w9k w9kVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = w9kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objA = this.g.a(null, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
