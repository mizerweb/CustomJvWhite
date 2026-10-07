package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kvi extends nq4 {
    public wui d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mvi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvi(mvi mviVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = mviVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return mvi.c(this.f, null, this);
    }
}
