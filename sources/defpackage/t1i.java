package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t1i extends nq4 {
    public zui d;
    public vzh e;
    public xui f;
    public /* synthetic */ Object g;
    public final /* synthetic */ u1i h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1i(u1i u1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = u1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, this);
    }
}
