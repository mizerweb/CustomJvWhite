package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z73 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ a83 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z73(a83 a83Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = a83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, false, this);
    }
}
