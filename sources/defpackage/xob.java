package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xob extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ yob e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xob(yob yobVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = yobVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return yob.d(this.e, null, this);
    }
}
