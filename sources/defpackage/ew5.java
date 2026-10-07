package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ew5 implements Comparable {
    public static final ghb b = new ghb(17);
    public static final long c = qe7.p(4611686018427387903L);
    public static final long d = qe7.p(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public /* synthetic */ ew5(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jH = qe7.h(j, j3);
        if (-4611686018426L > jH || jH >= 4611686018427L) {
            return qe7.p(jH);
        }
        return qe7.r((jH * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strC1 = r5h.c1(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strC1.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strC1.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strC1, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strC1, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return cqk.j(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m(j) ? -i : i;
    }

    public static final long e(int i, long j) {
        if (i == 0) {
            if (n(j)) {
                return c;
            }
            if (m(j)) {
                return d;
            }
            ore.p("Dividing zero duration by zero yields an undefined result.");
            return 0L;
        }
        if ((((int) j) & 1) == 0) {
            return qe7.r((j >> 1) / ((long) i));
        }
        if (k(j)) {
            return q(Integer.signum(i), j);
        }
        long j2 = j >> 1;
        long j3 = i;
        long j4 = j2 / j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return qe7.p(j4);
        }
        return qe7.r((j4 * 1000000) + (((j2 - (j4 * j3)) * 1000000) / j3));
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final long g(long j) {
        return ((((int) j) & 1) != 1 || k(j)) ? s(j, lw5.MILLISECONDS) : j >> 1;
    }

    public static final long h(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j2 * 1000000;
    }

    public static final int i(long j) {
        if (k(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean k(long j) {
        return j == c || j == d;
    }

    public static final boolean m(long j) {
        return j < 0;
    }

    public static final boolean n(long j) {
        return j > 0;
    }

    public static final long o(long j, long j2) {
        return p(j, v(j2));
    }

    public static final long p(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? qe7.p(j3 / 1000000) : qe7.r(j3);
        }
        long jH = qe7.h(j >> 1, j2 >> 1);
        if (jH != 9223372036854759646L) {
            return (jH == 4611686018427387903L || jH == -4611686018427387903L) ? qe7.p(jH) : qe7.q(jH);
        }
        ore.p("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        return defpackage.ew5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        return defpackage.ew5.d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long q(int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew5.q(int, long):long");
    }

    public static final double r(long j, lw5 lw5Var) {
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        return sb8.k(j >> 1, (((int) j) & 1) == 0 ? lw5.NANOSECONDS : lw5.MILLISECONDS, lw5Var);
    }

    public static final long s(long j, lw5 lw5Var) {
        if (j == c) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return lw5Var.a.convert(j >> 1, ((((int) j) & 1) == 0 ? lw5.NANOSECONDS : lw5.MILLISECONDS).a);
    }

    public static String t(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        boolean zM = m(j);
        StringBuilder sb = new StringBuilder();
        if (zM) {
            sb.append('-');
        }
        if (m(j)) {
            j = v(j);
        }
        long jS = s(j, lw5.DAYS);
        int i = 0;
        int iS = k(j) ? 0 : (int) (s(j, lw5.HOURS) % 24);
        int iS2 = k(j) ? 0 : (int) (s(j, lw5.MINUTES) % 60);
        int iS3 = k(j) ? 0 : (int) (s(j, lw5.SECONDS) % 60);
        int i2 = i(j);
        boolean z = jS != 0;
        boolean z2 = iS != 0;
        boolean z3 = iS2 != 0;
        boolean z4 = (iS3 == 0 && i2 == 0) ? false : true;
        if (z) {
            sb.append(jS);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iS);
            sb.append('h');
            i = i3;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iS2);
            sb.append('m');
            i = i4;
        }
        if (z4) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iS3 != 0 || z || z2 || z3) {
                b(sb, iS3, i2, 9, "s", false);
            } else if (i2 >= 1000000) {
                b(sb, i2 / 1000000, i2 % 1000000, 6, "ms", false);
            } else if (i2 >= 1000) {
                b(sb, i2 / 1000, i2 % 1000, 3, "us", false);
            } else {
                sb.append(i2);
                sb.append("ns");
            }
            i = i5;
        }
        if (zM && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long u(long j, lw5 lw5Var) {
        lw5 lw5Var2 = (((int) j) & 1) == 0 ? lw5.NANOSECONDS : lw5.MILLISECONDS;
        if (lw5Var.compareTo(lw5Var2) <= 0 || k(j)) {
            return j;
        }
        long j2 = j >> 1;
        return qe7.P(j2 - (j2 % lw5Var2.a.convert(1L, lw5Var.a)), lw5Var2);
    }

    public static final long v(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        ThreadLocal[] threadLocalArr = gw5.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d(this.a, ((ew5) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ew5) {
            return this.a == ((ew5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return t(this.a);
    }
}
