package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class v9g extends z2f {
    public static final pxe c;
    public static final ScheduledExecutorService d;
    public final AtomicReference b;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        d = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        c = new pxe("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public v9g() {
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        boolean z = c3f.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c);
        if (c3f.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            c3f.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.z2f
    public final y2f a() {
        return new u9g((ScheduledExecutorService) this.b.get());
    }

    @Override // defpackage.z2f
    public final ko5 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        t1f t1fVar = new t1f(runnable);
        AtomicReference atomicReference = this.b;
        try {
            t1fVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(t1fVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(t1fVar, j, timeUnit));
            return t1fVar;
        } catch (RejectedExecutionException e) {
            tre.s0(e);
            return l66.a;
        }
    }

    @Override // defpackage.z2f
    public final ko5 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        l66 l66Var = l66.a;
        AtomicReference atomicReference = this.b;
        if (j2 > 0) {
            s1f s1fVar = new s1f(runnable);
            try {
                s1fVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(s1fVar, j, j2, timeUnit));
                return s1fVar;
            } catch (RejectedExecutionException e) {
                tre.s0(e);
                return l66Var;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        ui8 ui8Var = new ui8(runnable, scheduledExecutorService);
        try {
            ui8Var.a(j <= 0 ? scheduledExecutorService.submit(ui8Var) : scheduledExecutorService.schedule(ui8Var, j, timeUnit));
            return ui8Var;
        } catch (RejectedExecutionException e2) {
            tre.s0(e2);
            return l66Var;
        }
    }
}
