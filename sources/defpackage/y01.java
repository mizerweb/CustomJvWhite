package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y01 extends nq4 {
    public vg4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ z01 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y01(z01 z01Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = z01Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return z01.J(this.f, null, this);
    }
}
