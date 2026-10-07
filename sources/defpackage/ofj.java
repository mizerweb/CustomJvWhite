package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ofj extends nq4 {
    public ifj d;
    public vfj e;
    public lx0 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sfj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofj(sfj sfjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = sfjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.k(null, this);
    }
}
