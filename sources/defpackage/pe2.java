package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pe2 implements Executor, ScheduledExecutorService, AutoCloseable {
    public static final f80 c = new f80(1);
    public final Object a = new Object();
    public ScheduledThreadPoolExecutor b;

    public pe2() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, c);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new oe2());
        this.b = scheduledThreadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        synchronized (this.a) {
            zAwaitTermination = this.b.awaitTermination(j, timeUnit);
        }
        return zAwaitTermination;
    }

    public final void b(jj0 jj0Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        jj0Var.getClass();
        synchronized (this.a) {
            try {
                if (this.b.isShutdown()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, c);
                    scheduledThreadPoolExecutor2.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor2.setRejectedExecutionHandler(new oe2());
                    this.b = scheduledThreadPoolExecutor2;
                }
                scheduledThreadPoolExecutor = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, jj0Var.d().size()));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            this.b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        List listInvokeAll;
        synchronized (this.a) {
            listInvokeAll = this.b.invokeAll(collection);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        Object objInvokeAny;
        synchronized (this.a) {
            objInvokeAny = this.b.invokeAny(collection);
        }
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean zIsShutdown;
        synchronized (this.a) {
            zIsShutdown = this.b.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean zIsTerminated;
        synchronized (this.a) {
            zIsTerminated = this.b.isTerminated();
        }
        return zIsTerminated;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.a) {
            scheduledFutureSchedule = this.b.schedule(runnable, j, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        synchronized (this.a) {
            scheduledFutureScheduleAtFixedRate = this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        synchronized (this.a) {
            scheduledFutureScheduleWithFixedDelay = this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.a) {
            this.b.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow;
        synchronized (this.a) {
            listShutdownNow = this.b.shutdownNow();
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Future futureSubmit;
        synchronized (this.a) {
            futureSubmit = this.b.submit(callable);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        List listInvokeAll;
        synchronized (this.a) {
            listInvokeAll = this.b.invokeAll(collection, j, timeUnit);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        Object objInvokeAny;
        synchronized (this.a) {
            objInvokeAny = this.b.invokeAny(collection, j, timeUnit);
        }
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ScheduledFuture scheduledFutureSchedule;
        synchronized (this.a) {
            scheduledFutureSchedule = this.b.schedule(callable, j, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Future futureSubmit;
        synchronized (this.a) {
            futureSubmit = this.b.submit(runnable, obj);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Future<?> futureSubmit;
        synchronized (this.a) {
            futureSubmit = this.b.submit(runnable);
        }
        return futureSubmit;
    }
}
