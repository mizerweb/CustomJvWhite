package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lkh extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ okh f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkh(okh okhVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = okhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.g(0L, this, null);
    }
}
