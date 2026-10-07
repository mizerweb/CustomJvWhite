package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c9g extends nq4 {
    public Object d;
    public m9g e;
    public i64 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ m9g h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return m9g.b(this.h, null, this);
    }
}
