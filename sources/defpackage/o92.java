package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o92 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ u92 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o92(u92 u92Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = u92Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, false, this);
    }
}
