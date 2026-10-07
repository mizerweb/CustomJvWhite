package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wai extends nq4 {
    public long d;
    public long e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xai i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wai(xai xaiVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = xaiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objA = this.i.a(0L, 0L, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
