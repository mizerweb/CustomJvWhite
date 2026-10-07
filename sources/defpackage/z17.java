package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z17 extends nq4 {
    public ni3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a27 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z17(a27 a27Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = a27Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return a27.b(this.f, this);
    }
}
