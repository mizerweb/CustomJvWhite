package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rtd extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ utd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtd(utd utdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = utdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(0L, this);
    }
}
