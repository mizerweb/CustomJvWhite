package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class el0 extends nq4 {
    public String d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ fl0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(fl0 fl0Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = fl0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
