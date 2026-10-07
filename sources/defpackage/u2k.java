package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u2k extends nq4 {
    public y3k d;
    public fjh e;
    public String f;
    public /* synthetic */ Object g;
    public final /* synthetic */ y3k h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2k(y3k y3kVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = y3kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
