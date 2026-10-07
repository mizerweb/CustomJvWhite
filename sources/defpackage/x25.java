package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class x25 extends InputStream {
    public final u25 a;
    public final a35 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public x25(u25 u25Var, a35 a35Var) {
        this.a = u25Var;
        this.b = a35Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    public final void l() {
        if (this.d) {
            return;
        }
        this.a.f(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        lvb.b0(!this.e);
        l();
        int i3 = this.a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
