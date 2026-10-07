package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oz6 extends nq4 {
    public so5 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ so5 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz6(so5 so5Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = so5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
