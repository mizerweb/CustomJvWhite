package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e1h extends nq4 {
    public azg d;
    public ha9 e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ g1h h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1h(g1h g1hVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = g1hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, 0L, null, this);
    }
}
