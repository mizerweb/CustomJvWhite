package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xa2 extends nq4 {
    public se2 d;
    public ue e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ya2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa2(ya2 ya2Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = ya2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
