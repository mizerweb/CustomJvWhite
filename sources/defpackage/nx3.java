package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ox3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx3(ox3 ox3Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = ox3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
