package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vrj extends nq4 {
    public trj d;
    public mpj e;
    public qrj f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yrj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrj(yrj yrjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = yrjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
