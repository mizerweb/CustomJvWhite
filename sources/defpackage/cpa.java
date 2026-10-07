package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cpa extends nq4 {
    public long d;
    public Long e;
    public rt2 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dpa h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpa(dpa dpaVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = dpaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, null, this);
    }
}
