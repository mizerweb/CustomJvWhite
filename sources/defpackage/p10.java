package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p10 extends nq4 {
    public g10 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y10 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(y10 y10Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = y10Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.r(null, 0L, false, this);
    }
}
