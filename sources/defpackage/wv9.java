package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wv9 extends nq4 {
    public mdh d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xv9 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv9(xv9 xv9Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = xv9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
