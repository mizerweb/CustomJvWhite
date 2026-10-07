package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dy3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hy3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy3(hy3 hy3Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = hy3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
