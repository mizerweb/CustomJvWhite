package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ypj extends nq4 {
    public xpj d;
    public kkj e;
    public Long f;
    public Long g;
    public qpj h;
    public /* synthetic */ Object i;
    public final /* synthetic */ dqj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypj(dqj dqjVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = dqjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(null, this);
    }
}
