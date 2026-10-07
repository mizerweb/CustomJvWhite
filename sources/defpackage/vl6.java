package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vl6 extends nq4 {
    public dm6 d;
    public long e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dm6 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl6(dm6 dm6Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = dm6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return dm6.f(this.h, 0L, false, this);
    }
}
