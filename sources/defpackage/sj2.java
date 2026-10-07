package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sj2 extends nq4 {
    public long d;
    public long e;
    public z5e f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ uj2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj2(uj2 uj2Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = uj2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, 0L, null, this);
    }
}
