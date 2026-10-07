package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pfj extends nq4 {
    public ifj d;
    public pdj e;
    public ix0 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sfj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfj(sfj sfjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = sfjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.l(null, this);
    }
}
