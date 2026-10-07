package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j37 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ k37 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j37(k37 k37Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = k37Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(false, this);
    }
}
