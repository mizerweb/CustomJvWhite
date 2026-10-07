package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wwe extends nq4 {
    public tjh d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dxe f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwe(dxe dxeVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = dxeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
