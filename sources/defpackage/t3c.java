package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t3c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ x3c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3c(x3c x3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = x3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        this.e.b(null, null, this);
        return hu4.a;
    }
}
