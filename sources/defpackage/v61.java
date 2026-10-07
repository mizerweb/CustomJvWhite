package defpackage;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class v61 {
    public final v61 a;
    public final AtomicReference b;
    public final int c;
    public final uj8 d;
    public final boolean e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String[] l;
    public int m;
    public int n;
    public boolean o;

    public v61(v61 v61Var, int i, u61 u61Var, boolean z, boolean z2) {
        this.a = v61Var;
        this.c = i;
        this.d = z ? uj8.b : null;
        this.e = z2;
        this.b = null;
        this.k = u61Var.b;
        int i2 = u61Var.a;
        this.g = i2;
        int i3 = i2 << 2;
        this.h = i3;
        this.i = i3 + (i3 >> 1);
        this.j = u61Var.c;
        this.f = u61Var.d;
        this.l = u61Var.e;
        this.m = u61Var.f;
        this.n = u61Var.g;
        this.o = true;
    }

    public final int a(int i) {
        return ((this.g - 1) & i) << 2;
    }

    public final int b(int i) throws StreamConstraintsException {
        int iA = a(i);
        int[] iArr = this.f;
        if (iArr[iA + 3] == 0) {
            return iA;
        }
        if (this.k > (this.g >> 1)) {
            int iD = (this.m - d()) >> 2;
            int i2 = this.k;
            if (iD > ((i2 + 1) >> 7) || i2 > ((int) ((((long) this.g) * 3435973837L) >>> 32))) {
                return c(i);
            }
        }
        int i3 = this.h + ((iA >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((iA >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this.m;
        int i9 = i8 + 4;
        this.m = i9;
        int i10 = this.g;
        if (i9 < (i10 << 3)) {
            return i8;
        }
        if (!this.e || i10 <= 1024) {
            return c(i);
        }
        StringBuilder sb = new StringBuilder("Spill-over slots in symbol table with ");
        sb.append(this.k);
        sb.append(" entries, hash area of ");
        sb.append(this.g);
        sb.append(" slots is now full (all ");
        throw new StreamConstraintsException(zo5.t(sb, this.g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
    }

    public final int c(int i) throws StreamConstraintsException {
        int i2;
        this.o = false;
        int[] iArr = this.f;
        String[] strArr = this.l;
        int i3 = this.g;
        int i4 = this.k;
        int i5 = i3 + i3;
        int i6 = this.m;
        if (i5 > 65536) {
            n(true);
        } else {
            this.f = new int[iArr.length + (i3 << 3)];
            this.g = i5;
            int i7 = i5 << 2;
            this.h = i7;
            this.i = i7 + (i7 >> 1);
            int i8 = i5 >> 2;
            if (i8 < 64) {
                i2 = 4;
            } else if (i8 <= 256) {
                i2 = 5;
            } else {
                i2 = i8 <= 1024 ? 6 : 7;
            }
            this.j = i2;
            this.l = new String[strArr.length << 1];
            n(false);
            int[] iArr2 = new int[16];
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10 += 4) {
                int i11 = iArr[i10 + 3];
                if (i11 != 0) {
                    i9++;
                    String str = strArr[i10 >> 2];
                    if (i11 == 1) {
                        iArr2[0] = iArr[i10];
                        f(str, iArr2, 1);
                    } else if (i11 == 2) {
                        iArr2[0] = iArr[i10];
                        iArr2[1] = iArr[i10 + 1];
                        f(str, iArr2, 2);
                    } else if (i11 != 3) {
                        if (i11 > iArr2.length) {
                            iArr2 = new int[i11];
                        }
                        System.arraycopy(iArr, iArr[i10 + 1], iArr2, 0, i11);
                        f(str, iArr2, i11);
                    } else {
                        iArr2[0] = iArr[i10];
                        iArr2[1] = iArr[i10 + 1];
                        iArr2[2] = iArr[i10 + 2];
                        f(str, iArr2, 3);
                    }
                }
            }
            if (i9 != i4) {
                ore.k(qt4.l("Internal error: Failed rehash(), old count=", i4, i9, ", copyCount="));
                return 0;
            }
        }
        int iA = a(i);
        int[] iArr3 = this.f;
        if (iArr3[iA + 3] == 0) {
            return iA;
        }
        int i12 = this.h + ((iA >> 3) << 2);
        if (iArr3[i12 + 3] == 0) {
            return i12;
        }
        int i13 = this.i;
        int i14 = this.j;
        int i15 = i13 + ((iA >> (i14 + 2)) << i14);
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            if (iArr3[i15 + 3] == 0) {
                return i15;
            }
            i15 += 4;
        }
        int i17 = this.m;
        this.m = i17 + 4;
        return i17;
    }

    public final int d() {
        int i = this.g;
        return (i << 3) - i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    public final boolean e(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr2 = this.f;
        switch (i) {
            case 4:
                i3 = 0;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                return iArr[i9] != iArr2[i10] && iArr[i3 + 3] == iArr2[i2 + 3];
            case 5:
                i4 = 0;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            case 6:
                i5 = 0;
                i4 = i5 + 1;
                i12 = i2 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            case 7:
                i6 = 0;
                i5 = i6 + 1;
                i13 = i2 + 1;
                if (iArr[i6] != iArr2[i2]) {
                    return false;
                }
                i2 = i13;
                i4 = i5 + 1;
                i12 = i2 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            case 8:
                int i14 = i2 + 1;
                if (iArr[0] != iArr2[i2]) {
                    return false;
                }
                i2 = i14;
                i6 = 1;
                i5 = i6 + 1;
                i13 = i2 + 1;
                if (iArr[i6] != iArr2[i2]) {
                    return false;
                }
                i2 = i13;
                i4 = i5 + 1;
                i12 = i2 + 1;
                if (iArr[i5] != iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                i11 = i2 + 1;
                if (iArr[i4] != iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                i7 = i3 + 1;
                i8 = i2 + 1;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
                i9 = i3 + 2;
                i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                if (iArr[i9] != iArr2[i10]) {
                    return false;
                }
            default:
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    int i17 = i2 + 1;
                    if (iArr[i15] != this.f[i2]) {
                        return false;
                    }
                    if (i16 >= i) {
                        return true;
                    }
                    i15 = i16;
                    i2 = i17;
                }
                break;
        }
    }

    public final String f(String str, int[] iArr, int i) throws StreamConstraintsException {
        int iB;
        if (this.o) {
            if (this.a == null) {
                if (this.k == 0) {
                    ore.k("Internal error: Cannot add names to Root symbol table");
                    return null;
                }
                ore.k("Internal error: Cannot add names to Placeholder symbol table");
                return null;
            }
            int[] iArr2 = this.f;
            this.f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.o = false;
        }
        uj8 uj8Var = this.d;
        if (uj8Var != null) {
            str = uj8Var.a(str);
        }
        if (i == 1) {
            int i2 = iArr[0] ^ this.c;
            int i3 = i2 + (i2 >>> 16);
            int i4 = i3 ^ (i3 << 3);
            iB = b(i4 + (i4 >>> 12));
            int[] iArr3 = this.f;
            iArr3[iB] = iArr[0];
            iArr3[iB + 3] = 1;
        } else if (i == 2) {
            iB = b(g(iArr[0], iArr[1]));
            int[] iArr4 = this.f;
            iArr4[iB] = iArr[0];
            iArr4[iB + 1] = iArr[1];
            iArr4[iB + 3] = 2;
        } else if (i != 3) {
            int i5 = i(i, iArr);
            iB = b(i5);
            int[] iArr5 = this.f;
            iArr5[iB] = i5;
            int i6 = this.n;
            int i7 = i6 + i;
            if (i7 < 0) {
                ore.k(qt4.l("Internal error: long name offset overflow; start=", i6, i, ", qlen="));
                return null;
            }
            if (i7 > iArr5.length) {
                this.f = Arrays.copyOf(this.f, Math.max(i7 - iArr5.length, Math.min(np0.r, this.g)) + this.f.length);
            }
            System.arraycopy(iArr, 0, this.f, i6, i);
            this.n = i7;
            int[] iArr6 = this.f;
            iArr6[iB + 1] = i6;
            iArr6[iB + 3] = i;
        } else {
            iB = b(h(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f;
            iArr7[iB] = iArr[0];
            iArr7[iB + 1] = iArr[1];
            iArr7[iB + 2] = iArr[2];
            iArr7[iB + 3] = 3;
        }
        this.l[iB >> 2] = str;
        this.k++;
        return str;
    }

    public final int g(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = this.c;
        int i5 = i4 ^ ((i2 * 33) + (i3 ^ (i3 >>> 9)));
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    public final int h(int i, int i2, int i3) {
        int i4 = this.c ^ i;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public final int i(int i, int[] iArr) {
        if (i < 4) {
            ore.p("qlen is too short, needs to be at least 4");
            return 0;
        }
        int i2 = this.c ^ iArr[0];
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return i9 ^ (i9 << 5);
    }

    public final String j(int i) {
        int i2 = this.c ^ i;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        int iA = a(i4 + (i4 >>> 12));
        int[] iArr = this.f;
        int i5 = iArr[iA + 3];
        if (i5 == 1) {
            if (iArr[iA] == i) {
                return this.l[iA >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.h + ((iA >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 1) {
            if (iArr[i6] == i) {
                return this.l[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this.i;
        int i9 = this.j;
        int i10 = i8 + ((iA >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i == iArr[i10] && 1 == i12) {
                return this.l[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i == iArr[iD] && 1 == iArr[iD + 3]) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final String k(int i, int i2) {
        int iA = a(g(i, i2));
        int[] iArr = this.f;
        int i3 = iArr[iA + 3];
        if (i3 == 2) {
            if (i == iArr[iA] && i2 == iArr[iA + 1]) {
                return this.l[iA >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((iA >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = i6 + ((iA >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i == iArr[i8] && i2 == iArr[i8 + 1] && 2 == i10) {
                return this.l[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i == iArr[iD] && i2 == iArr[iD + 1] && 2 == iArr[iD + 3]) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final String l(int i, int i2, int i3) {
        int iA = a(h(i, i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[iA + 3];
        if (i4 == 3) {
            if (i == iArr[iA] && iArr[iA + 1] == i2 && iArr[iA + 2] == i3) {
                return this.l[iA >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((iA >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.i;
        int i8 = this.j;
        int i9 = i7 + ((iA >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i == iArr[i9] && i2 == iArr[i9 + 1] && i3 == iArr[i9 + 2] && 3 == i11) {
                return this.l[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i == iArr[iD] && i2 == iArr[iD + 1] && i3 == iArr[iD + 2] && 3 == iArr[iD + 3]) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final String m(int i, int[] iArr) {
        if (i < 4) {
            if (i == 1) {
                return j(iArr[0]);
            }
            if (i != 2) {
                return i != 3 ? "" : l(iArr[0], iArr[1], iArr[2]);
            }
            return k(iArr[0], iArr[1]);
        }
        int i2 = i(i, iArr);
        int iA = a(i2);
        int[] iArr2 = this.f;
        int i3 = iArr2[iA + 3];
        if (i2 == iArr2[iA] && i3 == i && e(i, iArr2[iA + 1], iArr)) {
            return this.l[iA >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((iA >> 3) << 2);
        int i5 = iArr2[i4 + 3];
        if (i2 == iArr2[i4] && i5 == i && e(i, iArr2[i4 + 1], iArr)) {
            return this.l[i4 >> 2];
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = i6 + ((iA >> (i7 + 2)) << i7);
        int[] iArr3 = this.f;
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr3[i8 + 3];
            if (i2 == iArr3[i8] && i == i10 && e(i, iArr3[i8 + 1], iArr)) {
                return this.l[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i2 == iArr3[iD] && i == iArr3[iD + 3] && e(i, iArr3[iD + 1], iArr)) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final void n(boolean z) {
        this.k = 0;
        this.m = d();
        this.n = this.g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, (Object) null);
        }
    }

    public final String toString() {
        int i = this.h;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 3; i4 < i; i4 += 4) {
            if (this.f[i4] != 0) {
                i3++;
            }
        }
        int i5 = this.i;
        int i6 = 0;
        for (int i7 = this.h + 3; i7 < i5; i7 += 4) {
            if (this.f[i7] != 0) {
                i6++;
            }
        }
        int i8 = this.i + 3;
        int i9 = this.g + i8;
        int i10 = 0;
        while (i8 < i9) {
            if (this.f[i8] != 0) {
                i10++;
            }
            i8 += 4;
        }
        int iD = (this.m - d()) >> 2;
        int i11 = this.g << 3;
        for (int i12 = 3; i12 < i11; i12 += 4) {
            if (this.f[i12] != 0) {
                i2++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", v61.class.getName(), Integer.valueOf(this.k), Integer.valueOf(this.g), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(iD), Integer.valueOf(i3 + i6 + i10 + iD), Integer.valueOf(i2));
    }

    public v61(int i) {
        this.a = null;
        this.k = 0;
        this.o = true;
        this.c = i;
        this.d = null;
        this.e = true;
        this.b = new AtomicReference(new u61(64, 4, new int[np0.o], new String[np0.m], 448, np0.o));
    }
}
