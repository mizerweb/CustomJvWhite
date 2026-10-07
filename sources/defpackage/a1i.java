package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a1i extends nq4 {
    public long d;
    public long e;
    public long f;
    public k1i g;
    public /* synthetic */ Object h;
    public final /* synthetic */ e1i i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1i(e1i e1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = e1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return e1i.b(this.i, 0L, 0L, 0L, null, null, this);
    }
}
