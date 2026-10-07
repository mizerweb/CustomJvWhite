package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class om7 extends nq4 {
    public long d;
    public us0 e;
    public long[] f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pm7 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om7(pm7 pm7Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = pm7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, null, this);
    }
}
