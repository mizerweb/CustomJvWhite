package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y0i extends nq4 {
    public long d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ e1i g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0i(e1i e1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = e1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(0L, null, this);
    }
}
