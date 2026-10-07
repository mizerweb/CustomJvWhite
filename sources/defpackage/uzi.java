package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uzi extends nq4 {
    public boolean d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xzi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzi(xzi xziVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = xziVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(false, this);
    }
}
