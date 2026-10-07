package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ere extends nq4 {
    public long[] d;
    public long[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hre n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ere(hre hreVar, nq4 nq4Var) {
        super(nq4Var);
        this.n = hreVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, this);
    }
}
