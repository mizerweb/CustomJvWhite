package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h7c implements ScheduledFuture {
    public final Callable a;
    public final ExecutorService b;
    public final c c;
    public volatile Object f;
    public volatile ScheduledFuture h;
    public volatile Thread j;
    public final AtomicReference d = new AtomicReference(f7c.a);
    public final CountDownLatch e = new CountDownLatch(1);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public h7c(Callable callable, ExecutorService executorService, c cVar) {
        this.a = callable;
        this.b = executorService;
        this.c = cVar;
    }

    /* JADX WARN: Switch 'out' block B:2:0x0000 for B:7:0x0015 already processed. Defaulting to fallback option. */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Thread thread;
        while (true) {
            f7c f7cVar = (f7c) this.d.get();
            switch (f7cVar == null ? -1 : g7c.$EnumSwitchMapping$0[f7cVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return false;
                case 4:
                case 5:
                case 6:
                    AtomicReference atomicReference = this.d;
                    f7c f7cVar2 = f7c.f;
                    do {
                        if (atomicReference.compareAndSet(f7cVar, f7cVar2)) {
                            ScheduledFuture scheduledFuture = this.h;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(z);
                            }
                            if (z && (thread = this.j) != null) {
                                thread.interrupt();
                            }
                            this.e.countDown();
                            return true;
                        }
                    } while (atomicReference.get() == f7cVar);
                    Thread.yield();
                    break;
                default:
                    ore.o();
                    return false;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            return scheduledFuture.compareTo(delayed2);
        }
        return -1;
    }

    public final void d(boolean z) {
        while (true) {
            AtomicReference atomicReference = this.d;
            f7c f7cVar = (f7c) atomicReference.get();
            int i = f7cVar == null ? -1 : g7c.$EnumSwitchMapping$0[f7cVar.ordinal()];
            c cVar = this.c;
            switch (i) {
                case 1:
                case 2:
                case 3:
                    cVar.w("Early return in executeTask cuz state=" + f7cVar);
                    return;
                case 4:
                case 5:
                    break;
                case 6:
                    this.i.set(true);
                    cVar.w("Skipping executeTask cuz state=RUNNING (overlap)");
                    return;
                default:
                    ore.o();
                    return;
            }
            do {
                if (atomicReference.compareAndSet(f7cVar, f7c.c)) {
                    this.b.execute(new nb0(this, z, 7));
                    return;
                }
            } while (atomicReference.get() == f7cVar);
            Thread.yield();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.e.await(j, timeUnit)) {
            return h();
        }
        throw new TimeoutException("No result for " + j + " " + timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            return scheduledFuture.getDelay(timeUnit);
        }
        return 0L;
    }

    public final Object h() throws ExecutionException {
        if (((f7c) this.d.get()) == f7c.f) {
            throw new CancellationException("Future is cancelled");
        }
        Throwable th = (Throwable) this.g.get();
        if (th == null) {
            return this.f;
        }
        ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
        if (executionException != null) {
            throw executionException;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.get() == f7c.f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        f7c f7cVar = (f7c) this.d.get();
        return f7cVar == f7c.d || f7cVar == f7c.e || f7cVar == f7c.f;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        this.e.await();
        return h();
    }
}
