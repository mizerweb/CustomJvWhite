package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qm3 extends nq4 {
    public mjg d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tm3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm3(tm3 tm3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = tm3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}
