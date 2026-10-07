package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mk4 extends nq4 {
    public Iterable d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pk4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk4(pk4 pk4Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = pk4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return pk4.d(this.f, this);
    }
}
