package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxd extends nq4 {
    public lme d;
    public String e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ txd h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxd(txd txdVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = txdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.h(null, this);
    }
}
