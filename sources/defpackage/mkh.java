package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mkh extends nq4 {
    public long d;
    public ctc e;
    public Throwable f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ okh i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkh(okh okhVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = okhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.i(0L, this, null);
    }
}
