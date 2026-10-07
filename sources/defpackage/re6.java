package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class re6 extends ne6 {
    public re6(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
        } else {
            ore.p("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void g(long j) throws IOException {
        int i = this.b;
        if (i > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= (long) i;
        }
        b((int) j);
    }

    public re6(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }
}
