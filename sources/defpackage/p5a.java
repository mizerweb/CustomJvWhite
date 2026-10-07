package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class p5a {
    public final eb0 a = new eb0();
    public final c9h b = new c9h();
    public final c9h c = new c9h();
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public final long a() {
        return SystemClock.elapsedRealtime() - Math.max(this.c.a, this.b.a);
    }

    public final void b(long j) {
        eb0 eb0Var = this.a;
        if (eb0Var.c != j) {
            eb0Var.a(j);
            SystemClock.elapsedRealtime();
        }
    }

    public final Long c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(this.c.a, this.b.a);
        if (jMax == 0) {
            return null;
        }
        return Long.valueOf(jElapsedRealtime - jMax);
    }
}
