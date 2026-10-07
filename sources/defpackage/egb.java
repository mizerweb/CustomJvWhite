package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class egb extends y2f {
    public final ScheduledExecutorService a;
    public volatile boolean b;

    public egb(ThreadFactory threadFactory) {
        boolean z = c3f.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (c3f.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            c3f.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // defpackage.y2f
    public final ko5 a(Runnable runnable) {
        return b(runnable, 0L, null);
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? l66.a : d(runnable, j, timeUnit, null);
    }

    public final d2f d(Runnable runnable, long j, TimeUnit timeUnit, lo5 lo5Var) {
        d2f d2fVar = new d2f(runnable, lo5Var);
        if (lo5Var != null && !lo5Var.a(d2fVar)) {
            return d2fVar;
        }
        ScheduledExecutorService scheduledExecutorService = this.a;
        try {
            d2fVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) d2fVar) : scheduledExecutorService.schedule((Callable) d2fVar, j, timeUnit));
            return d2fVar;
        } catch (RejectedExecutionException e) {
            if (lo5Var != null) {
                lo5Var.b(d2fVar);
            }
            tre.s0(e);
            return d2fVar;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.shutdownNow();
    }
}
