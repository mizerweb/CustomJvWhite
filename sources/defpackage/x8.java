package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x8 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ y8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(y8 y8Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = y8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return y8.B(this.e, null, this);
    }
}
