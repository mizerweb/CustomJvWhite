package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jo4 extends nq4 {
    public long d;
    public ii4 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ no4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo4(no4 no4Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = no4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(0L, null, this);
    }
}
