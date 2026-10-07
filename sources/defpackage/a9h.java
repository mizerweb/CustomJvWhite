package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a9h extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ c9h e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9h(c9h c9hVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = c9hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, this);
    }
}
