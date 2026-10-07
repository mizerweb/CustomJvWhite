package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class snb extends nq4 {
    public tnb d;
    public xmb e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tnb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snb(tnb tnbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = tnbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return tnb.b(this.g, null, this);
    }
}
