package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z24 extends nq4 {
    public l34 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l34 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z24(l34 l34Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = l34Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.q(null, null, this);
    }
}
