package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b63 extends nq4 {
    public sfa d;
    public qy9 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ l63 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b63(l63 l63Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = l63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return l63.E(this.h, null, this);
    }
}
