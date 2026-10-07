package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p7 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ r7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(r7 r7Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = r7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objA = this.e.a(null, this);
        return objA == hu4.a ? objA : new y6((r3f) objA);
    }
}
