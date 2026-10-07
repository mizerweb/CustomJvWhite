package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tr2 extends nq4 {
    public k30 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k30 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr2(k30 k30Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = k30Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
