package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pj5 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ iv2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj5(iv2 iv2Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = iv2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
