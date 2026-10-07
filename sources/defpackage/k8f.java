package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k8f extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l8f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8f(l8f l8fVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = l8fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return l8f.b(this.f, null, this);
    }
}
