package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nsj extends nq4 {
    public msj d;
    public pij e;
    public lm7 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ osj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsj(osj osjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = osjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
