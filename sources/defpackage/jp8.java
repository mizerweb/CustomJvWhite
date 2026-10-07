package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jp8 {
    public final Executor a;
    public final ip8 b;
    public final hp8 c = new hp8(this, 0);
    public final hp8 d = new hp8(this, 1);
    public p76 e = null;
    public int f = 0;
    public int g = 1;
    public long h = 0;
    public long i = 0;

    public jp8(Executor executor, ip8 ip8Var) {
        this.a = executor;
        this.b = ip8Var;
    }

    public static boolean c(p76 p76Var, int i) {
        return lq0.a(i) || lq0.l(i, 4) || p76.P(p76Var);
    }

    public final void a() {
        boolean z;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z = true;
                if (this.g == 4) {
                    jMax = Math.max(this.i + 100, jUptimeMillis);
                    this.h = jUptimeMillis;
                    this.g = 2;
                } else {
                    this.g = 1;
                    z = false;
                    jMax = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            long j = jMax - jUptimeMillis;
            hp8 hp8Var = this.d;
            if (j > 0) {
                l21.e().schedule(hp8Var, j, TimeUnit.MILLISECONDS);
            } else {
                hp8Var.run();
            }
        }
    }

    public final void b() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (c(this.e, this.f)) {
                    int iD = qt4.D(this.g);
                    if (iD != 0) {
                        if (iD == 2) {
                            this.g = 4;
                        }
                        z = false;
                        jMax = 0;
                    } else {
                        jMax = Math.max(this.i + 100, jUptimeMillis);
                        this.h = jUptimeMillis;
                        this.g = 2;
                        z = true;
                    }
                    if (z) {
                        long j = jMax - jUptimeMillis;
                        hp8 hp8Var = this.d;
                        if (j > 0) {
                            l21.e().schedule(hp8Var, j, TimeUnit.MILLISECONDS);
                        } else {
                            hp8Var.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(p76 p76Var, int i) {
        p76 p76Var2;
        if (!c(p76Var, i)) {
            return false;
        }
        synchronized (this) {
            p76Var2 = this.e;
            this.e = p76.b(p76Var);
            this.f = i;
        }
        p76.g(p76Var2);
        return true;
    }
}
