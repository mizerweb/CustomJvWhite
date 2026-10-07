package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class jb5 implements h68 {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = qe7.j("GIF87a");
    public static final byte[] g = qe7.j("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public final int a;

    static {
        byte[] bArrJ = qe7.j("BM");
        h = bArrJ;
        i = bArrJ.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        l = qe7.j("ftyp");
        m = new byte[][]{qe7.j("heic"), qe7.j("heix"), qe7.j("hevc"), qe7.j("hevx"), qe7.j("mif1"), qe7.j("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
        p = 4;
        q = new byte[]{3, 0, 8, 0};
        r = qe7.j("ftyp");
        s = qe7.j("avif");
    }

    public jb5() {
        Object objI1 = a.i1(new Integer[]{21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12, 4, 12});
        if (objI1 != null) {
            this.a = ((Number) objI1).intValue();
        } else {
            ore.k("Required value was null.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    @Override // defpackage.h68
    public final i68 a(int i2, byte[] bArr) {
        boolean zX;
        if (i2 >= 20) {
            byte[] bArr2 = puj.b;
            if (puj.b(bArr, bArr2, 0)) {
                byte[] bArr3 = puj.c;
                if (puj.b(bArr, bArr3, 8)) {
                    if (i2 < 20 || !puj.b(bArr, bArr2, 0) || !puj.b(bArr, bArr3, 8)) {
                        ore.k("Check failed.");
                        return null;
                    }
                    if (puj.b(bArr, puj.d, 12)) {
                        return kb5.f;
                    }
                    if (puj.b(bArr, puj.e, 12)) {
                        return kb5.g;
                    }
                    if (i2 >= 21) {
                        byte[] bArr4 = puj.f;
                        if (puj.b(bArr, bArr4, 12)) {
                            boolean zB = puj.b(bArr, bArr4, 12);
                            boolean z = (bArr[20] & 2) == 2;
                            if (zB && z) {
                                return kb5.j;
                            }
                            return (puj.b(bArr, bArr4, 12) && ((bArr[20] & 16) == 16)) ? kb5.i : kb5.h;
                        }
                    }
                }
            }
            return i68.c;
        }
        boolean z2 = puj.a;
        if (i2 >= 3 && qe7.x(bArr, b, 0)) {
            return kb5.a;
        }
        if (i2 >= 8 && qe7.x(bArr, d, 0)) {
            return kb5.b;
        }
        if (i2 >= 6 && (qe7.x(bArr, f, 0) || qe7.x(bArr, g, 0))) {
            return kb5.c;
        }
        byte[] bArr5 = h;
        if (i2 < bArr5.length ? false : qe7.x(bArr, bArr5, 0)) {
            return kb5.d;
        }
        byte[] bArr6 = j;
        if (i2 < bArr6.length ? false : qe7.x(bArr, bArr6, 0)) {
            return kb5.e;
        }
        if (i2 < 12) {
            zX = false;
        } else if ((bArr.length < 4 ? -1 : ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) >= 8 && qe7.x(bArr, r, 4)) {
            zX = qe7.x(bArr, s, 8);
        } else {
            zX = false;
        }
        if (zX) {
            return kb5.n;
        }
        if (i2 >= 12 && bArr[3] >= 8 && qe7.x(bArr, l, 4)) {
            for (byte[] bArr7 : m) {
                if (qe7.x(bArr, bArr7, 8)) {
                    return kb5.k;
                }
            }
        }
        if (i2 >= 4 && qe7.x(bArr, q, 0)) {
            return kb5.m;
        }
        if (i2 >= p && (qe7.x(bArr, n, 0) || qe7.x(bArr, o, 0))) {
            return kb5.l;
        }
        return i68.c;
    }

    @Override // defpackage.h68
    public final int b() {
        return this.a;
    }
}
