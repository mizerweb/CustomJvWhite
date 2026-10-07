package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r6k extends nq4 {
    public n7k d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n7k f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6k(n7k n7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = n7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
