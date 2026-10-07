package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lz7 extends nq4 {
    public wfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mz7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz7(mz7 mz7Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = mz7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return mz7.a(this.f, null, this);
    }
}
