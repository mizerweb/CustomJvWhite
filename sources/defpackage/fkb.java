package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fkb extends nq4 {
    public long d;
    public gda e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gkb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkb(gkb gkbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = gkbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return gkb.a(this.g, 0L, null, this);
    }
}
