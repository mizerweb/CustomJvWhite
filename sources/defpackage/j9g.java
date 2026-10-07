package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j9g extends nq4 {
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m9g g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(this);
    }
}
