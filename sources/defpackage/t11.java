package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t11 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ w11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t11(w11 w11Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = w11Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return w11.C(this.e, 0L, this);
    }
}
