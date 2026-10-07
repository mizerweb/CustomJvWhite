package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class im6 extends nq4 {
    public long d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ um6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im6(um6 um6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = um6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.k(0L, false, this);
    }
}
