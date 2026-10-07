package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class blb extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ flb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(flb flbVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = flbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
