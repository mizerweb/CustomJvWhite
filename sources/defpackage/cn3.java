package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cn3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ dn3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn3(dn3 dn3Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = dn3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.v(0L, null, this);
    }
}
