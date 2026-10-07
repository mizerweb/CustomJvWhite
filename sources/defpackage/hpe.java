package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hpe extends nq4 {
    public String d;
    public gc2 e;
    public cf7 f;
    public ufe g;
    public AutoCloseable h;
    public db2 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ipe l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpe(ipe ipeVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = ipeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, null, this);
    }
}
