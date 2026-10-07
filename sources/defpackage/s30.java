package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class s30 extends xsh {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static s30 l;
    public boolean e;
    public s30 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        i = reentrantLock.newCondition();
        j = 60000L;
        k = 60000000000L;
    }

    public final void i() {
        s30 s30Var;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new s30();
                    p30 p30Var = new p30("Okio Watchdog");
                    p30Var.setDaemon(true);
                    p30Var.start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    this.g = j2 + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j3 = this.g - jNanoTime;
                s30 s30Var2 = l;
                while (true) {
                    s30Var = s30Var2.f;
                    if (s30Var == null || j3 < s30Var.g - jNanoTime) {
                        break;
                        break;
                    }
                    s30Var2 = s30Var;
                }
                this.f = s30Var;
                s30Var2.f = this;
                if (s30Var2 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            s30 s30Var = l;
            while (s30Var != null) {
                s30 s30Var2 = s30Var.f;
                if (s30Var2 == this) {
                    s30Var.f = this.f;
                    this.f = null;
                    return false;
                }
                s30Var = s30Var2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
