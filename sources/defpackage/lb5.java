package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lb5 extends pd6 implements Executor {
    public static final lb5 c = new lb5();
    public static final xt4 d;

    static {
        oci ociVar = oci.c;
        int i = agh.a;
        if (64 >= i) {
            i = 64;
        }
        d = ociVar.R0(oc9.d0(i, 12, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        d.D0(vt4Var, runnable);
    }

    @Override // defpackage.xt4
    public final void I0(vt4 vt4Var, Runnable runnable) {
        d.I0(vt4Var, runnable);
    }

    @Override // defpackage.xt4
    public final xt4 R0(int i, String str) {
        return oci.c.R0(i, str);
    }

    @Override // defpackage.pd6
    public final Executor S0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D0(k66.a, runnable);
    }

    @Override // defpackage.xt4
    public final String toString() {
        return "Dispatchers.IO";
    }
}
