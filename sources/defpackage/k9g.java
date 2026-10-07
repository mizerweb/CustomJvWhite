package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k9g extends nq4 {
    public m9g d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ m9g h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, null, this);
    }
}
