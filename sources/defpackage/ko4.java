package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ko4 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ no4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko4(no4 no4Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = no4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(0L, this);
    }
}
