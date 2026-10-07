package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class csj extends nq4 {
    public rsi d;
    public gsj e;
    public bsj f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dsj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csj(dsj dsjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = dsjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
