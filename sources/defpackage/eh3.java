package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eh3 extends nq4 {
    public gh3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gh3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(gh3 gh3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = gh3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return gh3.b(this.f, this);
    }
}
