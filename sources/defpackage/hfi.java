package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hfi extends nq4 {
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ifi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfi(ifi ifiVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ifiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, 0L, null, null, this);
    }
}
