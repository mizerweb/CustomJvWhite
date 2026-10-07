package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hx9 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ lx9 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx9(lx9 lx9Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = lx9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return lx9.D(this.f, this);
    }
}
