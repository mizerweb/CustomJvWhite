package bolts;

import defpackage.ajh;
import defpackage.bjh;
import defpackage.cjh;
import defpackage.djh;
import defpackage.ejh;
import defpackage.gjh;
import defpackage.kk2;
import defpackage.mq4;
import defpackage.og7;
import defpackage.ore;
import defpackage.rda;
import defpackage.rjh;
import defpackage.sg;
import defpackage.uci;
import defpackage.um5;
import defpackage.wn2;
import defpackage.wz0;
import defpackage.xih;
import defpackage.xva;
import defpackage.xz8;
import defpackage.yih;
import defpackage.zih;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    private static final Executor IMMEDIATE_EXECUTOR;
    private static Task<?> TASK_CANCELLED;
    private static Task<Boolean> TASK_FALSE;
    private static Task<?> TASK_NULL;
    private static Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    private static volatile gjh unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private boolean errorHasBeenObserved;
    private TResult result;
    private uci unobservedErrorNotifier;
    private final Object lock = new Object();
    private List<mq4> continuations = new ArrayList();

    static {
        wz0 wz0Var = wz0.d;
        BACKGROUND_EXECUTOR = wz0Var.a;
        IMMEDIATE_EXECUTOR = wz0Var.c;
        UI_THREAD_EXECUTOR = sg.b.a;
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, kk2 kk2Var) {
        rjh rjhVar = new rjh();
        try {
            executor.execute(new xz8(kk2Var, rjhVar, callable, 3));
        } catch (Exception e) {
            rjhVar.b(new ExecutorException(e));
        }
        return rjhVar.a;
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    public static <TContinuationResult, TResult> void completeAfterTask(rjh rjhVar, mq4 mq4Var, Task<TResult> task, Executor executor, kk2 kk2Var) {
        rjh rjhVar2;
        try {
            rjhVar2 = rjhVar;
            try {
                executor.execute(new wn2(kk2Var, rjhVar2, mq4Var, task, 2, false));
            } catch (Exception e) {
                e = e;
                rjhVar2.b(new ExecutorException(e));
            }
        } catch (Exception e2) {
            e = e2;
            rjhVar2 = rjhVar;
        }
    }

    public static <TContinuationResult, TResult> void completeImmediately(rjh rjhVar, mq4 mq4Var, Task<TResult> task, Executor executor, kk2 kk2Var) {
        try {
            executor.execute(new zih(kk2Var, rjhVar, mq4Var, task));
        } catch (Exception e) {
            rjhVar.b(new ExecutorException(e));
        }
    }

    public static <TResult> ejh create() {
        new Task();
        return new ejh();
    }

    public static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, kk2 kk2Var) {
        if (kk2Var != null && kk2Var.a()) {
            return cancelled();
        }
        if (j <= 0) {
            return forResult(null);
        }
        rjh rjhVar = new rjh();
        ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new rda(15, rjhVar), j, TimeUnit.MILLISECONDS);
        if (kk2Var != null) {
            kk2Var.b(new og7(scheduledFutureSchedule, 29, rjhVar));
        }
        return rjhVar.a;
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        Task<TResult> task = new Task<>();
        if (task.trySetError(exc)) {
            return task;
        }
        ore.k("Cannot set the error on a completed task.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == 0) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (Task<TResult>) TASK_TRUE : (Task<TResult>) TASK_FALSE;
        }
        Task<TResult> task = new Task<>();
        if (task.trySetResult(tresult)) {
            return task;
        }
        ore.k("Cannot set the result of a completed task.");
        return null;
    }

    public static gjh getUnobservedExceptionHandler() {
        return null;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            Iterator<mq4> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(gjh gjhVar) {
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        rjh rjhVar = new rjh();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new djh(obj, arrayList, atomicBoolean, atomicInteger, rjhVar, 0));
        }
        return rjhVar.a;
    }

    public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> collection) {
        return (Task<List<TResult>>) whenAll(collection).onSuccess(new ajh(1, collection));
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        rjh rjhVar = new rjh();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new cjh(atomicBoolean, rjhVar, 1));
        }
        return rjhVar.a;
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        rjh rjhVar = new rjh();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new cjh(atomicBoolean, rjhVar, 0));
        }
        return rjhVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, mq4 mq4Var, Executor executor, kk2 kk2Var) {
        xva xvaVar = new xva(7, false);
        xvaVar.H(new djh(kk2Var, callable, mq4Var, executor, xvaVar, 1));
        return makeVoid().continueWithTask((mq4) xvaVar.z(), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(mq4 mq4Var, Executor executor, kk2 kk2Var) {
        boolean zIsCompleted;
        rjh rjhVar = new rjh();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new um5(rjhVar, mq4Var, executor, kk2Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeImmediately(rjhVar, mq4Var, this, executor, kk2Var);
        }
        return rjhVar.a;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(mq4 mq4Var, Executor executor, kk2 kk2Var) {
        boolean zIsCompleted;
        rjh rjhVar = new rjh();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new xih(rjhVar, mq4Var, executor, kk2Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeAfterTask(rjhVar, mq4Var, this, executor, kk2Var);
        }
        return rjhVar.a;
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            try {
                exc = this.error;
                if (exc != null) {
                    this.errorHasBeenObserved = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            z = getError() != null;
        }
        return z;
    }

    public Task<Void> makeVoid() {
        return continueWithTask(new bjh());
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(mq4 mq4Var, Executor executor, kk2 kk2Var) {
        return continueWithTask(new yih(kk2Var, mq4Var, 0), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(mq4 mq4Var, Executor executor, kk2 kk2Var) {
        return continueWithTask(new yih(kk2Var, mq4Var, 1), executor);
    }

    public boolean trySetCancelled() {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetError(Exception exc) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.error = exc;
                this.errorHasBeenObserved = false;
                this.lock.notifyAll();
                runContinuations();
                if (!this.errorHasBeenObserved) {
                    getUnobservedExceptionHandler();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean zIsCompleted;
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(j));
                }
                zIsCompleted = isCompleted();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCompleted;
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, kk2 kk2Var) {
        return call(callable, BACKGROUND_EXECUTOR, kk2Var);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(mq4 mq4Var, Executor executor) {
        return onSuccess(mq4Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(mq4 mq4Var, Executor executor) {
        return onSuccessTask(mq4Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(mq4 mq4Var) {
        return onSuccess(mq4Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(mq4 mq4Var) {
        return onSuccessTask(mq4Var, IMMEDIATE_EXECUTOR);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(mq4 mq4Var, kk2 kk2Var) {
        return onSuccess(mq4Var, IMMEDIATE_EXECUTOR, kk2Var);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(mq4 mq4Var, kk2 kk2Var) {
        return onSuccessTask(mq4Var, IMMEDIATE_EXECUTOR, kk2Var);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, kk2 kk2Var) {
        return call(callable, IMMEDIATE_EXECUTOR, kk2Var);
    }

    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task() {
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, mq4 mq4Var, kk2 kk2Var) {
        return continueWhile(callable, mq4Var, IMMEDIATE_EXECUTOR, kk2Var);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, mq4 mq4Var, Executor executor) {
        return continueWhile(callable, mq4Var, executor, null);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, mq4 mq4Var) {
        return continueWhile(callable, mq4Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(mq4 mq4Var, Executor executor) {
        return continueWith(mq4Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(mq4 mq4Var, Executor executor) {
        return continueWithTask(mq4Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(mq4 mq4Var) {
        return continueWith(mq4Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(mq4 mq4Var) {
        return continueWithTask(mq4Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(mq4 mq4Var, kk2 kk2Var) {
        return continueWith(mq4Var, IMMEDIATE_EXECUTOR, kk2Var);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(mq4 mq4Var, kk2 kk2Var) {
        return continueWithTask(mq4Var, IMMEDIATE_EXECUTOR, kk2Var);
    }

    public static Task<Void> delay(long j, kk2 kk2Var) {
        return delay(j, wz0.d.b, kk2Var);
    }

    public static Task<Void> delay(long j) {
        return delay(j, wz0.d.b, null);
    }
}
