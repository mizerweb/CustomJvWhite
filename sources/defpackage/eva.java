package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eva extends nq4 {
    public rt2 d;
    public opa e;
    public /* synthetic */ Object f;
    public final /* synthetic */ fva g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eva(fva fvaVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = fvaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(null, null, this);
    }
}
