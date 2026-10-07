package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gre extends nq4 {
    public long d;
    public nx2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hre g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gre(hre hreVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = hreVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.k(0L, null, this);
    }
}
