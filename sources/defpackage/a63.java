package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a63 extends nq4 {
    public qy9 d;
    public sfa e;
    public CharSequence f;
    public CharSequence g;
    public /* synthetic */ Object h;
    public final /* synthetic */ l63 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a63(l63 l63Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = l63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.U(null, this);
    }
}
