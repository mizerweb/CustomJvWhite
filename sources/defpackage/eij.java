package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eij extends nq4 {
    public cij d;
    public jij e;
    public jl7 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ gij h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eij(gij gijVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = gijVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
