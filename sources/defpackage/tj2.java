package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tj2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ uj2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(uj2 uj2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = uj2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return uj2.a(this.e, 0L, 0L, this);
    }
}
