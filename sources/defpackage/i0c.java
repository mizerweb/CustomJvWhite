package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i0c extends nq4 {
    public sfa d;
    public u40 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l0c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0c(l0c l0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = l0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(null, null, false, false, false, false, this);
    }
}
