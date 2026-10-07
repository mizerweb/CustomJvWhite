package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oi5 extends nq4 {
    public azg d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aj5 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.i(null, null, this);
    }
}
