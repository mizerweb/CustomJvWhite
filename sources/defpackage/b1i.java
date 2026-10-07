package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b1i extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ e1i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1i(e1i e1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = e1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objC = e1i.c(this.e, 0L, 0L, 0L, this);
        return objC == hu4.a ? objC : new roe(objC);
    }
}
