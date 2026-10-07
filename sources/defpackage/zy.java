package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ u50 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(u50 u50Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = u50Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
