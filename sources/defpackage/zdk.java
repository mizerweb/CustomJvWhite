package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zdk {
    public static final Charset b = Charset.forName("US-ASCII");
    public final h6f a = new h6f();

    public zdk() {
        new cek();
        new ArrayList();
    }

    public static void a(int i, byte b2, int i2, ByteBuffer byteBuffer) {
        int iPow = (int) (Math.pow(2.0d, i) - 1.0d);
        if (i2 < iPow) {
            byteBuffer.put((byte) (b2 | i2));
            return;
        }
        byteBuffer.put((byte) (b2 | iPow));
        int i3 = i2 - iPow;
        while (i3 > 128) {
            byteBuffer.put((byte) (128 | (i3 % np0.m)));
            i3 /= np0.m;
        }
        byteBuffer.put((byte) i3);
    }
}
