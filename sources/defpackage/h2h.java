package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h2h extends nq4 {
    public long d;
    public long e;
    public boolean f;
    public u8b g;
    public l9b h;
    public /* synthetic */ Object i;
    public final /* synthetic */ i2h j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2h(i2h i2hVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = i2hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(0L, false, null, 0L, this);
    }
}
