package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hce extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ jce e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hce(jce jceVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = jceVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return jce.C(this.e, 0L, this);
    }
}
