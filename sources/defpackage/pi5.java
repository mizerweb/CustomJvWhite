package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pi5 extends nq4 {
    public long d;
    public long e;
    public boolean f;
    public int g;
    public int h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ aj5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(0L, false, 0L, this);
    }
}
