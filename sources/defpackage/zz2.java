package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zz2 extends nq4 {
    public qw2 d;
    public m8b e;
    public Object f;
    public l9b g;
    public int h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h03 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz2(h03 h03Var, lq4 lq4Var) {
        super(lq4Var);
        this.k = h03Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, this);
    }
}
