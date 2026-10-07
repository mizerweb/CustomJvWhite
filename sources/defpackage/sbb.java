package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sbb extends nq4 {
    public l9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tbb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbb(tbb tbbVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = tbbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return tbb.a(this.f, this);
    }
}
