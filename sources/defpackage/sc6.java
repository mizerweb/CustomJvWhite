package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ru.ok.android.onelog.impl.BuildConfig;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class sc6 extends nc6 implements jg5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(sc6.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicIntegerFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = bl0.a;
        k = unsafe.objectFieldOffset(sc6.class.getDeclaredField("_queue$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(sc6.class, Object.class, "_delayed$volatile");
        j = unsafe.objectFieldOffset(sc6.class.getDeclaredField("_delayed$volatile"));
        i = AtomicIntegerFieldUpdater.newUpdater(sc6.class, "_isCompleted$volatile");
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        Z0(runnable);
    }

    @Override // defpackage.jg5
    public final void P(long j2, ek2 ek2Var) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? BuildConfig.MAX_TIME_TO_UPLOAD : 1000000 * j2;
        }
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            oc6 oc6Var = new oc6(this, j3 + jNanoTime, ek2Var);
            i1(jNanoTime, oc6Var);
            ek2Var.x(new qj2(1, oc6Var));
        }
    }

    @Override // defpackage.nc6
    public final long V0() {
        if (W0()) {
            return 0L;
        }
        a1();
        Runnable runnableY0 = Y0();
        if (runnableY0 == null) {
            return c1();
        }
        runnableY0.run();
        return 0L;
    }

    public final void X0() {
        sc6 sc6Var;
        Unsafe unsafe;
        c5b c5bVar = qyj.b;
        while (true) {
            g.getClass();
            Unsafe unsafe2 = bl0.a;
            long j2 = k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = bl0.a;
                    sc6Var = this;
                    if (unsafe3.compareAndSwapObject(sc6Var, k, (Object) null, c5bVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(sc6Var, j2) != null) {
                        break;
                    } else {
                        this = sc6Var;
                    }
                }
            } else {
                sc6Var = this;
                if (objectVolatile instanceof od9) {
                    ((od9) objectVolatile).c();
                    return;
                }
                if (objectVolatile == c5bVar) {
                    return;
                }
                od9 od9Var = new od9(8, true);
                od9Var.a((Runnable) objectVolatile);
                do {
                    unsafe = bl0.a;
                    if (unsafe.compareAndSwapObject(sc6Var, k, objectVolatile, od9Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(sc6Var, j2) == objectVolatile);
            }
            this = sc6Var;
        }
    }

    public final Runnable Y0() {
        sc6 sc6Var;
        Unsafe unsafe;
        while (true) {
            g.getClass();
            Unsafe unsafe2 = bl0.a;
            long j2 = k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof od9) {
                od9 od9Var = (od9) objectVolatile;
                Object objE = od9Var.e();
                if (objE == od9.g) {
                    od9 od9VarD = od9Var.d();
                    while (true) {
                        Unsafe unsafe3 = bl0.a;
                        sc6Var = this;
                        if (unsafe3.compareAndSwapObject(sc6Var, k, objectVolatile, od9VarD) || unsafe3.getObjectVolatile(sc6Var, j2) != objectVolatile) {
                            break;
                        }
                        this = sc6Var;
                    }
                } else {
                    return (Runnable) objE;
                }
            } else {
                sc6Var = this;
                if (objectVolatile == qyj.b) {
                    return null;
                }
                do {
                    unsafe = bl0.a;
                    if (unsafe.compareAndSwapObject(sc6Var, k, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(sc6Var, j2) == objectVolatile);
            }
            this = sc6Var;
        }
    }

    public void Z0(Runnable runnable) {
        a1();
        if (!b1(runnable)) {
            oa5.l.Z0(runnable);
            return;
        }
        Thread threadD1 = d1();
        if (Thread.currentThread() != threadD1) {
            LockSupport.unpark(threadD1);
        }
    }

    public final void a1() {
        qc6 qc6VarB;
        h.getClass();
        rc6 rc6Var = (rc6) bl0.a.getObjectVolatile(this, j);
        if (rc6Var == null || uqh.b.get(rc6Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (rc6Var) {
                try {
                    qc6[] qc6VarArr = rc6Var.a;
                    qc6VarB = null;
                    qc6 qc6Var = qc6VarArr != null ? qc6VarArr[0] : null;
                    if (qc6Var != null) {
                        qc6VarB = ((jNanoTime - qc6Var.a) > 0L ? 1 : ((jNanoTime - qc6Var.a) == 0L ? 0 : -1)) >= 0 ? b1(qc6Var) : false ? rc6Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (qc6VarB != null);
    }

    public final boolean b1(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            g.getClass();
            Unsafe unsafe4 = bl0.a;
            long j2 = k;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j2);
            if (i.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = bl0.a;
                    if (unsafe.compareAndSwapObject(this, k, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j2) == null);
            } else if (objectVolatile instanceof od9) {
                od9 od9Var = (od9) objectVolatile;
                int iA = od9Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    od9 od9VarD = od9Var.d();
                    do {
                        unsafe2 = bl0.a;
                        if (unsafe2.compareAndSwapObject(this, k, objectVolatile, od9VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == qyj.b) {
                    return false;
                }
                od9 od9Var2 = new od9(8, true);
                od9Var2.a((Runnable) objectVolatile);
                od9Var2.a(runnable);
                do {
                    unsafe3 = bl0.a;
                    if (unsafe3.compareAndSwapObject(this, k, objectVolatile, od9Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j2) == objectVolatile);
            }
        }
    }

    public final long c1() {
        qc6 qc6Var;
        zv zvVar = this.e;
        if (((zvVar == null || zvVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            g.getClass();
            Unsafe unsafe = bl0.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, k);
            if (objectVolatile != null) {
                if (objectVolatile instanceof od9) {
                    long j2 = od9.f.get((od9) objectVolatile);
                    if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == qyj.b) {
                    return BuildConfig.MAX_TIME_TO_UPLOAD;
                }
            }
            h.getClass();
            rc6 rc6Var = (rc6) unsafe.getObjectVolatile(this, j);
            if (rc6Var != null) {
                synchronized (rc6Var) {
                    qc6[] qc6VarArr = rc6Var.a;
                    qc6Var = qc6VarArr != null ? qc6VarArr[0] : null;
                }
                if (qc6Var != null) {
                    long jNanoTime = qc6Var.a - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        return 0L;
    }

    public abstract Thread d1();

    public final boolean e1() {
        zv zvVar = this.e;
        if (zvVar != null ? zvVar.isEmpty() : true) {
            h.getClass();
            Unsafe unsafe = bl0.a;
            rc6 rc6Var = (rc6) unsafe.getObjectVolatile(this, j);
            if (rc6Var != null && uqh.b.get(rc6Var) != 0) {
                return false;
            }
            g.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, k);
            if (objectVolatile != null) {
                if (objectVolatile instanceof od9) {
                    long j2 = od9.f.get((od9) objectVolatile);
                    return ((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == qyj.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void f1(long j2, qc6 qc6Var) {
        oa5.l.i1(j2, qc6Var);
    }

    public final void g1() {
        qc6 qc6VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            h.getClass();
            rc6 rc6Var = (rc6) bl0.a.getObjectVolatile(this, j);
            if (rc6Var == null) {
                return;
            }
            synchronized (rc6Var) {
                qc6VarB = uqh.b.get(rc6Var) > 0 ? rc6Var.b(0) : null;
            }
            if (qc6VarB == null) {
                return;
            } else {
                f1(jNanoTime, qc6VarB);
            }
        }
    }

    public final void h1() {
        g.getClass();
        Unsafe unsafe = bl0.a;
        unsafe.putObjectVolatile(this, k, (Object) null);
        h.getClass();
        unsafe.putObjectVolatile(this, j, (Object) null);
    }

    public final void i1(long j2, qc6 qc6Var) {
        Thread threadD1;
        int iJ1 = j1(j2, qc6Var);
        if (iJ1 == 0) {
            if (!k1(qc6Var) || Thread.currentThread() == (threadD1 = d1())) {
                return;
            }
            LockSupport.unpark(threadD1);
            return;
        }
        if (iJ1 == 1) {
            f1(j2, qc6Var);
        } else {
            if (iJ1 == 2) {
                return;
            }
            ore.k("unexpected result");
        }
    }

    public final int j1(long j2, qc6 qc6Var) {
        sc6 sc6Var;
        Unsafe unsafe;
        if (i.get(this) == 1) {
            return 1;
        }
        h.getClass();
        Unsafe unsafe2 = bl0.a;
        long j3 = j;
        rc6 rc6Var = (rc6) unsafe2.getObjectVolatile(this, j3);
        if (rc6Var == null) {
            rc6 rc6Var2 = new rc6();
            rc6Var2.c = j2;
            while (true) {
                unsafe = bl0.a;
                sc6Var = this;
                if (unsafe.compareAndSwapObject(sc6Var, j, (Object) null, rc6Var2) || unsafe.getObjectVolatile(sc6Var, j3) != null) {
                    break;
                }
                this = sc6Var;
            }
            rc6Var = (rc6) unsafe.getObjectVolatile(sc6Var, j3);
        } else {
            sc6Var = this;
        }
        return qc6Var.b(j2, rc6Var, sc6Var);
    }

    public final boolean k1(qc6 qc6Var) {
        h.getClass();
        rc6 rc6Var = (rc6) bl0.a.getObjectVolatile(this, j);
        qc6 qc6Var2 = null;
        if (rc6Var != null) {
            synchronized (rc6Var) {
                qc6[] qc6VarArr = rc6Var.a;
                qc6Var2 = qc6VarArr != null ? qc6VarArr[0] : null;
            }
        }
        return qc6Var2 == qc6Var;
    }

    @Override // defpackage.nc6
    public void shutdown() {
        qqh.a.set(null);
        i.set(this, 1);
        X0();
        while (V0() <= 0) {
        }
        g1();
    }

    public no5 t0(long j2, Runnable runnable, vt4 vt4Var) {
        return pa5.a.t0(j2, runnable, vt4Var);
    }
}
