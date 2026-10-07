package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z0i extends nq4 {
    public long d;
    public Throwable e;
    public /* synthetic */ Object f;
    public final /* synthetic */ e1i g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0i(e1i e1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = e1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return e1i.a(this.g, 0L, 0L, 0L, null, this);
    }
}
