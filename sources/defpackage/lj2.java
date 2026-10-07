package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lj2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ mj2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj2(mj2 mj2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = mj2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return mj2.a(this.e, null, 0L, this);
    }
}
