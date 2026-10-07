package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ivi extends nq4 {
    public wui d;
    public d1e e;
    public hvd f;
    public xui g;
    public /* synthetic */ Object h;
    public final /* synthetic */ mvi i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivi(mvi mviVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = mviVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return mvi.a(this.i, null, null, null, this);
    }
}
