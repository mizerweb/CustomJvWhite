package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[np0.n];
        a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            a[c] = (byte) (c - '0');
        }
        for (char c2 = 'A'; c2 <= 'F'; c2 = (char) (c2 + 1)) {
            a[c2] = (byte) (c2 - '7');
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            a[c3] = (byte) (c3 - 'W');
        }
        a[46] = -4;
    }

    public static char a(int i, int i2, CharSequence charSequence) {
        if (i < i2) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    public static char b(char[] cArr, int i, int i2) {
        if (i < i2) {
            return cArr[i];
        }
        return (char) 0;
    }

    public static int c(int i, int i2, int i3) {
        if ((((i - i3) - i2) | i2 | i3) >= 0) {
            return i3 + i2;
        }
        ore.p("offset < 0 or length > str.length");
        return 0;
    }

    public static void d(boolean z, int i, int i2, int i3, long j) {
        if (z || i < i2) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j <= -2147483648L || j > 2147483647L || i3 > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    public static int e(char c) {
        if (c < 128) {
            return a[c];
        }
        return -1;
    }
}
