package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c0j extends nq4 {
    public l1j d;
    public j85 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hbc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0j(hbc hbcVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = hbcVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return hbc.d(this.g, null, this);
    }
}
