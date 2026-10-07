package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xe8 extends nq4 {
    public ge8 d;
    public Object e;
    public Object f;
    public Object g;
    public int h;
    public int i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ye8 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe8(ye8 ye8Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = ye8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(this);
    }
}
