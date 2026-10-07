package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xie extends nq4 {
    public String d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yie g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xie(yie yieVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = yieVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(0L, this, null);
    }
}
