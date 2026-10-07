package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bxe extends nq4 {
    public int d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dxe g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxe(dxe dxeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = dxeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.i(0, this);
    }
}
