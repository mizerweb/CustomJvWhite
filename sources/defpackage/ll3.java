package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ll3 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ iz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll3(iz izVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = izVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
