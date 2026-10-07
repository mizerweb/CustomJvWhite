package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class at9 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ct9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at9(ct9 ct9Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = ct9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
