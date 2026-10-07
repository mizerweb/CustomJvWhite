package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wgf extends nq4 {
    public long d;
    public long e;
    public s5e f;
    public ija g;
    public dja h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ygf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgf(ygf ygfVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = ygfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(0L, 0L, null, null, this);
    }
}
