package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class g31 extends InputStream {
    public final /* synthetic */ l31 a;

    public g31(l31 l31Var) {
        this.a = l31Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        l31 l31Var = this.a;
        if (l31Var.b > 0) {
            return l31Var.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
