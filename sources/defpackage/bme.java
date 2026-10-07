package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bme extends nq4 {
    public aq d;
    public yhh e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dme g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bme(dme dmeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = dmeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return dme.d(this.g, null, null, this);
    }
}
