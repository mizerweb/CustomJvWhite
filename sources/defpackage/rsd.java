package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rsd extends nq4 {
    public vg4 d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ssd g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsd(ssd ssdVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ssdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(null, null, null, this);
    }
}
