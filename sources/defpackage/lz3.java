package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lz3 extends nq4 {
    public q24 d;
    public gda e;
    public wfe f;
    public Object g;
    public wfe h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mz3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz3(mz3 mz3Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = mz3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(null, null, this);
    }
}
