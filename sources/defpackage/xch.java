package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xch extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ldh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xch(ldh ldhVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = ldhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.k(this);
    }
}
