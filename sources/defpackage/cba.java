package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class cba implements Closeable {
    public final int a;
    public au3 b;

    public cba(g95 g95Var, int i) {
        g95Var.getClass();
        oc9.i(Boolean.valueOf(i >= 0 && i <= ((vaa) g95Var.K()).getSize()));
        this.b = g95Var.clone();
        this.a = i;
    }

    public final synchronized byte A(int i) {
        l();
        oc9.i(Boolean.valueOf(i >= 0));
        oc9.i(Boolean.valueOf(i < this.a));
        this.b.getClass();
        return ((vaa) this.b.K()).I(i);
    }

    public final synchronized void E(int i, int i2, int i3, byte[] bArr) {
        l();
        oc9.i(Boolean.valueOf(i + i3 <= this.a));
        this.b.getClass();
        ((vaa) this.b.K()).y(i, i2, i3, bArr);
    }

    public final synchronized int I() {
        l();
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        au3.E(this.b);
        this.b = null;
    }

    public final synchronized void l() {
        synchronized (this) {
        }
        if (!au3.W(this.b)) {
            throw new RuntimeException() { // from class: com.facebook.common.memory.PooledByteBuffer$ClosedException
            };
        }
    }

    public final synchronized ByteBuffer o() {
        this.b.getClass();
        return ((vaa) this.b.K()).o();
    }

    public final synchronized long y() {
        l();
        this.b.getClass();
        return ((vaa) this.b.K()).K();
    }
}
