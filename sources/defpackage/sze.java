package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sze extends nq4 {
    public v78 d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vze h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sze(vze vzeVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = vzeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return vze.a(this.h, null, false, false, this);
    }
}
