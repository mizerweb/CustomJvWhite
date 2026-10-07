package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n7e extends nq4 {
    public long d;
    public z5e e;
    public sfa f;
    public /* synthetic */ Object g;
    public final /* synthetic */ u7e h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7e(u7e u7eVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = u7eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.u(0L, null, this);
    }
}
