package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mmj extends nq4 {
    public lmj d;
    public qmj e;
    public mme f;
    public /* synthetic */ Object g;
    public final /* synthetic */ nmj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmj(nmj nmjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = nmjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
