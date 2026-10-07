package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cg0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ dg0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(dg0 dg0Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = dg0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return dg0.a(this.e, null, this);
    }
}
