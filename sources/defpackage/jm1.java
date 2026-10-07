package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jm1 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ km1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(km1 km1Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = km1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return km1.B(this.e, this);
    }
}
