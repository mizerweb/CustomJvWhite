package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class hzj {
    public final AtomicReferenceArray a = new AtomicReferenceArray(np0.m);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(hzj.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = bl0.a.objectFieldOffset(hzj.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(hzj.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(hzj.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(hzj.class, "blockingTasksInBuffer$volatile");

    public final mjh a(mjh mjhVar, boolean z) {
        if (z) {
            return b(mjhVar);
        }
        b.getClass();
        mjh mjhVar2 = (mjh) bl0.a.getAndSetObject(this, f, mjhVar);
        if (mjhVar2 == null) {
            return null;
        }
        return b(mjhVar2);
    }

    public final mjh b(mjh mjhVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return mjhVar;
        }
        if (mjhVar.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, mjhVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = bl0.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(xn7 xn7Var) {
        b.getClass();
        mjh mjhVar = (mjh) bl0.a.getAndSetObject(this, f, (Object) null);
        if (mjhVar != null) {
            xn7Var.a(mjhVar);
        }
        while (true) {
            mjh mjhVarF = f();
            if (mjhVarF == null) {
                return;
            } else {
                xn7Var.a(mjhVarF);
            }
        }
    }

    public final mjh e() {
        b.getClass();
        mjh mjhVar = (mjh) bl0.a.getAndSetObject(this, f, (Object) null);
        return mjhVar == null ? f() : mjhVar;
    }

    public final mjh f() {
        mjh mjhVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (mjhVar = (mjh) this.a.getAndSet(i2, null)) != null) {
                if (mjhVar.b) {
                    e.decrementAndGet(this);
                }
                return mjhVar;
            }
        }
    }

    public final mjh g() {
        hzj hzjVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = bl0.a;
            long j = f;
            mjh mjhVar = (mjh) unsafe.getObjectVolatile(this, j);
            if (mjhVar == null || !mjhVar.b) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = bl0.a;
                hzjVar = this;
                if (unsafe2.compareAndSwapObject(hzjVar, f, mjhVar, (Object) null)) {
                    return mjhVar;
                }
                if (unsafe2.getObjectVolatile(hzjVar, j) != mjhVar) {
                    break;
                }
                this = hzjVar;
            }
            this = hzjVar;
        }
        hzj hzjVar2 = this;
        int i = d.get(hzjVar2);
        int i2 = c.get(hzjVar2);
        while (i != i2 && e.get(hzjVar2) != 0) {
            i2--;
            mjh mjhVarH = hzjVar2.h(i2, true);
            if (mjhVarH != null) {
                return mjhVarH;
            }
        }
        return null;
    }

    public final mjh h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        mjh mjhVar = (mjh) atomicReferenceArray.get(i2);
        if (mjhVar != null && mjhVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, mjhVar, null)) {
                if (atomicReferenceArray.get(i2) != mjhVar) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return mjhVar;
        }
        return null;
    }

    public final long i(int i, wfe wfeVar) {
        hzj hzjVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = bl0.a;
            long j = f;
            mjh mjhVar = (mjh) unsafe.getObjectVolatile(this, j);
            if (mjhVar == null) {
                return -2L;
            }
            if (((mjhVar.b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            ykh.f.getClass();
            long jNanoTime = System.nanoTime() - mjhVar.a;
            long j2 = ykh.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = bl0.a;
                hzjVar = this;
                if (unsafe2.compareAndSwapObject(hzjVar, f, mjhVar, (Object) null)) {
                    wfeVar.a = mjhVar;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(hzjVar, j) != mjhVar) {
                    break;
                }
                this = hzjVar;
            }
            this = hzjVar;
        }
    }
}
