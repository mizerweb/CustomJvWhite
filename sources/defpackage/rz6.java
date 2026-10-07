package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rz6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ so5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz6(so5 so5Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = so5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
