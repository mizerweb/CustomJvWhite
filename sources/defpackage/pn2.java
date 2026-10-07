package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pn2 extends nq4 {
    public ln2 d;
    public un2 e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ un2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn2(un2 un2Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = un2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, this);
    }
}
