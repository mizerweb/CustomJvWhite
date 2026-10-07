package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xz2 extends nq4 {
    public qw2 d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h03 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(h03 h03Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = h03Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
