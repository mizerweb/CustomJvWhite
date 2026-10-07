package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bn8 extends z2f {
    public static final pxe c;
    public static final pxe d;
    public static final long e = Long.getLong("rx3.io-keep-alive-time", 60).longValue();
    public static final an8 f;
    public static final ym8 g;
    public final AtomicReference b;

    static {
        an8 an8Var = new an8(new pxe("RxCachedThreadSchedulerShutdown"));
        f = an8Var;
        an8Var.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        pxe pxeVar = new pxe("RxCachedThreadScheduler", iMax, false);
        c = pxeVar;
        d = new pxe("RxCachedWorkerPoolEvictor", iMax, false);
        ym8 ym8Var = new ym8(0L, null, pxeVar);
        g = ym8Var;
        ym8Var.c.dispose();
        ScheduledFuture scheduledFuture = ym8Var.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = ym8Var.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public bn8() {
        ym8 ym8Var = g;
        AtomicReference atomicReference = new AtomicReference(ym8Var);
        this.b = atomicReference;
        ym8 ym8Var2 = new ym8(e, TimeUnit.SECONDS, c);
        while (!atomicReference.compareAndSet(ym8Var, ym8Var2)) {
            if (atomicReference.get() != ym8Var) {
                ym8Var2.c.dispose();
                ScheduledFuture scheduledFuture = ym8Var2.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = ym8Var2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.z2f
    public final y2f a() {
        return new zm8((ym8) this.b.get());
    }
}
