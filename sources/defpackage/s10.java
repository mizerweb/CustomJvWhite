package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s10 extends nq4 {
    public y10 d;
    public long e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ y10 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(y10 y10Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = y10Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return y10.x(this.h, 0L, false, false, this);
    }
}
