package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bz2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ez2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz2(ez2 ez2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = ez2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.w(this);
    }
}
