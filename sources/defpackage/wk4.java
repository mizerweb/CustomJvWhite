package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wk4 extends nq4 {
    public long d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yk4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk4(yk4 yk4Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = yk4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return yk4.B(this.g, 0L, false, this);
    }
}
