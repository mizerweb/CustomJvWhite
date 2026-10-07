package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zq5 extends nq4 {
    public xva d;
    public o18 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ er5 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq5(er5 er5Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = er5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.m(null, null, this);
    }
}
