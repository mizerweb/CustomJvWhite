package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h9f extends nq4 {
    public f9f d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i9f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9f(i9f i9fVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = i9fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
