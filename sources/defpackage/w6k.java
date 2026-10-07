package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w6k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ g7k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6k(g7k g7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = g7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objF = this.e.f(this);
        return objF == hu4.a ? objF : new m4k((String) objF);
    }
}
