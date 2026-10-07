package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aqj extends nq4 {
    public xpj d;
    public jqj e;
    public rpj f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dqj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqj(dqj dqjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = dqjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, this);
    }
}
