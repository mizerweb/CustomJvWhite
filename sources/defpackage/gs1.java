package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gs1 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hs1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs1(hs1 hs1Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = hs1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, null, this);
    }
}
