package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e0c extends nq4 {
    public mm9 d;
    public sfa e;
    public u40 f;
    public e60 g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ l0c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0c(l0c l0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = l0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, null, null, false, this);
    }
}
