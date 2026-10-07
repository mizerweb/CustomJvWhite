package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mk7 extends nq4 {
    public long d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qk7 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk7(qk7 qk7Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = qk7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, false, this);
    }
}
