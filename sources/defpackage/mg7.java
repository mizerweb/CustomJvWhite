package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mg7 implements s72, u00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ mg7(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        jm5 jm5VarA = zjl.a();
        e89 e89Var = this.b;
        o9b.i(false, e89Var, r72Var, jm5VarA);
        return "nonCancellationPropagating[" + e89Var + "]";
    }

    @Override // defpackage.u00
    public e89 apply(Object obj) {
        int i = this.a;
        e89 e89Var = this.b;
        switch (i) {
            case 1:
                return ((fd2) e89Var.get()).a();
            default:
                return ((fd2) e89Var.get()).b();
        }
    }
}
