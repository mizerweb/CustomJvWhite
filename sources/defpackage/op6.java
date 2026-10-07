package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class op6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ rp6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op6(rp6 rp6Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = rp6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0L, 0L, null, null, null, null, this);
    }
}
