package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ljg extends nq4 {
    public mjg d;
    public yx6 e;
    public ojg f;
    public vo8 g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ mjg j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljg(mjg mjgVar, lq4 lq4Var) {
        super(lq4Var);
        this.j = mjgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.collect(null, this);
        return hu4.a;
    }
}
