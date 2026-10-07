package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n00 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ r00 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(r00 r00Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = r00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, this);
    }
}
