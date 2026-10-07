package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nz extends nq4 {
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ b00 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(b00 b00Var, lq4 lq4Var) {
        super(lq4Var);
        this.i = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.n(0L, false, false, false, this);
    }
}
