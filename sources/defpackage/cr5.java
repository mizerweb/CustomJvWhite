package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cr5 extends nq4 {
    public u60 d;
    public int e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ er5 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr5(er5 er5Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = er5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.q(null, 0, 0L, 0L, this);
    }
}
