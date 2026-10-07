package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vq2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ wq2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq2(wq2 wq2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = wq2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return wq2.B(this.e, null, false, this);
    }
}
