package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g0k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ h0k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0k(h0k h0kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = h0kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return h0k.a(this.e, this);
    }
}
