package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y9k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ kdk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9k(kdk kdkVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = kdkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return kdk.a(this.e, this);
    }
}
