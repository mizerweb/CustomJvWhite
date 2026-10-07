package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wgk extends nq4 {
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xo9 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgk(xo9 xo9Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = xo9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, this);
    }
}
