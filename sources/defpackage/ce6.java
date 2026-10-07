package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class ce6 implements ExecutorService, AutoCloseable {
    public final ExecutorService a;
    public final zd6 b;
    public final boolean c;
    public final boolean d;
    public final yd6 e;
    public final boolean f;
    public final boolean g;
    public final lcj h;
    public volatile boolean i;
    public final AtomicLong j = new AtomicLong(0);
    public final ji9 k;
    public final ReentrantReadWriteLock l;
    public final AtomicLong m;
    public final AtomicBoolean n;
    public final AtomicLong o;
    public final ConcurrentLinkedQueue p;
    public final AtomicInteger q;
    public volatile Thread r;
    public volatile xd6 s;
    public volatile long t;
    public long u;
    public long v;
    public long w;

    static {
        new AtomicInteger(0);
    }

    public ce6(ExecutorService executorService, zd6 zd6Var, boolean z, boolean z2, yd6 yd6Var, boolean z3, boolean z4, lcj lcjVar, cf7 cf7Var) {
        this.a = executorService;
        this.b = zd6Var;
        this.c = z;
        this.d = z2;
        this.e = yd6Var;
        this.f = z3;
        this.g = z4;
        this.h = lcjVar;
        ji9 ji9Var = new ji9();
        ji9Var.c = e9i.c;
        ji9Var.d = e9i.d;
        ji9Var.e = e9i.e;
        ji9Var.c(6);
        this.k = ji9Var;
        this.l = new ReentrantReadWriteLock();
        this.m = new AtomicLong(0L);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicLong(0L);
        this.p = new ConcurrentLinkedQueue();
        this.q = new AtomicInteger(1);
        if (!z4) {
            cf7Var.invoke(new e6(14, this));
        } else {
            if (lcjVar == null) {
                ore.k("schedulerEnabled=true but watchdogScheduler is null");
                throw null;
            }
            kcj kcjVar = new kcj(this, ew5.h(lcjVar.a.b()));
            ReentrantLock reentrantLock = lcjVar.d;
            reentrantLock.lock();
            try {
                lcjVar.b.add(kcjVar);
                lcjVar.c.put(this, kcjVar);
                lcjVar.g.incrementAndGet();
                if (lcjVar.f == null) {
                    Thread thread = new Thread(new hed(9, lcjVar), "watchdog-scheduler");
                    thread.setDaemon(true);
                    lcjVar.f = thread;
                    thread.start();
                }
                lcjVar.e.signal();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        ghb ghbVar = ew5.b;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.w = 0L;
    }

    public final int A() {
        ExecutorService executorService = this.a;
        if (executorService instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executorService).getQueue().size();
        }
        return -1;
    }

    public final void E() {
        this.o.incrementAndGet();
        if (!this.g) {
            if (this.f) {
                if (this.q.compareAndSet(0, 1)) {
                    LockSupport.unpark(this.r);
                    return;
                }
                return;
            } else {
                if (this.n.get()) {
                    LockSupport.unpark(this.r);
                    return;
                }
                return;
            }
        }
        if (this.q.compareAndSet(0, 1)) {
            this.t = ew5.p(this.e.b(), this.b.b());
        }
        lcj lcjVar = this.h;
        if (lcjVar != null) {
            ReentrantLock reentrantLock = lcjVar.d;
            reentrantLock.lock();
            try {
                kcj kcjVar = (kcj) lcjVar.c.get(this);
                if (kcjVar != null) {
                    if (kcjVar.c) {
                        kcjVar.c = false;
                    }
                    long jH = ew5.h(lcjVar.a.b());
                    if (kcjVar.b > jH) {
                        kcjVar.b = jH;
                    }
                    lcjVar.e.signal();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void I() {
        this.i = true;
        if (!this.g) {
            if (!this.f) {
                LockSupport.unpark(this.r);
                return;
            } else {
                this.q.set(2);
                LockSupport.unpark(this.r);
                return;
            }
        }
        this.q.set(2);
        lcj lcjVar = this.h;
        if (lcjVar != null) {
            ReentrantLock reentrantLock = lcjVar.d;
            reentrantLock.lock();
            try {
                kcj kcjVar = (kcj) lcjVar.c.remove(this);
                if (kcjVar != null) {
                    lcjVar.b.remove(kcjVar);
                }
                lcjVar.g.decrementAndGet();
                lcjVar.e.signal();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final long K(ncj ncjVar) {
        long andIncrement = this.j.getAndIncrement();
        ReentrantReadWriteLock.WriteLock writeLock = this.l.writeLock();
        writeLock.lock();
        try {
            this.k.f(andIncrement, ncjVar);
            return andIncrement;
        } finally {
            writeLock.unlock();
        }
    }

    public final void P(long j) {
        ReentrantReadWriteLock.WriteLock writeLock = this.l.writeLock();
        writeLock.lock();
        try {
            ji9 ji9Var = this.k;
            int iB = ji9Var.b(j);
            ncj ncjVar = (ncj) (iB >= 0 ? ji9Var.e[iB] : null);
            if (ncjVar != null) {
                ncjVar.c = this.e.b();
                ncjVar.d = Thread.currentThread();
            }
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    public final long W(long j) {
        xd6 xd6Var;
        xd6 xd6Var2;
        Object poeVar;
        char c;
        int i;
        long jO;
        if (this.i || this.a.isTerminated()) {
            return -9223372036854775807L;
        }
        if (ew5.f(this.u, 0L)) {
            this.v = this.b.b();
            long jA = this.b.a();
            this.w = jA;
            long j2 = this.v;
            if (ew5.d(j2, jA) <= 0) {
                jA = j2;
            }
            this.u = jA;
            this.t = ew5.p(j, this.v);
            this.s = new xd6(this, this.w);
        }
        if (this.q.get() == 0) {
            return Long.MIN_VALUE;
        }
        if (ew5.d(j, this.t) >= 0) {
            ReentrantReadWriteLock.ReadLock lock = this.l.readLock();
            lock.lock();
            try {
                ji9 ji9Var = this.k;
                long[] jArr = ji9Var.c;
                long[] jArr2 = ji9Var.d;
                Object[] objArr = ji9Var.e;
                int length = jArr.length - 2;
                ArrayList arrayList = null;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j3 = jArr[i2];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 0;
                            while (i3 < 8) {
                                if ((j3 & 255) < 128) {
                                    c = '\b';
                                    int i4 = (i2 << 3) + i3;
                                    if (i4 < ji9Var.a) {
                                        long j4 = jArr2[i4];
                                        ncj ncjVar = (ncj) objArr[i4];
                                        if (ncjVar.d == null) {
                                            ghb ghbVar = ew5.b;
                                            jO = 0;
                                        } else {
                                            jO = ew5.o(j, ncjVar.c);
                                        }
                                        i = i3;
                                        if (ew5.d(jO, this.b.b()) > 0) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList(this.k.b);
                                            }
                                            arrayList.add(ncjVar.a());
                                        }
                                    }
                                    j3 >>= c;
                                    i3 = i + 1;
                                } else {
                                    c = '\b';
                                }
                                j3 = j3;
                                i = i3;
                                j3 >>= c;
                                i3 = i + 1;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                lock.unlock();
                if (arrayList != null && (!arrayList.isEmpty())) {
                    try {
                        this.b.d(arrayList);
                        poeVar = sbi.a;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        thA.printStackTrace();
                    }
                }
                if (y() > 0 || A() > 0) {
                    xd6Var2 = this.s;
                    if (xd6Var2 != null) {
                        xd6Var2.a();
                    }
                } else {
                    ReentrantReadWriteLock.ReadLock lock2 = this.l.readLock();
                    lock2.lock();
                    try {
                        boolean zD = this.k.d();
                        lock2.unlock();
                        if (zD) {
                            xd6Var2 = this.s;
                            if (xd6Var2 != null) {
                                xd6Var2.a();
                            }
                        }
                    } catch (Throwable th2) {
                        lock2.unlock();
                        throw th2;
                    }
                }
                if (y() <= 0 && A() <= 0) {
                    ReentrantReadWriteLock.ReadLock lock3 = this.l.readLock();
                    lock3.lock();
                    try {
                        boolean z = this.k.b == 0;
                        lock3.unlock();
                        if (z) {
                            this.q.set(0);
                            return Long.MIN_VALUE;
                        }
                    } catch (Throwable th3) {
                        lock3.unlock();
                        throw th3;
                    }
                }
                this.t = ew5.p(j, this.v);
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        }
        if (y() > 0 || A() > 0) {
            xd6Var = this.s;
            if (xd6Var != null) {
                xd6Var.a();
            }
        } else {
            ReentrantReadWriteLock.ReadLock lock4 = this.l.readLock();
            lock4.lock();
            try {
                boolean zD2 = this.k.d();
                lock4.unlock();
                if (zD2) {
                    xd6Var = this.s;
                    if (xd6Var != null) {
                        xd6Var.a();
                    }
                }
            } catch (Throwable th5) {
                lock4.unlock();
                throw th5;
            }
        }
        long jH = ew5.h(ew5.p(j, this.u));
        long jH2 = ew5.h(this.t);
        return jH < jH2 ? jH : jH2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void b(long j) {
        Object obj;
        ji9 ji9Var;
        int i;
        long jIncrementAndGet = this.m.incrementAndGet();
        ReentrantReadWriteLock.WriteLock writeLock = this.l.writeLock();
        writeLock.lock();
        try {
            ji9 ji9Var2 = this.k;
            int iB = ji9Var2.b(j);
            if (iB >= 0) {
                ji9Var2.b--;
                long[] jArr = ji9Var2.c;
                int i2 = iB >> 3;
                int i3 = (iB & 7) << 3;
                jArr[i2] = ((~(255 << i3)) & jArr[i2]) | (254 << i3);
                int i4 = ji9Var2.a;
                int i5 = ((iB - 7) & i4) + (i4 & 7);
                int i6 = i5 >> 3;
                int i7 = (i5 & 7) << 3;
                jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
                Object[] objArr = ji9Var2.e;
                obj = objArr[iB];
                objArr[iB] = null;
            } else {
                obj = null;
            }
            ncj ncjVar = (ncj) obj;
            if (ncjVar != null) {
                this.p.offer(ncjVar);
            }
            if (jIncrementAndGet % 1000 == 0 || ((i = (ji9Var = this.k).a) >= 4192 && ji9Var.b / i < 0.25f)) {
                ji9 ji9Var3 = this.k;
                int i8 = ji9Var3.a;
                int i9 = ji9Var3.b;
                int i10 = i9 == 7 ? 8 : i9 + ((i9 - 1) / 7);
                int iNumberOfLeadingZeros = i10 > 0 ? (-1) >>> Integer.numberOfLeadingZeros(i10) : 0;
                if (iNumberOfLeadingZeros < i8) {
                    ji9Var3.e(iNumberOfLeadingZeros);
                }
            }
            writeLock.unlock();
            xd6 xd6Var = this.s;
            if (xd6Var != null) {
                xd6Var.e = xd6Var.f.e.b();
            }
            ReentrantReadWriteLock.ReadLock lock = this.l.readLock();
            lock.lock();
            try {
                boolean z = this.k.b == 0;
                lock.unlock();
                if (!z || y() > 0 || A() > 0) {
                    return;
                }
                this.q.set(0);
                if (!this.g) {
                    if (this.f) {
                        LockSupport.unpark(this.r);
                        return;
                    }
                    return;
                }
                lcj lcjVar = this.h;
                if (lcjVar != null) {
                    ReentrantLock reentrantLock = lcjVar.d;
                    reentrantLock.lock();
                    try {
                        kcj kcjVar = (kcj) lcjVar.c.get(this);
                        if (kcjVar != null) {
                            kcjVar.c = true;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (executorService = this.a).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new be6(runnable, l(), this));
        E();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) throws InterruptedException {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(yw3.W0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ae6((Callable) it.next(), l(), this));
        }
        List listInvokeAll = this.a.invokeAll(arrayList);
        E();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) throws ExecutionException, InterruptedException {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(yw3.W0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ae6((Callable) it.next(), l(), this));
        }
        Object objInvokeAny = this.a.invokeAny(arrayList);
        E();
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final ncj l() {
        Thread threadCurrentThread = Thread.currentThread();
        boolean z = this.c;
        StackTraceElement[] stackTrace = z ? threadCurrentThread.getStackTrace() : null;
        ncj ncjVar = (ncj) this.p.poll();
        yd6 yd6Var = this.e;
        if (ncjVar != null) {
            String name = threadCurrentThread.getName();
            long jB = yd6Var.b();
            ncjVar.a = name;
            ncjVar.b = jB;
            ncjVar.c = jB;
            ncjVar.d = null;
            ncjVar.e = stackTrace;
            return ncjVar;
        }
        String name2 = threadCurrentThread.getName();
        long jB2 = yd6Var.b();
        ncj ncjVar2 = new ncj();
        ncjVar2.a = name2;
        ncjVar2.b = jB2;
        ncjVar2.c = jB2;
        ncjVar2.d = null;
        ncjVar2.e = stackTrace;
        ncjVar2.f = this.d;
        ncjVar2.g = z;
        return ncjVar2;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
        I();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.a.shutdownNow();
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : listShutdownNow) {
            if (runnable instanceof be6) {
                runnable = ((be6) runnable).a;
            }
            arrayList.add(runnable);
        }
        I();
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Future futureSubmit = this.a.submit(new ae6(callable, l(), this));
        E();
        return futureSubmit;
    }

    public final int y() {
        ExecutorService executorService = this.a;
        if (executorService instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executorService).getActiveCount();
        }
        return -1;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Future futureSubmit = this.a.submit(new be6(runnable, l(), this), obj);
        E();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Future<?> futureSubmit = this.a.submit(new be6(runnable, l(), this));
        E();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(yw3.W0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ae6((Callable) it.next(), l(), this));
        }
        List listInvokeAll = this.a.invokeAll(arrayList, j, timeUnit);
        E();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(yw3.W0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ae6((Callable) it.next(), l(), this));
        }
        Object objInvokeAny = this.a.invokeAny(arrayList, j, timeUnit);
        E();
        return objInvokeAny;
    }
}
