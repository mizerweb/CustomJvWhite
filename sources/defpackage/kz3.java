package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kz3 extends nq4 {
    public yhh d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mz3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz3(mz3 mz3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = mz3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return mz3.x(this.f, null, null, this);
    }
}
