package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v07 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public yx6 f;
    public final /* synthetic */ so5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v07(so5 so5Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = so5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
