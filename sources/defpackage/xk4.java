package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xk4 extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yk4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk4(yk4 yk4Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = yk4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return yk4.C(this.f, 0L, false, this);
    }
}
