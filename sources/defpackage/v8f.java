package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v8f extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ w8f e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8f(w8f w8fVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = w8fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return w8f.b(this.e, null, this);
    }
}
