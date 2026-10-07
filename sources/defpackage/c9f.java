package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c9f extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ d9f e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9f(d9f d9fVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = d9fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return d9f.b(this.e, null, this);
    }
}
