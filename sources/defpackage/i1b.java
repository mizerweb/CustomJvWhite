package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class i1b extends izl implements ScheduledFuture, e89, Future {
    public final o1 b;
    public final ScheduledFuture c;

    public i1b(o1 o1Var, ScheduledFuture scheduledFuture) {
        this.b = o1Var;
        this.c = scheduledFuture;
    }

    @Override // defpackage.e89
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zN = n(z);
        if (zN) {
            this.c.cancel(z);
        }
        return zN;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }

    @Override // defpackage.izl
    public final Object h() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final boolean n(boolean z) {
        return this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
