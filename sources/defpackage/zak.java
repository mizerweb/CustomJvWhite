package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.by;

/* JADX INFO: loaded from: classes3.dex */
public final class zak {
    public static final t81 B = new t81(6);
    public long A;
    public final z7k b;
    public final ExecutorService c;
    public volatile mak d;
    public final ku8 e;
    public volatile u5k f;
    public volatile int g;
    public volatile int h;
    public volatile Long j;
    public volatile Long k;
    public volatile boolean n;
    public volatile boolean o;
    public volatile long p;
    public long q;
    public long r;
    public final AtomicInteger u;
    public final AtomicInteger v;
    public volatile int w;
    public volatile int x;
    public long y;
    public long z;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Semaphore l = new Semaphore(0);
    public final Semaphore m = new Semaphore(0);
    public volatile Consumer i = B;
    public final ReentrantLock s = new ReentrantLock();
    public final ReentrantLock t = new ReentrantLock();

    public zak(z7k z7kVar, ku8 ku8Var, w8k w8kVar, ExecutorService executorService) {
        this.b = z7kVar;
        this.e = ku8Var;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.u = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.v = atomicInteger2;
        atomicInteger.set(0);
        atomicInteger2.set(2);
        this.w = 3;
        this.x = 1;
        this.c = executorService;
        d(w8kVar);
    }

    public static int a(int i, int i2, boolean z) {
        if (i < 0) {
            return 0;
        }
        int i3 = (i2 == 1 && z) ? 0 : Integer.MIN_VALUE;
        if (i2 == 2 && z) {
            i3 = 1;
        }
        if (i2 == 1 && !z) {
            i3 = 2;
        }
        if (i2 == 2 && !z) {
            i3 = 3;
        }
        int i4 = (i << 2) + i3;
        if (i4 > 0) {
            return i4;
        }
        return Integer.MAX_VALUE;
    }

    public final pak b(boolean z, long j, TimeUnit timeUnit, atj atjVar) throws TimeoutException {
        try {
            if (!(z ? this.l : this.m).tryAcquire(j, timeUnit)) {
                throw new TimeoutException();
            }
            int andAdd = z ? this.u.getAndAdd(4) : this.v.getAndAdd(4);
            zak zakVar = (zak) atjVar.b;
            zakVar.getClass();
            pak pakVar = new pak(andAdd, zakVar.b, zakVar, zakVar.d, zakVar.e);
            this.a.put(Integer.valueOf(andAdd), pakVar);
            return pakVar;
        } catch (InterruptedException unused) {
            throw new TimeoutException("operation interrupted");
        }
    }

    public final void c(int i, int i2, Runnable runnable) {
        if (i >= i2) {
            int i3 = i2;
            while (i3 <= i) {
                zak zakVar = this;
                pak pakVar = new pak(i3, this.b, zakVar, this.d, this.e);
                zakVar.a.put(Integer.valueOf(i3), pakVar);
                zakVar.c.submit(new v1k(zakVar, 4, pakVar));
                i3 += 4;
                this = zakVar;
            }
            runnable.run();
        }
    }

