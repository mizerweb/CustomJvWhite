package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wzi extends nq4 {
    public Object d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ f90 g;
    public l9b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzi(f90 f90Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = f90Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
