package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xq5 extends nq4 {
    public float d;
    public long e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ er5 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq5(er5 er5Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = er5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.e(0.0f, 0L, 0L, this);
    }
}
