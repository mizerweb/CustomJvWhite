package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eu2 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ fu2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu2(fu2 fu2Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = fu2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
