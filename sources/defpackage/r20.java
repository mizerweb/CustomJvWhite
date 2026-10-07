package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r20 extends nq4 {
    public long d;
    public long e;
    public long f;
    public int g;
    public rt2 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ w20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(w20 w20Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = w20Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.q(0L, 0, 0L, this);
    }
}
