package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b37 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ f37 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b37(f37 f37Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = f37Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.M(null, this);
    }
}
