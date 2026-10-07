package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mz extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ b00 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(b00 b00Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return b00.I(this.e, null, this);
    }
}
