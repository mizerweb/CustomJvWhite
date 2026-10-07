package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class thk extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ xo9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thk(xo9 xo9Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = xo9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(this);
    }
}
