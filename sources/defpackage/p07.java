package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p07 extends nq4 {
    public f90 d;
    public wfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ f90 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p07(f90 f90Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = f90Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
