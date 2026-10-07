package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dva extends nq4 {
    public long d;
    public i5f e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ fva h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dva(fva fvaVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = fvaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(0L, null, false, this);
    }
}
