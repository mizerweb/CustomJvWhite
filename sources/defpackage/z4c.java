package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z4c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ qg7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4c(qg7 qg7Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = qg7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.s(null, this);
    }
}
