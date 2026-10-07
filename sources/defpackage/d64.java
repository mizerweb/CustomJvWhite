package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d64 extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ f64 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d64(f64 f64Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = f64Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return f64.C(this.f, 0, this);
    }
}
