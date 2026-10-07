package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gn0 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ in0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(in0 in0Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = in0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.g(null, this);
    }
}
