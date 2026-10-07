package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eoj extends nq4 {
    public qrj d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ioj g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoj(ioj iojVar, lq4 lq4Var) {
        super(lq4Var);
        this.g = iojVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.S(null, this);
    }
}
