package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ikh extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ okh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikh(okh okhVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = okhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(this);
    }
}
