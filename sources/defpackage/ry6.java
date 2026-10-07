package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ry6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ tz f;
    public tz g;
    public yx6 h;
    public int i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry6(tz tzVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = tzVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
