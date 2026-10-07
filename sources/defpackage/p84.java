package defpackage;

import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class p84 extends z2f {
    public static final n84 c;
    public static final pxe d;
    public static final int e;
    public static final o84 f;
    public final AtomicReference b;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        e = iAvailableProcessors;
        o84 o84Var = new o84(new pxe("RxComputationShutdown"));
        f = o84Var;
        o84Var.dispose();
        pxe pxeVar = new pxe("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        d = pxeVar;
        n84 n84Var = new n84(0, pxeVar);
        c = n84Var;
        for (o84 o84Var2 : n84Var.b) {
            o84Var2.dispose();
        }
    }

    public p84() {
        n84 n84Var = c;
        AtomicReference atomicReference = new AtomicReference(n84Var);
        this.b = atomicReference;
        n84 n84Var2 = new n84(e, d);
        while (!atomicReference.compareAndSet(n84Var, n84Var2)) {
            if (atomicReference.get() != n84Var) {
                for (o84 o84Var : n84Var2.b) {
                    o84Var.dispose();
                }
                return;
            }
        }
    }

    @Override // defpackage.z2f
    public final y2f a() {
        return new m84(((n84) this.b.get()).a());
    }

    @Override // defpackage.z2f
    public final ko5 c(Runnable runnable, long j, TimeUnit timeUnit) {
        o84 o84VarA = ((n84) this.b.get()).a();
        o84VarA.getClass();
        Objects.requireNonNull(runnable, "run is null");
        t1f t1fVar = new t1f(runnable);
        ScheduledExecutorService scheduledExecutorService = o84VarA.a;
        try {
            t1fVar.a(j <= 0 ? scheduledExecutorService.submit(t1fVar) : scheduledExecutorService.schedule(t1fVar, j, timeUnit));
            return t1fVar;
        } catch (RejectedExecutionException e2) {
            tre.s0(e2);
            return l66.a;
        }
    }

    @Override // defpackage.z2f
    public final ko5 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        o84 o84VarA = ((n84) this.b.get()).a();
        ScheduledExecutorService scheduledExecutorService = o84VarA.a;
        if (j2 <= 0) {
            ui8 ui8Var = new ui8(runnable, scheduledExecutorService);
            try {
                ui8Var.a(j <= 0 ? scheduledExecutorService.submit(ui8Var) : scheduledExecutorService.schedule(ui8Var, j, timeUnit));
                return ui8Var;
            } catch (RejectedExecutionException e2) {
                tre.s0(e2);
            }
        } else {
            s1f s1fVar = new s1f(runnable);
            try {
                s1fVar.a(o84VarA.a.scheduleAtFixedRate(s1fVar, j, j2, timeUnit));
                return s1fVar;
            } catch (RejectedExecutionException e3) {
                tre.s0(e3);
            }
        }
        return l66.a;
    }
}
