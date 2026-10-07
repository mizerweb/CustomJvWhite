package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q9a extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ v9a e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9a(v9a v9aVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = v9aVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.C(null, this);
    }
}
