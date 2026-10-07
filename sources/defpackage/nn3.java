package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nn3 extends nq4 {
    public q24 d;
    public tw2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xn3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn3(xn3 xn3Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = xn3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(null, null, this);
    }
}
