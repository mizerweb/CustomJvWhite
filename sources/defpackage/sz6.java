package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ fz6 f;
    public gy6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz6(fz6 fz6Var, lq4 lq4Var) {
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
