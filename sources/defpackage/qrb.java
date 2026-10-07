package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qrb extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ w4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrb(w4 w4Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = w4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        this.e.h(null, this);
        return hu4.a;
    }
}
