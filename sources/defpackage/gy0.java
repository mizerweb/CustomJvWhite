package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hy0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(hy0 hy0Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = hy0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
