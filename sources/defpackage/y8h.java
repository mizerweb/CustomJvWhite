package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y8h extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xde f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8h(xde xdeVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = xdeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.g(null, this);
    }
}
