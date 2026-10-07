package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lel {
    public static h7c d(long j, long j2, TimeUnit timeUnit, Callable callable, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, c cVar) {
        h7c h7cVar = new h7c(callable, executorService, cVar);
        h7cVar.h = scheduledExecutorService.scheduleAtFixedRate(new e7c(h7cVar, 1), j, j2, timeUnit);
        return h7cVar;
    }

    public static h7c e(long j, TimeUnit timeUnit, Callable callable, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, c cVar) {
        h7c h7cVar = new h7c(callable, executorService, cVar);
        h7cVar.h = scheduledExecutorService.schedule(new e7c(h7cVar, 0), j, timeUnit);
        return h7cVar;
    }

    public static h7c f(long j, long j2, TimeUnit timeUnit, Callable callable, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, c cVar) {
        h7c h7cVar = new h7c(callable, executorService, cVar);
        h7cVar.h = scheduledExecutorService.scheduleWithFixedDelay(new e7c(h7cVar, 2), j, j2, timeUnit);
        return h7cVar;
    }

    public void a() {
    }

    public void b() {
    }

    public void c(bx0 bx0Var) {
    }
}
