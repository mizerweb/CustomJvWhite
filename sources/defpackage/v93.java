package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v93 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ z93 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v93(z93 z93Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = z93Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return z93.B(this.e, this);
    }
}
