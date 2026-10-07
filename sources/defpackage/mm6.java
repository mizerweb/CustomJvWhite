package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mm6 extends nq4 {
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ um6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm6(um6 um6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = um6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return um6.d(this.g, 0L, 0, this);
    }
}
