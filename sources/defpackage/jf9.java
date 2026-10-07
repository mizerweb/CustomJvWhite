package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jf9 extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kf9 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf9(kf9 kf9Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = kf9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.k(null, this);
    }
}
