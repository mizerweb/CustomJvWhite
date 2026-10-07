package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x9d extends nq4 {
    public long d;
    public long e;
    public long f;
    public long g;
    public f8b h;
    public e70 i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y9d m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9d(y9d y9dVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = y9dVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0L, 0L, 0L, null, 0L, this);
    }
}
