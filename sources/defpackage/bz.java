package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bz extends nq4 {
    public long d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ u50 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(u50 u50Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = u50Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.m(0L, 0, 0L, this);
    }
}
