package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class kd5 extends AbstractExecutorService implements jif, AutoCloseable {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final Executor b;
    public volatile int c;
    public final LinkedBlockingQueue d;
    public final zn e;
    public final AtomicInteger f;
    public final AtomicInteger g;

    public kd5(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = "SerialExecutor";
        this.b = executor;
        this.c = 1;
        this.d = linkedBlockingQueue;
        this.e = new zn(4, this);
        this.f = new AtomicInteger(0);
        this.g = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b(Runnable runnable) {
        if (runnable == null) {
            ore.n("runnable parameter is null");
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        boolean zOffer = linkedBlockingQueue.offer(runnable);
        String str = this.a;
        if (!zOffer) {
            StringBuilder sbZ = zo5.z(str, " queue is full, size=");
            sbZ.append(linkedBlockingQueue.size());
            throw new RejectedExecutionException(sbZ.toString());
        }
        int size = linkedBlockingQueue.size();
        AtomicInteger atomicInteger = this.g;
        int i = atomicInteger.get();
        if (size > i && atomicInteger.compareAndSet(i, size)) {
            pj6.e(kd5.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        l();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        b(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    public final void l() {
        int i = this.f.get();
        while (i < this.c) {
            int i2 = i + 1;
            boolean zCompareAndSet = this.f.compareAndSet(i, i2);
            String str = this.a;
            if (zCompareAndSet) {
                pj6.f(kd5.class, "%s: starting worker %d of %d", str, Integer.valueOf(i2), Integer.valueOf(this.c));
                this.b.execute(this.e);
                return;
            } else {
                pj6.d(kd5.class, str, "%s: race in startWorkerIfNeeded; retrying");
                i = this.f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
