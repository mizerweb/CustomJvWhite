package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fx6 extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ix6 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx6(ix6 ix6Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ix6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(this);
    }
}
