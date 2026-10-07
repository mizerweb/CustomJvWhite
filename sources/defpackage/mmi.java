package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mmi extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ nmi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmi(nmi nmiVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = nmiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return nmi.a(this.e, null, 0L, this);
    }
}
