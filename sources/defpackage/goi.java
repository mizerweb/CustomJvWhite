package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class goi extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ gpi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goi(gpi gpiVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = gpiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return gpi.B(this.e, this);
    }
}
