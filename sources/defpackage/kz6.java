package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kz6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ j3 f;
    public j3 g;
    public yx6 h;
    public Throwable i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz6(j3 j3Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = j3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