    public final void d(u5k u5kVar) {
        this.f = u5kVar;
        this.g = a(u5kVar.b(), 2, false);
        this.h = a(u5kVar.d(), 2, true);
        this.z = a((int) Long.min(2147483647L, u5kVar.c()), 2, false);
        this.A = a((int) Long.min(2147483647L, u5kVar.e()), 2, true);
        this.p = u5kVar.f();
        this.q = this.p;
        this.r = this.p / 10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public final void e(t8k t8kVar) {
        long jA;
        int i;
        final int i2 = t8kVar.b;
        pak pakVar = (pak) this.a.get(Integer.valueOf(i2));
        final int i3 = 1;
        if (pakVar == null) {
            int i4 = t8kVar.b;
            if (j(i4) && (((i = i4 % 4) > 1 && i4 >= this.w) || (i < 2 && i4 >= this.x))) {
                if (pakVar != null) {
                    jA = pakVar.e.a();
                } else {
                    jA = 0;
                }
                if (t8kVar.f() > jA) {
                    if (this.y + (t8kVar.f() - jA) > this.p) {
                        throw new bJ(4);
                    }
                }
            }
        } else {
            if (pakVar != null) {
                jA = pakVar.e.a();
            } else {
                jA = 0;
            }
            if (t8kVar.f() > jA) {
                if (this.y + (t8kVar.f() - jA) > this.p) {
                    throw new bJ(4);
                }
            }
        }
        if (pakVar != null) {
            this.y = pakVar.a(t8kVar) + this.y;
            return;
        }
        if (j(i2)) {
            int i5 = i2 % 4;
            if ((i5 <= 1 || i2 >= this.g) && (i5 >= 2 || i2 >= this.h)) {
                throw new bJ(5);
            }
            if (i5 > 1) {
                final int i6 = 0;
                c(i2, this.w, new Runnable(this) { // from class: yak
                    public final /* synthetic */ zak b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.b.w = i2 + 4;
                                break;
                            default:
                                this.b.x = i2 + 4;
                                break;
                        }
                    }
                });
            } else {
                c(i2, this.x, new Runnable(this) { // from class: yak
                    public final /* synthetic */ zak b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.b.w = i2 + 4;
                                break;
                            default:
                                this.b.x = i2 + 4;
                                break;
                        }
                    }
                });
            }
            pak pakVar2 = (pak) this.a.get(Integer.valueOf(i2));
            if (pakVar2 != null) {
                this.y = pakVar2.a(t8kVar) + this.y;
            }
        }
    }

    public final void f() {
        this.a.values().stream().forEach(new t81(7));
    }

    public final void g(int i) {
        this.a.remove(Integer.valueOf(i));
        if (j(i)) {
            w4k w4kVar = w4k.d;
            try {
                this.s.lock();
                final int i2 = 0;
                final int i3 = 1;
                if (!(i % 4 > 1) || this.g + 4 >= this.z) {
                    if ((i % 4 < 2 ? 1 : 0) != 0 && this.h + 4 < this.A) {
                        this.h += 4;
                        if (!this.o) {
                            this.b.B.f(new Function(this) { // from class: xak
                                public final /* synthetic */ zak b;

                                {
                                    this.b = this;
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    int i4 = i3;
                                    zak zakVar = this.b;
                                    int iIntValue = ((Integer) obj).intValue();
                                    switch (i4) {
                                        case 0:
                                            return zakVar.h(iIntValue);
                                        default:
                                            return zakVar.i(iIntValue);
                                    }
                                }
                            }, 9, w4kVar, new r5k(2, this));
                            this.o = true;
                        }
                    }
                } else {
                    this.g += 4;
                    if (!this.n) {
                        this.b.B.f(new Function(this) { // from class: xak
                            public final /* synthetic */ zak b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i4 = i2;
                                zak zakVar = this.b;
                                int iIntValue = ((Integer) obj).intValue();
                                switch (i4) {
                                    case 0:
                                        return zakVar.h(iIntValue);
                                    default:
                                        return zakVar.i(iIntValue);
                                }
                            }
                        }, 9, w4kVar, new r5k(2, this));
                        this.n = true;
                    }
                }
            } finally {
                this.s.unlock();
            }
        }
    }

    public final l5k h(int i) {
        if (i < 9) {
            throw new by();
        }
        try {
            this.s.lock();
            this.n = false;
            return new l5k(this.g / 4, false);
        } finally {
            this.s.unlock();
        }
    }

    public final l5k i(int i) {
        if (i < 9) {
            throw new by();
        }
        try {
            this.s.lock();
            this.o = false;
            return new l5k(this.h / 4, true);
        } finally {
            this.s.unlock();
        }
    }

    public final boolean j(int i) {
        return i % 2 == 1;
    }
}
