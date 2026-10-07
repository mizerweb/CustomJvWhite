package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n4c extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ bb9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4c(bb9 bb9Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = bb9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
