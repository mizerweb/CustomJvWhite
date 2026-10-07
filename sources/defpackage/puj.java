package defpackage;

import java.io.UnsupportedEncodingException;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public abstract class puj {
    public static boolean a;
    public static final byte[] b = a("RIFF");
    public static final byte[] c = a("WEBP");
    public static final byte[] d = a("VP8 ");
    public static final byte[] e = a("VP8L");
    public static final byte[] f = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes(HTTP.ASCII);
        } catch (UnsupportedEncodingException e2) {
            ore.h("ASCII not found!", e2);
            return null;
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 != null && bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2 + i] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }
}
