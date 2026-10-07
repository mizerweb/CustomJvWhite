package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la9 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ na9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la9(na9 na9Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = na9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.q(null, this);
    }
}
