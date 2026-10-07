package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hd5 extends pd6 {
    public static final hd5 d;
    public fu4 c;

    static {
        int i = ykh.c;
        int i2 = ykh.d;
        long j = ykh.e;
        String str = ykh.a;
        hd5 hd5Var = new hd5();
        hd5Var.c = new fu4(j, str, i, i2);
        d = hd5Var;
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        fu4.A(this.c, runnable, 6);
    }

    @Override // defpackage.xt4
    public final void I0(vt4 vt4Var, Runnable runnable) {
        fu4.A(this.c, runnable, 2);
    }

    @Override // defpackage.xt4
    public final xt4 R0(int i, String str) {
        n1g.m(i);
        if (i >= ykh.c) {
            return str != null ? new qab(this, str) : this;
        }
        return super.R0(i, str);
    }

    @Override // defpackage.pd6
    public final Executor S0() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.xt4
    public final String toString() {
        return "Dispatchers.Default";
    }
}
