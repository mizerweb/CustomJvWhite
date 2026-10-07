package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z6k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ g7k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6k(g7k g7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = g7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(this);
    }
}
