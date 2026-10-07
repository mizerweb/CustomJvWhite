package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ea3 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ fa3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea3(fa3 fa3Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = fa3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
