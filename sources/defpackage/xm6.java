package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xm6 extends nq4 {
    public an6 d;
    public long e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ an6 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm6(an6 an6Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = an6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return an6.e(this.h, 0L, false, this);
    }
}
