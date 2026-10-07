package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b9h extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c9h f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9h(c9h c9hVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = c9hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.g(null, this);
    }
}
