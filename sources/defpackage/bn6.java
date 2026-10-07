package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn6 extends nq4 {
    public xvc d;
    public a83 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cn6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn6(cn6 cn6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = cn6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
