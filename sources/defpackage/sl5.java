package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sl5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ tl5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl5(tl5 tl5Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = tl5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, this);
    }
}
