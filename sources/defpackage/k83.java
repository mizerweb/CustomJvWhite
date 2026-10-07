package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k83 extends nq4 {
    public l8b d;
    public m8b e;
    public Object f;
    public g83 g;
    public pw h;
    public xf5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t83 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(t83 t83Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = t83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, null, this);
    }
}
