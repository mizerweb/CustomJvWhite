package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class egk extends nq4 {
    public ku0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xo9 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egk(xo9 xo9Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = xo9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
