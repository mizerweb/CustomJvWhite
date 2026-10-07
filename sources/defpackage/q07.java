package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q07 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ l07 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q07(l07 l07Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = l07Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
