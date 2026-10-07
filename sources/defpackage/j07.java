package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j07 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ xc3 f;
    public yx6 g;
    public wfe h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j07(xc3 xc3Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = xc3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
