package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cc2 extends nq4 {
    public String d;
    public xf5 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dc2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc2(dc2 dc2Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = dc2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
