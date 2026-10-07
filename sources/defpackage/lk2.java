package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class lk2 implements Closeable {
    public final Object a = new Object();
    public nk2 b;
    public og7 c;
    public boolean d;

    public lk2(nk2 nk2Var, og7 og7Var) {
        this.b = nk2Var;
        this.c = og7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                nk2 nk2Var = this.b;
                synchronized (nk2Var.a) {
                    nk2Var.A();
                    nk2Var.b.remove(this);
                }
                this.b = null;
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    throw new IllegalStateException("Object already closed");
                }
                this.c.run();
                close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
