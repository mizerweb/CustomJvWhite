package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn0 {
    public static final long a;
    public static final long b;
    public static final ny8 c;

    static {
        ghb ghbVar = ew5.b;
        a = qe7.O(200, lw5.MILLISECONDS);
        b = qe7.O(30, lw5.SECONDS);
        c = rx8.P(3, new b6(12));
    }

    public static final long a(int i, long j, long j2) {
        double dK;
        if (ew5.d(j2, j) <= 0) {
            c.o(nbh.w("maxBackoffDelay(", ew5.t(j2), ") should be more than minBackoffDelay(", ew5.t(j), ")"));
            return 0L;
        }
        if (ew5.d(j, 0L) < 0) {
            ore.p("minBackoffDelay should be positive");
            return 0L;
        }
        if (ew5.d(j2, 0L) <= 0) {
            ore.p("maxBackoffDelay should be positive");
            return 0L;
        }
        long jMin = Math.min(ew5.g(j2), gm0.L(Math.pow(2.0d, i) * ew5.g(j)));
        lw5 lw5Var = lw5.MILLISECONDS;
        long jP = qe7.P(jMin, lw5Var);
        ((h4e) c.getValue()).getClass();
        e3 e3Var = i4e.b;
        e3Var.getClass();
        if (!Double.isInfinite(0.2d) || Math.abs(-0.1d) > Double.MAX_VALUE || Math.abs(0.1d) > Double.MAX_VALUE) {
            dK = (-0.1d) + (e3Var.k() * 0.2d);
        } else {
            double dK2 = e3Var.k() * 0.1d;
            dK = (-0.1d) + dK2 + dK2;
        }
        if (dK >= 0.1d) {
            dK = Math.nextAfter(0.1d, Double.NEGATIVE_INFINITY);
        }
        double d = dK + 1.0d;
        int iJ = gm0.J(d);
        if (iJ == d) {
            return ew5.q(iJ, jP);
        }
        if ((((int) jP) & 1) == 0) {
            lw5Var = lw5.NANOSECONDS;
        }
        return qe7.N(ew5.r(jP, lw5Var) * d, lw5Var);
    }

    public static /* synthetic */ long b(int i, int i2, long j, long j2) {
        if ((i2 & 2) != 0) {
            j = a;
        }
        if ((i2 & 4) != 0) {
            j2 = b;
        }
        return a(i, j, j2);
    }
}
