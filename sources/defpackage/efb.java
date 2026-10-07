package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class efb extends nq4 {
    public long d;
    public rj1 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kfb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efb(kfb kfbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = kfbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}
