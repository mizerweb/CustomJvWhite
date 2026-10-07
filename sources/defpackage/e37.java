package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e37 extends nq4 {
    public boolean d;
    public f9b e;
    public Object f;
    public r17 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ f37 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e37(f37 f37Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = f37Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return f37.E(this.j, false, this);
    }
}
