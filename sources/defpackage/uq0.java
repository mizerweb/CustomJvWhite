package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class uq0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public uq0(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iD = g4m.d(length);
            this.d = iD;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iD);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iD >> iNumberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[g4m.b(i2 * 8, i3)] = true;
            }
            this.h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uq0)) {
            return false;
        }
        uq0 uq0Var = (uq0) obj;
        return this.h == uq0Var.h && Arrays.equals(this.b, uq0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uq0(String str, char[] cArr) {
        byte[] bArr = new byte[np0.m];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    ore.p(qe7.z("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                ore.p(qe7.z("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
