package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k3c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ l3c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3c(l3c l3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = l3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(this);
    }
}
