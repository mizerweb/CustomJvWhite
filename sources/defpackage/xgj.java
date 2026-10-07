package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xgj extends nq4 {
    public vgj d;
    public wlj e;
    public pgj f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zgj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgj(zgj zgjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = zgjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
