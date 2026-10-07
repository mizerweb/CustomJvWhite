package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z20 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ c30 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(c30 c30Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = c30Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(null, this);
    }
}
