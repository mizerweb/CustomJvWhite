package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ehe extends nq4 {
    public long d;
    public long e;
    public p20 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ uj6 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehe(uj6 uj6Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = uj6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(0L, null, this);
    }
}
