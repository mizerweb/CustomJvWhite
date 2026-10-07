package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf9 extends nq4 {
    public long d;
    public long e;
    public String f;
    public df9 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ if9 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf9(if9 if9Var, nq4 nq4Var) {
        super(nq4Var);
        this.m = if9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return if9.a(this.m, 0L, null, 0, null, false, false, this);
    }
}
