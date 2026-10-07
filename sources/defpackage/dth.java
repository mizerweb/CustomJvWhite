package defpackage;

import java.math.RoundingMode;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class dth {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public dth(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long jLongValue = this.a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.b = jLongValue - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                String str = vqi.a;
                long jI0 = vqi.i0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jI0) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jI0) < Math.abs(j5 - jI0) ? j4 : j5;
            }
            long j6 = j;
            String str2 = vqi.a;
            return a(vqi.i0(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                String str = vqi.a;
                long jI0 = vqi.i0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jI0 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jI0 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = vqi.a;
            return a(vqi.i0(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == BuildConfig.MAX_TIME_TO_UPLOAD || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean e() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == BuildConfig.MAX_TIME_TO_UPLOAD ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized void g(long j, boolean z) {
        try {
            lvb.b0(this.a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
