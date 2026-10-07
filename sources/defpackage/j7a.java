package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j7a extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ l07 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7a(l07 l07Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = l07Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
