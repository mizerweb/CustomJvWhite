package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sz3 extends nq4 {
    public sfa d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tz3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz3(tz3 tz3Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = tz3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this, null);
    }
}
