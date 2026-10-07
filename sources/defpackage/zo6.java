package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zo6 extends nq4 {
    public wfe d;
    public wfe e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ap6 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo6(ap6 ap6Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = ap6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
