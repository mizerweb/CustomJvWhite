package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o7h extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ p7h e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7h(p7h p7hVar, lq4 lq4Var) {
        super(lq4Var);
        this.e = p7hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        this.e.collect(null, this);
        return hu4.a;
    }
}
