package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class os2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ps2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os2(ps2 ps2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = ps2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ps2.g(this.e, this);
    }
}
