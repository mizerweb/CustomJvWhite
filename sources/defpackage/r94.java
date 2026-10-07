package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class r94 {
    public final qt3 a;
    public boolean b;

    public r94() {
        this(qt3.a);
    }

    public final synchronized void a() {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            ((nfh) this.a).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                b();
            } else {
                boolean z = false;
                while (!this.b && jElapsedRealtime < j2) {
                    try {
                        this.a.getClass();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    ((nfh) this.a).getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        this.b = false;
    }

    public final synchronized boolean e() {
        return this.b;
    }

    public final synchronized boolean f() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public r94(qt3 qt3Var) {
        this.a = qt3Var;
    }
}
