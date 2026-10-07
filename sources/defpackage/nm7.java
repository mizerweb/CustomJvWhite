package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nm7 extends nq4 {
    public long d;
    public us0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pm7 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm7(pm7 pm7Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = pm7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, null, this);
    }
}
