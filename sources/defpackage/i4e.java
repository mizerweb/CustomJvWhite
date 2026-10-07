package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4e {
    public static final h4e a = new h4e();
    public static final e3 b;

    static {
        Integer num = fo8.a;
        b = (num == null || num.intValue() >= 34) ? new n2d() : new al6();
    }

    public abstract int a(int i);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public abstract int c();

    public int d(int i) {
        return e(i);
    }

    public int e(int i) {
        int iC;
        int i2;
        if (i <= 0) {
            c.o(rx8.j(0, Integer.valueOf(i)));
            return 0;
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                iC = c() >>> 1;
                i2 = iC % i;
            } while ((i - 1) + (iC - i2) < 0);
            return i2;
        }
        while (true) {
            int iC2 = c();
            if (iC2 >= 0 && iC2 < i) {
                return iC2;
            }
        }
    }

    public long f() {
        return (((long) c()) << 32) + ((long) c());
    }

    public long g(long j) {
        return h(0L, j);
    }

    public long h(long j, long j2) {
        long jF;
        long j3;
        long jA;
        int iC;
        if (j2 <= j) {
            c.o(rx8.j(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iC = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iC = c();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) c()) & 4294967295L);
                }
                jA = ((long) iC) & 4294967295L;
            } else {
                do {
                    jF = f() >>> 1;
                    j3 = jF % j4;
                } while ((j4 - 1) + (jF - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jF2 = f();
            if (j <= jF2 && jF2 < j2) {
                return jF2;
            }
        }
    }
}
