package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjf extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ wjf e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjf(wjf wjfVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = wjfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objG = this.e.G(this);
        return objG == hu4.a ? objG : new roe(objG);
    }
}
