package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sjj extends nq4 {
    public pjj d;
    public uij e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ujj g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjj(ujj ujjVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ujjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.i(null, this);
    }
}
