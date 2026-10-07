package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pz extends nq4 {
    public long d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ b00 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(b00 b00Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.w(0L, false, false, this);
    }
}
