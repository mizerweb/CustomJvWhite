package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sj1 extends nq4 {
    public xj1 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xj1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj1(xj1 xj1Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = xj1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return xj1.c(this.g, null, 0, this);
    }
}
