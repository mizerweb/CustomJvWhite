package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uz6 extends nq4 {
    public vz6 d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ vz6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz6(vz6 vz6Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = vz6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
