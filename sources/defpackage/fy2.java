package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fy2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hy2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy2(hy2 hy2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = hy2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.m(this);
    }
}
