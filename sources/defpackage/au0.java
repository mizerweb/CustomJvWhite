package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class au0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ du0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(du0 du0Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = du0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(null, null, this);
    }
}
