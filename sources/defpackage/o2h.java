package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o2h extends nq4 {
    public long d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ p2h g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2h(p2h p2hVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = p2hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, this);
    }
}
