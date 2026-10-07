package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends nq4 {
    public yxe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bye f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bye byeVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = byeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
