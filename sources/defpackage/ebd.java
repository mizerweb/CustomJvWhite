package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class ebd extends InputStream {
    public final InputStream a;
    public final byte[] b;
    public final ine c;
    public int d;
    public int e;
    public boolean f;

    public ebd(InputStream inputStream, byte[] bArr, ine ineVar) {
        this.a = inputStream;
        bArr.getClass();
        this.b = bArr;
        ineVar.getClass();
        this.c = ineVar;
        this.d = 0;
        this.e = 0;
        this.f = false;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        oc9.r(this.e <= this.d);
        l();
        return this.a.available() + (this.d - this.e);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.d(this.b);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.f) {
            if (pj6.a.h(6)) {
                pj6.a.e("PooledByteInputStream", "Finalized without closing");
            }
            close();
        }
        super.finalize();
    }

    public final void l() throws IOException {
        if (this.f) {
            qr7.k("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        oc9.r(this.e <= this.d);
        l();
        int i3 = this.e;
        int i4 = this.d;
        byte[] bArr2 = this.b;
        if (i3 >= i4) {
            int i5 = this.a.read(bArr2);
            if (i5 <= 0) {
                return -1;
            }
            this.d = i5;
            this.e = 0;
        }
        int iMin = Math.min(this.d - this.e, i2);
        System.arraycopy(bArr2, this.e, bArr, i, iMin);
        this.e += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        oc9.r(this.e <= this.d);
        l();
        int i = this.d;
        int i2 = this.e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.e = (int) (((long) i2) + j);
            return j;
        }
        this.e = i;
        return this.a.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        oc9.r(this.e <= this.d);
        l();
        int i = this.e;
        int i2 = this.d;
        byte[] bArr = this.b;
        if (i >= i2) {
            int i3 = this.a.read(bArr);
            if (i3 <= 0) {
                return -1;
            }
            this.d = i3;
            this.e = 0;
        }
        int i4 = this.e;
        this.e = i4 + 1;
        return bArr[i4] & 255;
    }
}
