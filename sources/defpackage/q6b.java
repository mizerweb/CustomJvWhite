package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q6b extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y6b f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6b(y6b y6bVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = y6bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
