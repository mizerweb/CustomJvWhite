package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s09 implements c19 {
    public final t09 a;
    public final g19 b;

    public s09(g19 g19Var, t09 t09Var) {
        this.b = g19Var;
        this.a = t09Var;
    }

    @utb(m09.ON_DESTROY)
    public void onDestroy(g19 g19Var) {
        this.a.m(g19Var);
    }

    @utb(m09.ON_START)
    public void onStart(g19 g19Var) {
        this.a.g(g19Var);
    }

    @utb(m09.ON_STOP)
    public void onStop(g19 g19Var) {
        this.a.h(g19Var);
    }
}
