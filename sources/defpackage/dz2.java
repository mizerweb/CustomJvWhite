package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dz2 extends nq4 {
    public fz2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ez2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz2(ez2 ez2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ez2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.k(null, this);
    }
}
