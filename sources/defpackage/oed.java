package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oed extends nq4 {
    public Object d;
    public wed e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wed h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oed(wed wedVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = wedVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.r(null, null, this);
    }
}
