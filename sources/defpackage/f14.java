package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f14 extends nq4 {
    public g24 d;
    public uy3 e;
    public uy3 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ g24 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f14(g24 g24Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = g24Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return g24.c(this.h, null, null, this);
    }
}
