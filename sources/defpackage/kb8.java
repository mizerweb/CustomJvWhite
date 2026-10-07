package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kb8 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ rb8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb8(rb8 rb8Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = rb8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, false, this);
    }
}
