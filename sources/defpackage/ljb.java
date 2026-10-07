package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ljb extends nq4 {
    public sfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mjb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljb(mjb mjbVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = mjbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, null, 0L, this);
    }
}
