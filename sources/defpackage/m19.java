package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class m19 extends FilterInputStream {
    public int a;
    public int b;

    public m19(InputStream inputStream, int i) {
        super(inputStream);
        if (i < 0) {
            ore.p("limit must be >= 0");
            throw null;
        }
        this.a = i;
        this.b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.b = this.a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        if (i3 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (i4 > 0) {
            this.a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            qr7.k("mark is not supported");
        } else if (this.b == -1) {
            qr7.k("mark not set");
        } else {
            ((FilterInputStream) this).in.reset();
            this.a = this.b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.a));
        this.a = (int) (((long) this.a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.a--;
        }
        return i;
    }
}
