package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ska extends nq4 {
    public long[] d;
    public Object[] e;
    public long[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tka o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ska(tka tkaVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = tkaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
