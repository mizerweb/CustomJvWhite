package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ih8 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ gy6 f;
    public yx6 g;
    public x0c h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih8(gy6 gy6Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = gy6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
