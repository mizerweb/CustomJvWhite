package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h0j extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ i0j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0j(i0j i0jVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = i0jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
