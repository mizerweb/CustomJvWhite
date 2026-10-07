package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zm9 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ an9 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm9(an9 an9Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = an9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, this);
    }
}
