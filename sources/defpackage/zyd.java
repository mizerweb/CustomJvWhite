package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zyd extends nq4 {
    public wn6 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ azd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyd(azd azdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = azdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
