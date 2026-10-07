package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z40 extends nq4 {
    public mm9 d;
    public l60 e;
    public String f;
    public vc9 g;
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ a50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(a50 a50Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = a50Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(null, this);
    }
}
