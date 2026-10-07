package defpackage;

import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class xd6 {
    public final long a;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final e6 c = new e6(15, this);
    public long d;
    public volatile long e;
    public final /* synthetic */ ce6 f;

    public xd6(ce6 ce6Var, long j) {
        this.f = ce6Var;
        this.a = j;
        this.d = ew5.p(ce6Var.e.b(), j);
        this.e = ew5.o(ce6Var.e.b(), j);
    }

    public final void a() {
        Collection collectionJ;
        int i;
        Object poeVar;
        if (this.f.a.isTerminated() || this.f.a.isShutdown()) {
            return;
        }
        boolean z = true;
        int i2 = 0;
        boolean zCompareAndSet = this.b.compareAndSet(true, false);
        ce6 ce6Var = this.f;
        if (zCompareAndSet) {
            long jB = ce6Var.e.b();
            if (ew5.d(ew5.o(jB, this.e), ew5.e(2, this.a)) < 0) {
                this.b.set(true);
                return;
            }
            this.d = ew5.p(jB, this.a);
            try {
                this.f.a.execute(this.c);
                return;
            } catch (RejectedExecutionException unused) {
                this.b.set(true);
                return;
            }
        }
        if (ew5.d(ce6Var.e.b(), this.d) > 0) {
            boolean z2 = this.b.get();
            ce6 ce6Var2 = this.f;
            ji9 ji9Var = ce6Var2.k;
            ReentrantReadWriteLock.ReadLock lock = ce6Var2.l.readLock();
            lock.lock();
            try {
                if (ji9Var.b != 0) {
                    z = false;
                }
                if (z) {
                    collectionJ = r66.a;
                } else {
                    c79 c79VarW = yab.w();
                    long[] jArr = ji9Var.c;
                    long[] jArr2 = ji9Var.d;
                    Object[] objArr = ji9Var.e;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                for (int i4 = i2; i4 < 8; i4++) {
                                    if ((255 & j) < 128 && (i = (i3 << 3) + i4) < ji9Var.a) {
                                        long j2 = jArr2[i];
                                        c79VarW.add(((ncj) objArr[i]).a());
                                    }
                                    j >>= 8;
                                }
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                            i2 = 0;
                        }
                    }
                    collectionJ = yab.j(c79VarW);
                }
                lock.unlock();
                Collection collection = collectionJ;
                if (z2) {
                    this.d = ew5.p(this.f.e.b(), this.a);
                    return;
                }
                this.d = ew5.c;
                try {
                    this.f.b.c(collection);
                    poeVar = sbi.a;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    thA.printStackTrace();
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
    }
}
