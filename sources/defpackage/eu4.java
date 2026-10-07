package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class eu4 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(eu4.class, "workerCtl$volatile");
    public final hzj a;
    public final wfe b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ fu4 h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public eu4(fu4 fu4Var, int i2) {
        this.h = fu4Var;
        setDaemon(true);
        setContextClassLoader(fu4.class.getClassLoader());
        this.a = new hzj();
        this.b = new wfe();
        this.c = 4;
        this.nextParkedWorker = fu4.k;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        h(i2);
    }

    public final mjh b(boolean z) {
        mjh mjhVarG;
        mjh mjhVarG2;
        long j;
        int i2 = this.c;
        fu4 fu4Var = this.h;
        hzj hzjVar = this.a;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = fu4.i;
            do {
                j = atomicLongFieldUpdater.get(fu4Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mjh mjhVarG3 = hzjVar.g();
                    return (mjhVarG3 == null && (mjhVarG3 = (mjh) fu4Var.f.d()) == null) ? k(1) : mjhVarG3;
                }
            } while (!fu4.i.compareAndSet(fu4Var, j, j - 4398046511104L));
            this.c = 1;
        }
        if (z) {
            boolean z2 = f(fu4Var.a * 2) == 0;
            if (z2 && (mjhVarG2 = g()) != null) {
                return mjhVarG2;
            }
            mjh mjhVarE = hzjVar.e();
            if (mjhVarE != null) {
                return mjhVarE;
            }
            if (!z2 && (mjhVarG = g()) != null) {
                return mjhVarG;
            }
        } else {
            mjh mjhVarG4 = g();
            if (mjhVarG4 != null) {
                return mjhVarG4;
            }
        }
        return k(3);
    }

    public final int c() {
        return this.indexInArray;
    }

    public final Object d() {
        return this.nextParkedWorker;
    }

    public final int f(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final mjh g() {
        int iF = f(2);
        fu4 fu4Var = this.h;
        xn7 xn7Var = fu4Var.f;
        xn7 xn7Var2 = fu4Var.e;
        if (iF == 0) {
            mjh mjhVar = (mjh) xn7Var2.d();
            return mjhVar != null ? mjhVar : (mjh) xn7Var.d();
        }
        mjh mjhVar2 = (mjh) xn7Var.d();
        return mjhVar2 != null ? mjhVar2 : (mjh) xn7Var2.d();
    }

    public final void h(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void i(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean j(int i2) {
        int i3 = this.c;
        boolean z = i3 == 1;
        if (z) {
            fu4.i.addAndGet(this.h, 4398046511104L);
        }
        if (i3 != i2) {
            this.c = i2;
        }
        return z;
    }

    public final mjh k(int i2) {
        mjh mjhVarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = fu4.i;
        fu4 fu4Var = this.h;
        int i3 = (int) (atomicLongFieldUpdater.get(fu4Var) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int iF = f(i3);
        long jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
        for (int i4 = 0; i4 < i3; i4++) {
            iF++;
            if (iF > i3) {
                iF = 1;
            }
            eu4 eu4Var = (eu4) fu4Var.g.b(iF);
            if (eu4Var != null && eu4Var != this) {
                hzj hzjVar = eu4Var.a;
                if (i2 != 3) {
                    hzjVar.getClass();
                    int i5 = hzj.d.get(hzjVar);
                    int i6 = hzj.c.get(hzjVar);
                    boolean z = i2 == 1;
                    while (true) {
                        if (i5 == i6 || (z && hzj.e.get(hzjVar) == 0)) {
                            mjhVarH = null;
                            break;
                        }
                        int i7 = i5 + 1;
                        mjhVarH = hzjVar.h(i5, z);
                        if (mjhVarH != null) {
                            break;
                        }
                        i5 = i7;
                    }
                } else {
                    mjhVarH = hzjVar.f();
                }
                wfe wfeVar = this.b;
                if (mjhVarH != null) {
                    wfeVar.a = mjhVarH;
                    jI = -1;
                } else {
                    jI = hzjVar.i(i2, wfeVar);
                }
                if (jI == -1) {
                    mjh mjhVar = (mjh) wfeVar.a;
                    wfeVar.a = null;
                    return mjhVar;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (fu4.j.get(this.h) == 1 || this.c == 5) {
                    break loop0;
                }
                mjh mjhVarB = b(this.g);
                if (mjhVarB != null) {
                    this.e = 0L;
                    fu4 fu4Var = this.h;
                    this.d = 0L;
                    if (this.c == 3) {
                        this.c = 2;
                    }
                    if (!mjhVarB.b) {
                        try {
                            mjhVarB.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (j(2) && !fu4Var.K() && !fu4Var.I(fu4.i.get(fu4Var))) {
                        fu4Var.K();
                    }
                    try {
                        mjhVarB.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    fu4.i.addAndGet(fu4Var, -2097152L);
                    if (this.c == 5) {
                        break;
                    }
                    this.c = 4;
                    break;
                }
                this.g = false;
                if (this.e == 0) {
                    Object obj = this.nextParkedWorker;
                    c5b c5bVar = fu4.k;
                    if (obj != c5bVar) {
                        i.set(this, -1);
                        while (this.nextParkedWorker != fu4.k) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            fu4 fu4Var2 = this.h;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = fu4.j;
                            if (atomicIntegerFieldUpdater2.get(fu4Var2) == 1 || this.c == 5) {
                                break;
                            }
                            j(3);
                            Thread.interrupted();
                            if (this.d == 0) {
                                j = 2097151;
                                this.d = System.nanoTime() + this.h.c;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.h.c);
                            if (System.nanoTime() - this.d >= 0) {
                                this.d = 0L;
                                fu4 fu4Var3 = this.h;
                                synchronized (fu4Var3.g) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(fu4Var3) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = fu4.i;
                                            if (((int) (atomicLongFieldUpdater.get(fu4Var3) & j)) > fu4Var3.a) {
                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i2 = this.indexInArray;
                                                    h(0);
                                                    fu4Var3.E(this, i2, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(fu4Var3) & j);
                                                    if (andDecrement != i2) {
                                                        eu4 eu4Var = (eu4) fu4Var3.g.b(andDecrement);
                                                        fu4Var3.g.c(i2, eu4Var);
                                                        eu4Var.h(i2);
                                                        fu4Var3.E(eu4Var, andDecrement, i2);
                                                    }
                                                    fu4Var3.g.c(andDecrement, null);
                                                    this.c = 5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        fu4 fu4Var4 = this.h;
                        if (this.nextParkedWorker == c5bVar) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = fu4.h;
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(fu4Var4);
                                long j3 = (j2 + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152);
                                int i3 = this.indexInArray;
                                this.nextParkedWorker = fu4Var4.g.b((int) (j2 & 2097151));
                                fu4 fu4Var5 = fu4Var4;
                                if (fu4.h.compareAndSet(fu4Var5, j2, j3 | ((long) i3))) {
                                    break;
                                } else {
                                    fu4Var4 = fu4Var5;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        j(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        j(5);
    }
}
