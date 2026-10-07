package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class xsh {
    public static final wsh d = new wsh();
    public boolean a;
    public long b;
    public long c;

    public xsh a() {
        this.a = false;
        return this;
    }

    public xsh b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        ore.k("No deadline");
        return 0L;
    }

    public xsh d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public xsh g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        c.o(zo5.j(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
