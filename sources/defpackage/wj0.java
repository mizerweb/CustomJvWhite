package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj0 extends nq4 {
    public w73 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yj0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj0(yj0 yj0Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = yj0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
