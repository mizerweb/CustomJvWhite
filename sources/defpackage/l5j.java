package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l5j extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ n5j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5j(n5j n5jVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = n5jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, 0L, 0L, this);
    }
}
