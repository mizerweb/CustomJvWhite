package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gdh extends nq4 {
    public long d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ldh h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdh(ldh ldhVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = ldhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return ldh.e(this.h, 0L, this);
    }
}
