package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pp2 extends nq4 {
    public long d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qp2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(qp2 qp2Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = qp2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, this, null);
    }
}
