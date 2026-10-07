package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p1a extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ eh8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1a(eh8 eh8Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = eh8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
