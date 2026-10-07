package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u04 extends nq4 {
    public long d;
    public p20 e;
    public sfa f;
    public /* synthetic */ Object g;
    public final /* synthetic */ js8 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u04(js8 js8Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = js8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(0L, null, this);
    }
}
