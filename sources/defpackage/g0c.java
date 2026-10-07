package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g0c extends nq4 {
    public sfa d;
    public u40 e;
    public boolean f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ l0c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0c(l0c l0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = l0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, null, false, 0, this);
    }
}
