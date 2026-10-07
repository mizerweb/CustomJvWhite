package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or2 extends nq4 {
    public k30 d;
    public xx6 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k30 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(k30 k30Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = k30Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
