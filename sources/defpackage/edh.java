package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class edh extends nq4 {
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ldh g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edh(ldh ldhVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ldhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return ldh.c(this.g, 0L, 0, this);
    }
}
