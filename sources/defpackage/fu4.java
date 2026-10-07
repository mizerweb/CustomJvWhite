package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class fu4 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(fu4.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(fu4.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(fu4.class, "_isTerminated$volatile");
    public static final c5b k = new c5b("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final xn7 e;
    public final xn7 f;
    public final yme g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public fu4(long j2, String str, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            c.o(c0a.k(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            c.o(qt4.l("Max pool size ", i3, i2, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            c.o(c0a.k(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j2 <= 0) {
            c.o(nbh.s(j2, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new xn7();
        this.f = new xn7();
        this.g = new yme((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
    }

    public static /* synthetic */ void A(fu4 fu4Var, Runnable runnable, int i2) {
        fu4Var.y(runnable, false, (i2 & 4) == 0);
    }

    public final void E(eu4 eu4Var, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objD = eu4Var.d();
                    while (true) {
                        if (objD == k) {
                            i4 = -1;
                            break;
                        }
                        if (objD == null) {
                            i4 = 0;
                            break;
                        }
                        eu4 eu4Var2 = (eu4) objD;
                        int iC = eu4Var2.c();
                        if (iC != 0) {
                            i4 = iC;
                            break;
                        }
                        objD = eu4Var2.d();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                fu4 fu4Var = this;
                if (h.compareAndSet(fu4Var, j2, ((long) i4) | j3)) {
                    return;
                } else {
                    this = fu4Var;
                }
            }
        }
    }

    public final boolean I(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int iL = l();
            if (iL == 1 && i3 > 1) {
                l();
            }
            if (iL > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean K() {
        fu4 fu4Var;
        c5b c5bVar;
        int iC;
        while (true) {
            long j2 = h.get(this);
            eu4 eu4Var = (eu4) this.g.b((int) (2097151 & j2));
            if (eu4Var == null) {
                eu4Var = null;
                fu4Var = this;
            } else {
                long j3 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & (-2097152);
                Object objD = eu4Var.d();
                while (true) {
                    c5bVar = k;
                    if (objD == c5bVar) {
                        iC = -1;
                        break;
                    }
                    if (objD == null) {
                        iC = 0;
                        break;
                    }
                    eu4 eu4Var2 = (eu4) objD;
                    iC = eu4Var2.c();
                    if (iC != 0) {
                        break;
                    }
                    objD = eu4Var2.d();
                    j2 = j2;
                }
                if (iC >= 0) {
                    fu4 fu4Var2 = this;
                    boolean zCompareAndSet = h.compareAndSet(fu4Var2, j2, ((long) iC) | j3);
                    fu4Var = fu4Var2;
                    if (zCompareAndSet) {
                        eu4Var.i(c5bVar);
                    }
                    this = fu4Var;
                } else {
                    continue;
                }
            }
            if (eu4Var == null) {
                return false;
            }
            if (eu4.i.compareAndSet(eu4Var, -1, 0)) {
                LockSupport.unpark(eu4Var);
                return true;
            }
            this = fu4Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        mjh mjhVarB;
        if (j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            eu4 eu4Var = null;
            eu4 eu4Var2 = threadCurrentThread instanceof eu4 ? (eu4) threadCurrentThread : null;
            if (eu4Var2 != null && eu4Var2.h == this) {
                eu4Var = eu4Var2;
            }
            synchronized (this.g) {
                i2 = (int) (i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    eu4 eu4Var3 = (eu4) this.g.b(i3);
                    if (eu4Var3 != eu4Var) {
                        while (eu4Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(eu4Var3);
                            eu4Var3.join(10000L);
                        }
                        eu4Var3.a.d(this.f);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (eu4Var != null) {
                    mjhVarB = eu4Var.b(true);
                    if (mjhVarB == null) {
                        mjhVarB = (mjh) this.e.d();
                        if (mjhVarB == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    mjhVarB = (mjh) this.e.d();
                    if (mjhVarB == null && (mjhVarB = (mjh) this.f.d()) == null) {
                        break;
                    }
                }
                try {
                    mjhVarB.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (eu4Var != null) {
                eu4Var.j(5);
            }
            h.set(this, 0L);
            i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A(this, runnable, 6);
    }

    public final int l() {
        synchronized (this.g) {
            try {
                if (j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                eu4 eu4Var = new eu4(this, i4);
                this.g.c(i4, eu4Var);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                eu4Var.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        yme ymeVar = this.g;
        int iA = ymeVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            eu4 eu4Var = (eu4) ymeVar.b(i7);
            if (eu4Var != null) {
                int iC = eu4Var.a.c();
                int iD = qt4.D(eu4Var.c);
                if (iD == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iD == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iD == 2) {
                    i4++;
                } else if (iD == 3) {
                    i5++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iD != 4) {
                        ore.o();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(f55.n(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        qt4.x(this.b, i2, "}, Worker States {CPU = ", ", blocking = ", sb4);
        qt4.x(i3, i4, ", parked = ", ", dormant = ", sb4);
        qt4.x(i5, i6, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void y(Runnable runnable, boolean z, boolean z2) {
        mjh zjhVar;
        int i2;
        ykh.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof mjh) {
            zjhVar = (mjh) runnable;
            zjhVar.a = jNanoTime;
            zjhVar.b = z;
        } else {
            zjhVar = new zjh(runnable, jNanoTime, z);
        }
        boolean z3 = zjhVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        eu4 eu4Var = null;
        eu4 eu4Var2 = threadCurrentThread instanceof eu4 ? (eu4) threadCurrentThread : null;
        if (eu4Var2 != null && eu4Var2.h == this) {
            eu4Var = eu4Var2;
        }
        if (eu4Var != null && (i2 = eu4Var.c) != 5 && (zjhVar.b || i2 != 2)) {
            eu4Var.g = true;
            zjhVar = eu4Var.a.a(zjhVar, z2);
        }
        if (zjhVar != null) {
            if (!(zjhVar.b ? this.f.a(zjhVar) : this.e.a(zjhVar))) {
                throw new RejectedExecutionException(zo5.w(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (K() || I(jAddAndGet)) {
                return;
            }
            K();
            return;
        }
        if (K() || I(atomicLongFieldUpdater.get(this))) {
            return;
        }
        K();
    }
}
