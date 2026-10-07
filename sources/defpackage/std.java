package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class std extends nq4 {
    public ujd d;
    public cpd e;
    public /* synthetic */ Object f;
    public final /* synthetic */ utd g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public std(utd utdVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = utdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, null, this);
    }
}
