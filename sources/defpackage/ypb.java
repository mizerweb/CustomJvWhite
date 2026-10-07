package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ypb {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int[] d;
    public transient long[] e;
    public transient float f;
    public transient int g;

    public final void a(int i) {
        if (i > this.e.length) {
            f(i);
        }
        if (i >= this.g) {
            g(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return 0;
        }
        return this.b[iC];
    }

    public final int c(Object obj) {
        int iU = n1g.U(obj);
        int[] iArr = this.d;
        int i = iArr[(iArr.length - 1) & iU];
        while (i != -1) {
            long j = this.e[i];
            if (((int) (j >>> 32)) == iU && ndl.c(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final void d(int i) {
        lvb.O("Initial capacity must be non-negative", i >= 0);
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.e = jArr;
        this.g = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public final void e(int i, Object obj) {
        long j;
        if (i <= 0) {
            ore.p(zo5.h(i, "count must be positive but was: "));
            return;
        }
        long[] jArr = this.e;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iU = n1g.U(obj);
        int[] iArr2 = this.d;
        int length = (iArr2.length - 1) & iU;
        int i2 = this.c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
            j = 4294967295L;
        } else {
            while (true) {
                long j2 = jArr[i3];
                j = 4294967295L;
                if (((int) (j2 >>> 32)) == iU && ndl.c(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j2;
                    if (i5 == -1) {
                        jArr[i3] = ((-4294967296L) & j2) | (((long) i2) & 4294967295L);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            ore.k("Cannot contain more than Integer.MAX_VALUE elements!");
            return;
        }
        int i6 = i2 + 1;
        int length2 = this.e.length;
        if (i6 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i7 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i7 != length2) {
                f(i7);
            }
        }
        this.e[i2] = (((long) iU) << 32) | j;
        this.a[i2] = obj;
        this.b[i2] = i;
        this.c = i6;
        if (i2 >= this.g) {
            g(this.d.length * 2);
        }
    }

    public final void f(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.e;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.e = jArrCopyOf;
    }

    public final void g(int i) {
        if (this.d.length >= 1073741824) {
            this.g = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.e;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.c; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.g = i2;
        this.d = iArr;
    }
}
