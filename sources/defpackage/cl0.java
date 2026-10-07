package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cl0 implements rj2 {
    public final al0[] a;

    public cl0(al0[] al0VarArr) {
        this.a = al0VarArr;
    }

    public final void a() {
        for (al0 al0Var : this.a) {
            no5 no5Var = al0Var.i;
            if (no5Var == null) {
                no5Var = null;
            }
            no5Var.dispose();
        }
    }

    @Override // defpackage.rj2
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
