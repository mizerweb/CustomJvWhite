package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m50 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ k50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(k50 k50Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = k50Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
