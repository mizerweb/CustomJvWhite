package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oza extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ pza e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oza(pza pzaVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = pzaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(this);
    }
}
