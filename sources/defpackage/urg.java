package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class urg extends nq4 {
    public long d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ asg g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urg(asg asgVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = asgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(0L, this);
    }
}
