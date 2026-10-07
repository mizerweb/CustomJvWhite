package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ddh extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ldh f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddh(ldh ldhVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ldhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ldh.b(this.f, 0L, this);
    }
}
