package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d1i extends nq4 {
    public cf7 d;
    public cf7 e;
    public int f;
    public int g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ e1i j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1i(e1i e1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = e1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objF = this.j.f(null, null, this);
        return objF == hu4.a ? objF : new roe(objF);
    }
}
