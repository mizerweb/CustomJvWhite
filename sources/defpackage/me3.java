package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class me3 extends nq4 {
    public long d;
    public long e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ne3 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(ne3 ne3Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = ne3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, false, 0L, this);
    }
}
