package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xh5 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ yh5 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh5(yh5 yh5Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = yh5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        this.e.collect(null, this);
        return hu4.a;
    }
}
