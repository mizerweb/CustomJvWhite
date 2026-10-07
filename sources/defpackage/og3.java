package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class og3 extends nq4 {
    public long d;
    public boolean e;
    public String f;
    public rt2 g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ pg3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og3(pg3 pg3Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = pg3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, false, null, this);
    }
}
