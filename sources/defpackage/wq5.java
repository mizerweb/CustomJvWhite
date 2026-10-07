package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wq5 extends nq4 {
    public boolean d;
    public boolean e;
    public String f;
    public /* synthetic */ Object g;
    public final /* synthetic */ er5 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq5(er5 er5Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = er5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(this, null, false, false);
    }
}
