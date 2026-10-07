package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u45 extends nq4 {
    public long d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ v45 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u45(v45 v45Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = v45Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(0L, false, null, this);
    }
}
