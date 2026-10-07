package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lik extends nq4 {
    public Object d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nik g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lik(nik nikVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = nikVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0, this);
    }
}
