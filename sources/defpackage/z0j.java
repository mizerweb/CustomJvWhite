package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z0j extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ g1j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0j(g1j g1jVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = g1jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0L, this);
    }
}
