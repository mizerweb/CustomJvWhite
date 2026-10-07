package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vt6 extends nq4 {
    public nuh d;
    public wfi e;
    public j28 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zt6 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt6(zt6 zt6Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = zt6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, this);
    }
}
