package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ts7 implements RunnableScheduledFuture {
    public final AtomicReference a = new AtomicReference(null);
    public final long b;
    public final Callable c;
    public final u72 d;

    public ts7(Handler handler, long j, Callable callable) {
        this.b = j;
        this.c = callable;
        this.d = f55.m(new dc9(this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.d.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        r72 r72Var = (r72) this.a.getAndSet(null);
        if (r72Var != null) {
            try {
                r72Var.b(this.c.call());
            } catch (Exception e) {
                r72Var.d(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.d.b.get(j, timeUnit);
    }
}
