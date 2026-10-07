package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ui8 implements Callable, ko5 {
    public static final FutureTask f = new FutureTask(vm9.c, null);
    public final Runnable a;
    public final ExecutorService d;
    public Thread e;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference b = new AtomicReference();

    public ui8(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.a = runnable;
        this.d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.e = Thread.currentThread();
        try {
            this.a.run();
            Future futureSubmit = this.d.submit(this);
            AtomicReference atomicReference = this.b;
            loop0: while (true) {
                Future future = (Future) atomicReference.get();
                if (future == f) {
                    futureSubmit.cancel(this.e != Thread.currentThread());
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(future, futureSubmit)) {
                        break loop0;
                    }
                } while (atomicReference.get() == future);
            }
            this.e = null;
            return null;
        } catch (Throwable th) {
            iwl.a(th);
            this.e = null;
            tre.s0(th);
            return null;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        AtomicReference atomicReference = this.c;
        FutureTask futureTask = f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.e != Thread.currentThread());
        }
        Future future2 = (Future) this.b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.e != Thread.currentThread());
    }
}
