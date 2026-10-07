package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sl4 extends nq4 {
    public vg4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vl4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl4(vl4 vl4Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = vl4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return vl4.J(this.f, null, this);
    }
}
