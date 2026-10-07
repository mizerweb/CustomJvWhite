package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fy3 extends nq4 {
    public lc d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hy3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy3(hy3 hy3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = hy3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
