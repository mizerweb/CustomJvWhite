package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ye2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ze2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye2(ze2 ze2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = ze2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(this);
    }
}
