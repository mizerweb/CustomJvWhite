package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lhj extends nq4 {
    public shj d;
    public dhj e;
    public /* synthetic */ Object f;
    public final /* synthetic */ phj g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhj(phj phjVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = phjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return phj.g(this.g, null, this);
    }
}
