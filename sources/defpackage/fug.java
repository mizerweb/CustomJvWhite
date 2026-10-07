package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fug extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ el9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fug(el9 el9Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = el9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
