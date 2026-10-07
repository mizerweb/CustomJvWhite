package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o6d extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ p6d e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6d(p6d p6dVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = p6dVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0L, 0L, 0L, 0, 0L, this);
    }
}
