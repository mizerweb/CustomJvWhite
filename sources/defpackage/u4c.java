package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u4c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ v4c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4c(v4c v4cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = v4cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(this);
    }
}
