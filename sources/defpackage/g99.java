package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g99 extends nq4 {
    public mjg d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i99 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g99(i99 i99Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = i99Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return i99.a(this.f, null, this);
    }
}
