package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b26 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ p26 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b26(p26 p26Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = p26Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return p26.B(this.e, this);
    }
}
