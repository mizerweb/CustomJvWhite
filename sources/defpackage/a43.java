package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a43 extends nq4 {
    public long d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ c30 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a43(c30 c30Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = c30Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.m(0L, 0, 0L, this);
    }
}
