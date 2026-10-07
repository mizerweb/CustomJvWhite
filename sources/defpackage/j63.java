package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j63 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ i63 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j63(i63 i63Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = i63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
