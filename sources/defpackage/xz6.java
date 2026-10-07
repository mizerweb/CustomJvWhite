package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xz6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public yx6 f;
    public final /* synthetic */ gy6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz6(gy6 gy6Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = gy6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
