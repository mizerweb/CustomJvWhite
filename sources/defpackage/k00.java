package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k00 extends nq4 {
    public long d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ r00 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(r00 r00Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = r00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.q(0L, 0, 0L, this);
    }
}
