package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y7f extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ z7f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7f(z7f z7fVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = z7fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(0L, this);
    }
}
