package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fyi extends nq4 {
    public long d;
    public long e;
    public mg5 f;
    public String g;
    public d3j h;
    public /* synthetic */ Object i;
    public final /* synthetic */ hyi j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyi(hyi hyiVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = hyiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(0L, 0L, null, null, null, null, this);
    }
}
