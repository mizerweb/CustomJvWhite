package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k34 extends nq4 {
    public jy3 d;
    public jy3 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l34 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k34(l34 l34Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = l34Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.z(null, this);
    }
}
