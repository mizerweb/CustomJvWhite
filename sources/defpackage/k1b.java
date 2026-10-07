package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class k1b extends h1b implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public k1b(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        j5i j5iVar = new j5i(callable);
        return new i1b(j5iVar, this.b.schedule(j5iVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        j1b j1bVar = new j1b(runnable);
        return new i1b(j1bVar, this.b.scheduleAtFixedRate(j1bVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        j1b j1bVar = new j1b(runnable);
        return new i1b(j1bVar, this.b.scheduleWithFixedDelay(j1bVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        j5i j5iVarR = j5i.r(runnable, null);
        return new i1b(j5iVarR, this.b.schedule(j5iVarR, j, timeUnit));
    }
}
