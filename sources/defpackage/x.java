package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends nq4 {
    public rt2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = yVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return y.B(this.f, null, this);
    }
}
