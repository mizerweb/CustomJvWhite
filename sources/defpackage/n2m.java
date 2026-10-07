package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n2m {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String b(long j, long j2) {
        return zo5.p(c(j), "-", c(j2));
    }

    public static String c(long j) {
        long j2 = j / 1000;
        long jAbs = Math.abs(j - (1000 * j2));
        String str = (j2 != 0 || j >= 0) ? "" : "-";
        if (jAbs == 0) {
            return String.valueOf(j2);
        }
        long j3 = jAbs % 100;
        if (((int) (j3 + ((((j3 ^ 100) & ((-j3) | j3)) >> 63) & 100))) == 0) {
            return String.format(Locale.US, "%s%d.%d", Arrays.copyOf(new Object[]{str, Long.valueOf(j2), Long.valueOf(jAbs / 100)}, 3));
        }
        long j4 = jAbs % 10;
        return ((int) (j4 + ((((j4 ^ 10) & ((-j4) | j4)) >> 63) & 10))) == 0 ? String.format(Locale.US, "%s%d.%02d", Arrays.copyOf(new Object[]{str, Long.valueOf(j2), Long.valueOf(jAbs / 10)}, 3)) : String.format(Locale.US, "%s%d.%03d", Arrays.copyOf(new Object[]{str, Long.valueOf(j2), Long.valueOf(jAbs)}, 3));
    }
}
