package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lvi extends nq4 {
    public xui d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mvi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvi(mvi mviVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = mviVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
