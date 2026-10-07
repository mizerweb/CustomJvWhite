package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u10 extends nq4 {
    public long d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y10 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(y10 y10Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = y10Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return y10.b(this.g, 0L, false, false, this);
    }
}
