package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ly4 extends nq4 {
    public c9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sy4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return sy4.d(this.f, null, this);
    }
}
