package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xzb extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ d0c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzb(d0c d0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = d0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
