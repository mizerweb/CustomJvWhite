package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q29 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ f90 f;
    public l49 g;
    public yx6 h;
    public yx6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q29(f90 f90Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = f90Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
