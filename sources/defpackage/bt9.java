package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bt9 extends nq4 {
    public long d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ct9 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt9(ct9 ct9Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = ct9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, this, null);
    }
}
