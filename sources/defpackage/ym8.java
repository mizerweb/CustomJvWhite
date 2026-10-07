package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ym8 implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final w74 c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public final ThreadFactory f;

    public ym8(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ym8 ym8Var;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new w74();
        this.f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, bn8.d);
            ym8Var = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(ym8Var, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            ym8Var = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        ym8Var.d = scheduledExecutorServiceNewScheduledThreadPool;
        ym8Var.e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<an8> concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (an8 an8Var : concurrentLinkedQueue) {
            if (an8Var.c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(an8Var)) {
                this.c.b(an8Var);
            }
        }
    }
}
