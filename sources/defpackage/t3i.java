package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t3i extends nq4 {
    public int d;
    public wfe e;
    public fda f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ x3i i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3i(x3i x3iVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = x3iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(false, this);
    }
}
