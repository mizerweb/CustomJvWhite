package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tz6 extends nq4 {
    public gy6 d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ gy6 g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz6(gy6 gy6Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = gy6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
