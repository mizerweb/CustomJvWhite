package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sz7 extends nq4 {
    public wfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tz7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz7(tz7 tz7Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = tz7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return tz7.a(this.f, null, this);
    }
}
