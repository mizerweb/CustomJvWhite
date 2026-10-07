package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dm2 extends nq4 {
    public int d;
    public AutoCloseable e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pm2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.k(0, this);
    }
}
