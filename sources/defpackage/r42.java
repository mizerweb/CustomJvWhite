package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r42 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ u42 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r42(u42 u42Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = u42Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(0, null, this);
    }
}
