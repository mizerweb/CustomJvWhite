package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class egf {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(egf.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final f11 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = bl0.a;
        h = unsafe.objectFieldOffset(egf.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(egf.class, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(egf.class, Object.class, "tail$volatile");
        i = unsafe.objectFieldOffset(egf.class.getDeclaredField("tail$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(egf.class, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(egf.class, "_availablePermits$volatile");
    }

    public egf(int i2) {
        this.a = i2;
        if (i2 <= 0) {
            c.o(zo5.h(i2, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0) {
            c.o(zo5.h(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        hgf hgfVar = new hgf(0L, null, 2);
        this.head$volatile = hgfVar;
        this.tail$volatile = hgfVar;
        this._availablePermits$volatile = i2;
        this.b = new f11(2, this);
    }

    public final Object a(nq4 nq4Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i2;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i2 = this.a;
        } while (andDecrement > i2);
        sbi sbiVar = sbi.a;
        if (andDecrement <= 0) {
            ek2 ek2VarR = wk8.r(p90.B(nq4Var));
            try {
                if (!c(ek2VarR)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i2) {
                            if (andDecrement2 > 0) {
                                ek2VarR.j(sbiVar, this.b);
                                break;
                            }
                            if (c(ek2VarR)) {
                                break;
                            }
                        }
                    }
                }
                Object objS = ek2VarR.s();
                hu4 hu4Var = hu4.a;
                if (objS != hu4Var) {
                    objS = sbiVar;
                }
                if (objS == hu4Var) {
                    return objS;
                }
            } catch (Throwable th) {
                ek2VarR.B();
                throw th;
            }
        }
        return sbiVar;
    }

    public final boolean c(qbj qbjVar) {
        Object objZ;
        long j;
        hgf hgfVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        atomicReferenceFieldUpdater.getClass();
        Unsafe unsafe = bl0.a;
        long j2 = i;
        hgf hgfVar2 = (hgf) unsafe.getObjectVolatile(this, j2);
        long andIncrement = f.getAndIncrement(this);
        cgf cgfVar = cgf.a;
        long j3 = andIncrement / ((long) ggf.f);
        loop0: while (true) {
            objZ = sb8.z(hgfVar2, j3, cgfVar);
            if (rx8.O(objZ)) {
                break;
            }
            gcf gcfVarH = rx8.H(objZ);
            while (true) {
                gcf gcfVar = (gcf) bl0.a.getObjectVolatile(this, j2);
                j = j2;
                hgfVar = hgfVar2;
                if (gcfVar.e >= gcfVarH.e) {
                    break loop0;
                }
                if (!gcfVarH.o()) {
                    break;
                }
                if (pye.g(atomicReferenceFieldUpdater, this, gcfVar, gcfVarH)) {
                    if (!gcfVar.k()) {
                        break loop0;
                    }
                    gcfVar.i();
                    break loop0;
                }
                if (gcfVarH.k()) {
                    gcfVarH.i();
                }
                hgfVar2 = hgfVar;
                j2 = j;
            }
            hgfVar2 = hgfVar;
            j2 = j;
        }
        hgf hgfVar3 = (hgf) rx8.H(objZ);
        AtomicReferenceArray atomicReferenceArray = hgfVar3.g;
        int i2 = (int) (andIncrement % ((long) ggf.f));
        if (pye.e(atomicReferenceArray, i2, qbjVar)) {
            qbjVar.a(hgfVar3, i2);
            return true;
        }
        if (!pye.f(atomicReferenceArray, i2, ggf.b, ggf.c)) {
            return false;
        }
        ((ck2) qbjVar).j(sbi.a, this.b);
        return true;
    }

    public final void d() {
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.a;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                ore.k(nbh.q(i3, "The number of released permits cannot be greater than "));
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!e());
    }

    public final boolean e() {
        Object objZ;
        long j;
        hgf hgfVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        atomicReferenceFieldUpdater.getClass();
        Unsafe unsafe = bl0.a;
        long j2 = h;
        hgf hgfVar2 = (hgf) unsafe.getObjectVolatile(this, j2);
        long andIncrement = d.getAndIncrement(this);
        long j3 = andIncrement / ((long) ggf.f);
        dgf dgfVar = dgf.a;
        loop0: while (true) {
            objZ = sb8.z(hgfVar2, j3, dgfVar);
            if (rx8.O(objZ)) {
                break;
            }
            gcf gcfVarH = rx8.H(objZ);
            while (true) {
                gcf gcfVar = (gcf) bl0.a.getObjectVolatile(this, j2);
                j = j2;
                hgfVar = hgfVar2;
                if (gcfVar.e >= gcfVarH.e) {
                    break loop0;
                }
                if (!gcfVarH.o()) {
                    break;
                }
                if (pye.g(atomicReferenceFieldUpdater, this, gcfVar, gcfVarH)) {
                    if (!gcfVar.k()) {
                        break loop0;
                    }
                    gcfVar.i();
                    break loop0;
                }
                if (gcfVarH.k()) {
                    gcfVarH.i();
                }
                hgfVar2 = hgfVar;
                j2 = j;
            }
            hgfVar2 = hgfVar;
            j2 = j;
        }
        hgf hgfVar3 = (hgf) rx8.H(objZ);
        hgfVar3.a();
        AtomicReferenceArray atomicReferenceArray = hgfVar3.g;
        if (hgfVar3.e <= j3) {
            int i2 = (int) (andIncrement % ((long) ggf.f));
            Object andSet = atomicReferenceArray.getAndSet(i2, ggf.b);
            if (andSet == null) {
                int i3 = ggf.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (atomicReferenceArray.get(i2) == ggf.c) {
                        return true;
                    }
                }
                return !pye.f(atomicReferenceArray, i2, ggf.b, ggf.d);
            }
            if (andSet != ggf.e) {
                boolean z = andSet instanceof ck2;
                sbi sbiVar = sbi.a;
                if (!z) {
                    if (andSet instanceof tdf) {
                        return ((sdf) ((tdf) andSet)).l(this, sbiVar);
                    }
                    qr7.v(andSet, "unexpected: ");
                    return false;
                }
                ck2 ck2Var = (ck2) andSet;
                c5b c5bVarE = ck2Var.e(sbiVar, this.b);
                if (c5bVarE != null) {
                    ck2Var.m(c5bVarE);
                    return true;
                }
            }
        }
        return false;
    }
}
