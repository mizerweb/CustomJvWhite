package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a03 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ h03 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a03(h03 h03Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = h03Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(0L, false, this);
    }
}
