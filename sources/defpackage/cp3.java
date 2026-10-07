package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cp3 extends nq4 {
    public long d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dp3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp3(dp3 dp3Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = dp3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, this);
    }
}
