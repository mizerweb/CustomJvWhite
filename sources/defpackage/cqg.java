package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cqg extends nq4 {
    public bqg d;
    public kli e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dqg g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqg(dqg dqgVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = dqgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return dqg.a(this.g, null, null, this);
    }
}
