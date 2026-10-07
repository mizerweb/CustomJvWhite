package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nv2 extends nq4 {
    public long d;
    public long e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ov2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(ov2 ov2Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = ov2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Object objA = this.h.a(0L, 0L, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
