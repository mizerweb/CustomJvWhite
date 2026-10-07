package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class elb extends nq4 {
    public CharSequence d;
    public Long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ flb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elb(flb flbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = flbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, null, null, this);
    }
}
