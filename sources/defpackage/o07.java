package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o07 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ l7 f;
    public l7 g;
    public yx6 h;
    public wfe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o07(l7 l7Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = l7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
