package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f3k extends nq4 {
    public y3k d;
    public Object e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ y3k i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3k(y3k y3kVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = y3kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.h(null, this);
    }
}
