package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qd6 extends pd6 implements jg5 {
    public final Executor c;

    public qd6(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = o94.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = o94.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationExceptionA = mwl.a("The task was rejected", e);
            vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
            if (vo8Var != null) {
                vo8Var.b(cancellationExceptionA);
            }
            ao5 ao5Var = ao5.a;
            lb5.c.D0(vt4Var, runnable);
        }
    }

    @Override // defpackage.jg5
    public final void P(long j, ek2 ek2Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            og7 og7Var = new og7(this, 23, ek2Var);
            vt4 vt4Var = ek2Var.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(og7Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationExceptionA = mwl.a("The task was rejected", e);
                vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
                if (vo8Var != null) {
                    vo8Var.b(cancellationExceptionA);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            ek2Var.x(new pj2(scheduledFutureSchedule));
        } else {
            oa5.l.P(j, ek2Var);
        }
    }

    @Override // defpackage.pd6
    public final Executor S0() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qd6) && ((qd6) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.jg5
    public final no5 t0(long j, Runnable runnable, vt4 vt4Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationExceptionA = mwl.a("The task was rejected", e);
                vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
                if (vo8Var != null) {
                    vo8Var.b(cancellationExceptionA);
                }
            }
        }
        return scheduledFutureSchedule != null ? new mo5(scheduledFutureSchedule) : oa5.l.t0(j, runnable, vt4Var);
    }

    @Override // defpackage.xt4
    public final String toString() {
        return this.c.toString();
    }
}
