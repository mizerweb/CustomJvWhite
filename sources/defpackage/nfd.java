package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nfd extends nq4 {
    public gka d;
    public xui e;
    public wui f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pfd h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfd(pfd pfdVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = pfdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, null, this);
    }
}
