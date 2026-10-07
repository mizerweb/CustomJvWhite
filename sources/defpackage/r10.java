package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r10 extends nq4 {
    public vfe d;
    public g10 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y10 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(y10 y10Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = y10Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.t(null, 0L, false, this);
    }
}
