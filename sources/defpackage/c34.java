package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c34 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ l34 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c34(l34 l34Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = l34Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.u(null, this);
    }
}
