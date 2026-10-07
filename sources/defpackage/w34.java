package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w34 extends nq4 {
    public ae3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ y34 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w34(y34 y34Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = y34Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return y34.b(this.f, this);
    }
}
