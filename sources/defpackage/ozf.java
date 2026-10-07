package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ozf extends nq4 {
    public pzf d;
    public yx6 e;
    public qzf f;
    public vo8 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ pzf i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozf(pzf pzfVar, lq4 lq4Var) {
        super(lq4Var);
        this.i = pzfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        pzf.m(this.i, null, this);
        return hu4.a;
    }
}
