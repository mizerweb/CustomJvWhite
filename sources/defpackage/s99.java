package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface s99 {
    boolean a();

    default boolean b(long j) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean c(long j, boolean z) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    long d();

    qf e(z3d z3dVar);

    void f(r99 r99Var, rg6[] rg6VarArr);

    default boolean g() {
        lvb.G0("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    void h(z3d z3dVar);

    void i(z3d z3dVar);

    void j(z3d z3dVar);

    default boolean k(r99 r99Var) {
        return b(r99Var.d);
    }

    default boolean l(r99 r99Var) {
        return c(r99Var.d, r99Var.f);
    }
}
