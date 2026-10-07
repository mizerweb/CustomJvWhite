package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kqe extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ lqe e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqe(lqe lqeVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = lqeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return lqe.d(this.e, this);
    }
}
