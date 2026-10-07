package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tn3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ xn3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn3(xn3 xn3Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = xn3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.r(0L, this);
    }
}
