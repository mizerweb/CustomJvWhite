package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y40 extends nq4 {
    public c46 d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ a50 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(a50 a50Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = a50Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, null, this);
    }
}
