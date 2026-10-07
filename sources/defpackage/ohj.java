package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ohj extends nq4 {
    public jhj d;
    public shj e;
    public ehj f;
    public /* synthetic */ Object g;
    public final /* synthetic */ phj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohj(phj phjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = phjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.h(null, this);
    }
}
