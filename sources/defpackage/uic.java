package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uic {
    public static final char[] a;

    static {
        char[] cArr = new char[np0.o];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | np0.n] = "0123456789abcdef".charAt(i & 15);
        }
        a = cArr;
        byte[] bArr = new byte[np0.m];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr["0123456789abcdef".charAt(i2)] = (byte) i2;
        }
        boolean[] zArr = new boolean[65535];
        int i3 = 0;
        while (i3 < 65535) {
            zArr[i3] = (48 <= i3 && i3 <= 57) || (97 <= i3 && i3 <= 102);
            i3++;
        }
    }
}
