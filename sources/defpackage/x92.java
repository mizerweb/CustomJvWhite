package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x92 extends nq4 {
    public sv1 d;
    public qv5 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y92 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(y92 y92Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = y92Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}
