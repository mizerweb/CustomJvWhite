package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kuh extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ nuh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuh(nuh nuhVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = nuhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
