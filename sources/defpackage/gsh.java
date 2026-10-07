package defpackage;

import android.os.SystemClock;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class gsh implements esh {
    public Long a;
    public Long b;

    public final Long a() {
        Long l = this.b;
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            Long l2 = this.a;
            if (l2 != null) {
                return Long.valueOf(l2.longValue() + jElapsedRealtime);
            }
        }
        return null;
    }

    public final synchronized void b(long j) {
        if (j != 0) {
            if (this.a == null) {
                this.a = Long.valueOf(j);
                this.b = Long.valueOf(SystemClock.elapsedRealtime());
            }
        }
    }

    public final cth c() {
        Long lA = a();
        return lA != null ? new cth(lA.longValue(), 3) : new cth(Clock.systemUTC().millis(), 2);
    }
}
