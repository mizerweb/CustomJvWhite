package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mxl {
    public static final String a(long j) {
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        long j5 = (j3 - (60000 * j4)) / 1000;
        if (j2 > 0) {
            return String.format(j2 + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
        }
        return String.format(j4 + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5)}, 1));
    }

    public static final String b(long j) {
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        long j5 = (j3 - (60000 * j4)) / 1000;
        long j6 = (j % 1000) / 10;
        if (j2 <= 0) {
            return String.format("%02d:%02d,%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        }
        return String.format(j2 + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)}, 3));
    }

    public static yp6 c(String str) {
        return (str == null || r5h.X0(str) || str.length() > 4) ? yp6.c : new yp6(str.toUpperCase(Locale.ROOT));
    }
}
