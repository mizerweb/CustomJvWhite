package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pgf extends nq4 {
    public long d;
    public String e;
    public g61 f;
    public c61 g;
    public sfa h;
    public /* synthetic */ Object i;
    public final /* synthetic */ qgf j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgf(qgf qgfVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = qgfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, null, null, null, this);
    }
}
