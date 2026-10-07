package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ntl {
    public static final int a(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                qr7.k("no more bytes");
                return 0;
            }
            if (z) {
                i2 = (i5 & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = i5 & 255;
            }
            i3 |= i2;
        }
        return i3;
    }
}
