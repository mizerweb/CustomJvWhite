package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e00 extends nq4 {
    public long d;
    public long e;
    public long f;
    public int g;
    public s04 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ h00 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(h00 h00Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = h00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(0L, 0, 0L, this);
    }
}
