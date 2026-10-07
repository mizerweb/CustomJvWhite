package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yyd extends nq4 {
    public xn6 d;
    public hn6 e;
    public syd f;
    public /* synthetic */ Object g;
    public final /* synthetic */ azd h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyd(azd azdVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = azdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, null, null, this);
    }
}
