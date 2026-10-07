package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ez6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ fz6 f;
    public fz6 g;
    public yx6 h;
    public yxe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez6(fz6 fz6Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = fz6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
