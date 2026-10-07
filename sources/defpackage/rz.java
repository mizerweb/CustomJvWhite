package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rz extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ b00 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(b00 b00Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.P(this);
    }
}
