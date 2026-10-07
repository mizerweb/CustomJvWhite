package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class v1f extends ce6 implements ScheduledExecutorService {
    public final ScheduledExecutorService x;

    public v1f(ScheduledExecutorService scheduledExecutorService, u75 u75Var, boolean z, boolean z2, yd6 yd6Var, boolean z3, boolean z4, lcj lcjVar, qo1 qo1Var) {
        super(scheduledExecutorService, u75Var, z, z2, yd6Var, z3, z4, lcjVar, qo1Var);
        this.x = scheduledExecutorService;
    }

    @Override // defpackage.ce6, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (executorService = this.a).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.x.schedule(new be6(runnable, l(), this), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.x.scheduleAtFixedRate(new be6(runnable, l(), this), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.x.scheduleWithFixedDelay(new be6(runnable, l(), this), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.x.schedule(new ae6(callable, l(), this), j, timeUnit);
    }
}
