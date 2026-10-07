package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cme extends nq4 {
    public aq d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dme f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cme(dme dmeVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = dmeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return dme.e(this.f, null, this);
    }
}
