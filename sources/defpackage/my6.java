package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class my6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ny6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my6(ny6 ny6Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = ny6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
