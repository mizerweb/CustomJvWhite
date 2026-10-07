package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fbd extends InputStream {
    public final cba a;
    public int b;
    public int c;

    public fbd(cba cbaVar) {
        boolean zW;
        synchronized (cbaVar) {
            zW = au3.W(cbaVar.b);
        }
        oc9.i(Boolean.valueOf(zW));
        this.a = cbaVar;
        this.b = 0;
        this.c = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.I() - this.b;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.c = this.b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            qt4.x(bArr.length, i, "; regionStart=", "; regionLength=", sb);
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i2);
        this.a.E(this.b, i, iMin, bArr);
        this.b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.b = this.c;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        oc9.i(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.b;
        this.b = i + 1;
        return this.a.A(i) & 255;
    }
}
