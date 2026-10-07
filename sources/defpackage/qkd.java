package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qkd extends nq4 {
    public rkd d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rkd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkd(rkd rkdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = rkdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(this);
    }
}
