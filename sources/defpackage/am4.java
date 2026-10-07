package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class am4 extends nq4 {
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bm4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am4(bm4 bm4Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = bm4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, this);
    }
}
