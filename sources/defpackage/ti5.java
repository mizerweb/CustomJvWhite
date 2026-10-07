package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ti5 extends nq4 {
    public u8b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aj5 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
