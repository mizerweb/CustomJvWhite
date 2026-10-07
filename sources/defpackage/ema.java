package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ema extends nq4 {
    public sfa d;
    public ynh e;
    public boolean f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ nma i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ema(nma nmaVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = nmaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.K(null, false, this);
    }
}
