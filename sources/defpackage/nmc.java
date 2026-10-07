package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nmc {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final u98 f = u98.l(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public nmc(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return k4m.d((byte) 0, l0m.a(((i & 7) << 2) | ((i2 & 48) >> 4)), l0m.a(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), l0m.a(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static int d(Charset charset) {
        lvb.S(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b) {
        return (b & 192) == 128;
    }

    public final int A() {
        f(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public final int D() {
        f(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int E() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        ore.k(zo5.h(iM, "Top bit not zero: "));
        return 0;
    }

    public final int F() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                ore.k("Attempting to read a byte over the limit.");
                return 0;
            }
            long jA = A();
            j |= (127 & jA) << (i * 7);
            if ((jA & 128) == 0) {
                break;
            }
        }
        return k4m.b(j);
    }

    public final long G() {
        long jU = u();
        if (jU >= 0) {
            return jU;
        }
        ore.k(zo5.j(jU, "Top bit not zero: "));
        return 0L;
    }

    public final int H() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long I() {
        int i;
        f(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            if (i2 >= 0) {
                int i3 = 1 << i2;
                if ((((long) i3) & j) == 0) {
                    if (i2 < 6) {
                        j &= (long) (i3 - 1);
                        i = 7 - i2;
                        break;
                    }
                    if (i2 == 7) {
                        i = 1;
                        break;
                    }
                } else {
                    i2--;
                }
            }
            i = 0;
            break;
        }
        if (i == 0) {
            throw new NumberFormatException(zo5.j(j, "Invalid UTF-8 sequence first byte: "));
        }
        f(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.a[this.b + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(zo5.j(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i;
        return j;
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void K(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        L(i, bArr);
    }

    public final void L(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void M(int i) {
        lvb.R(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void N(int i) {
        lvb.R(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void O(int i) {
        N(this.b + i);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(int i) {
        if (!g.get() || a() >= i) {
            return;
        }
        ch9.b(zo5.y(i, "bytesNeeded= ", ", bytesLeft="), a());
    }

    public final char g(int i, ByteOrder byteOrder) {
        f(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            return gll.c(bArr[i3], bArr[i3 + 1]);
        }
        int i4 = i2 + i;
        return gll.c(bArr[i4 + 1], bArr[i4]);
    }

    public final int h(Charset charset) {
        int codePoint;
        int i;
        lvb.S(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            qr7.l("position=", this.b, ", limit=", this.c);
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                codePoint = l0m.c(b);
                return (codePoint << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) {
                i = 2;
            } else if ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) {
                i = 3;
            } else {
                i = ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) ? 4 : 0;
            }
            if (i == 1) {
                codePoint = l0m.c(this.a[this.b]);
            } else if (i == 2) {
                byte[] bArr = this.a;
                int i3 = this.b;
                codePoint = b(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr2 = this.a;
                        int i4 = this.b;
                        codePoint = b(bArr2[i4], bArr2[i4 + 1], bArr2[i4 + 2], bArr2[i4 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i5 = this.b;
                codePoint = b(0, bArr3[i5] & 15, bArr3[i5 + 1], bArr3[i5 + 2]);
            }
            i2 = i;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cG = g(0, byteOrder);
            if (!Character.isHighSurrogate(cG) || a() < 4) {
                codePoint = cG;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cG, g(2, byteOrder));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    public final int i() {
        if (a() < 4) {
            qr7.l("position=", this.b, ", limit=", this.c);
            return 0;
        }
        int iM = m();
        this.b -= 4;
        return iM;
    }

    public final int j() {
        f(1);
        return this.a[this.b] & 255;
    }

    public final void k(int i, byte[] bArr, int i2) {
        f(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char l(Charset charset, char[] cArr) {
        int iH;
        if (a() < d(charset) || (iH = h(charset)) == 0) {
            return (char) 0;
        }
        int iA = n0m.a(iH >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cA = gll.a(iA);
        if (!gll.b(cA, cArr)) {
            return (char) 0;
        }
        this.b = k4m.b(iH & 255) + this.b;
        return cA;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[SYNTHETIC] */
    public final String n(Charset charset) {
        int i;
        byte[] bArr;
        lvb.S(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            J();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                qr7.y(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && vqi.Q(this.a[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2] == 0 && vqi.Q(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.a;
                    if (bArr[i2 + 1] == 0 && vqi.Q(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strY = y(i2 - this.b, charset);
        if (this.b != this.c && l(charset, d) == '\r') {
            l(charset, e);
        }
        return strY;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public final short q() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long r() {
        f(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public final int s() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        ore.k(zo5.h(iO, "Top bit not zero: "));
        return 0;
    }

    public final int t() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long u() {
        f(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = vqi.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final String w(int i) {
        f(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = vqi.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String y(int i, Charset charset) {
        f(i);
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int z() {
        return A() | (A() << 21) | (A() << 14) | (A() << 7);
    }

    public nmc() {
        this.a = vqi.b;
    }

    public nmc(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public nmc(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}
