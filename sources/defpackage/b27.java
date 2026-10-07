package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b27 extends nq4 {
    public o67 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c27 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b27(c27 c27Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = c27Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return c27.a(this.f, null, this);
    }
}
