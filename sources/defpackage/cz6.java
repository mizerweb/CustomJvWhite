package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cz6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ dz6 f;
    public Object g;
    public yx6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz6(dz6 dz6Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = dz6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
