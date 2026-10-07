package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class l15 implements u25 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public Uri e;

    public l15(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.u25
    public final void close() {
        this.d = false;
        this.e = null;
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) throws IOException {
        this.e = a35Var.a;
        int i = (int) a35Var.f;
        if (i >= 0) {
            byte[] bArr = this.a;
            if (i <= bArr.length) {
                this.b = i;
                int length = bArr.length - i;
                this.c = length;
                long j = a35Var.g;
                if (j != -1) {
                    this.c = Math.min(length, (int) j);
                }
                this.d = true;
                return this.c;
            }
        }
        qr7.k(zo5.h(i, "Invalid start position: "));
        return 0L;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.e;
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.d) {
            qr7.k("DataSource not opened");
            return 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        int i4 = this.b;
        System.arraycopy(this.a, i4, bArr, i, (i4 + iMin) - i4);
        this.b += iMin;
        this.c -= iMin;
        return iMin;
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
    }
}
