package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z53 extends nq4 {
    public int d;
    public int e;
    public int f;
    public String g;
    public qy9 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ l63 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z53(l63 l63Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = l63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return l63.D(this.j, 0, null, this);
    }
}
