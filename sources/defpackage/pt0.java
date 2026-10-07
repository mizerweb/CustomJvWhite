package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pt0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ rt0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(rt0 rt0Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = rt0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(null, null, this);
    }
}
