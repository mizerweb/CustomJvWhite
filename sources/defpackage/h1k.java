package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h1k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ i1k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1k(i1k i1kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = i1kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return i1k.d(this.e, 0.0d, 0.0d, this);
    }
}
