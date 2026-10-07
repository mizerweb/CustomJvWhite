package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vz2 extends nq4 {
    public long d;
    public qw2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ h03 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(h03 h03Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = h03Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(0L, this);
    }
}
