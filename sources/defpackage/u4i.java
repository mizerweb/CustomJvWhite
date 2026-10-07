package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u4i extends nq4 {
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ nub f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4i(nub nubVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = nubVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return nub.a(this.f, null, this);
    }
}
