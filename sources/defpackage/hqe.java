package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hqe extends nq4 {
    public Object[] d;
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ lqe i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqe(lqe lqeVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = lqeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return lqe.a(this.i, null, this);
    }
}
