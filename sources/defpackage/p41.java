package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import ru.ok.android.onelog.impl.BuildConfig;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class p41 implements hr2 {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(p41.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(p41.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(p41.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(p41.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(p41.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final cf7 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final f11 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = bl0.a;
        q = unsafe.objectFieldOffset(p41.class.getDeclaredField("sendSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(p41.class, Object.class, "receiveSegment$volatile");
        p = unsafe.objectFieldOffset(p41.class.getDeclaredField("receiveSegment$volatile"));
        j = AtomicReferenceFieldUpdater.newUpdater(p41.class, Object.class, "bufferEndSegment$volatile");
        n = unsafe.objectFieldOffset(p41.class.getDeclaredField("bufferEndSegment$volatile"));
        k = AtomicReferenceFieldUpdater.newUpdater(p41.class, Object.class, "_closeCause$volatile");
        m = unsafe.objectFieldOffset(p41.class.getDeclaredField("_closeCause$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(p41.class, Object.class, "closeHandler$volatile");
        o = unsafe.objectFieldOffset(p41.class.getDeclaredField("closeHandler$volatile"));
    }

    public p41(int i2, cf7 cf7Var) {
        long j2;
        this.a = i2;
        this.b = cf7Var;
        if (i2 < 0) {
            c.o(c0a.k(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        es2 es2Var = r41.a;
        if (i2 != 0) {
            j2 = i2 != Integer.MAX_VALUE ? i2 : BuildConfig.MAX_TIME_TO_UPLOAD;
        } else {
            j2 = 0;
        }
        this.bufferEnd$volatile = j2;
        this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
        es2 es2Var2 = new es2(0L, null, this, 3);
        this.sendSegment$volatile = es2Var2;
        this.receiveSegment$volatile = es2Var2;
        this.bufferEndSegment$volatile = G() ? r41.a : es2Var2;
        this.c = cf7Var != null ? new f11(1, this) : null;
        this._closeCause$volatile = r41.s;
    }

    public static Object J(p41 p41Var, nq4 nq4Var) throws Throwable {
        es2 es2Var;
        Throwable th;
        es2 es2Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        atomicReferenceFieldUpdater.getClass();
        kol.b(p41Var);
        es2 es2Var3 = (es2) bl0.a.getObjectVolatile(p41Var, p);
        while (!p41Var.C()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(p41Var);
            long j2 = r41.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (es2Var3.e != j3) {
                es2 es2VarQ = p41Var.q(j3, es2Var3);
                if (es2VarQ == null) {
                    continue;
                } else {
                    es2Var = es2VarQ;
                }
            } else {
                es2Var = es2Var3;
            }
            p41 p41Var2 = p41Var;
            Object objS = p41Var2.S(es2Var, i2, andIncrement, null);
            c5b c5bVar = r41.m;
            i41 i41Var = null;
            if (objS == c5bVar) {
                ore.k("unexpected");
                return null;
            }
            c5b c5bVar2 = r41.o;
            if (objS == c5bVar2) {
                if (andIncrement < p41Var2.w()) {
                    es2Var.a();
                }
                p41Var = p41Var2;
                es2Var3 = es2Var;
            } else {
                if (objS != r41.n) {
                    es2Var.a();
                    return objS;
                }
                cf7 cf7Var = p41Var2.b;
                ek2 ek2VarR = wk8.r(p90.B(nq4Var));
                try {
                    Object objS2 = p41Var2.S(es2Var, i2, andIncrement, ek2VarR);
                    if (objS2 != c5bVar) {
                        if (objS2 == c5bVar2) {
                            if (andIncrement < p41Var2.w()) {
                                es2Var.a();
                            }
                            es2 es2Var4 = (es2) atomicReferenceFieldUpdater.get(p41Var2);
                            while (true) {
                                if (p41Var2.C()) {
                                    ek2VarR.resumeWith(new poe(p41Var2.u()));
                                    break;
                                }
                                ek2 ek2Var = ek2VarR;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(p41Var2);
                                    long j4 = r41.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (es2Var4.e != j5) {
                                        try {
                                            es2 es2VarQ2 = p41Var2.q(j5, es2Var4);
                                            if (es2VarQ2 == null) {
                                                ek2VarR = ek2Var;
                                            } else {
                                                es2Var2 = es2VarQ2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            ek2VarR = ek2Var;
                                            ek2VarR.B();
                                            throw th;
                                        }
                                    } else {
                                        es2Var2 = es2Var4;
                                    }
                                    p41 p41Var3 = p41Var2;
                                    objS2 = p41Var3.S(es2Var2, i3, andIncrement2, ek2Var);
                                    p41Var2 = p41Var3;
                                    es2 es2Var5 = es2Var2;
                                    ek2VarR = ek2Var;
                                    if (objS2 == r41.m) {
                                        ek2VarR.a(es2Var5, i3);
                                        break;
                                    }
                                    if (objS2 == r41.o) {
                                        if (andIncrement2 < p41Var2.w()) {
                                            es2Var5.a();
                                        }
                                        es2Var4 = es2Var5;
                                    } else {
                                        if (objS2 == r41.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        es2Var5.a();
                                        if (cf7Var != null) {
                                            i41Var = new i41(p41Var2, 0);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    ek2VarR = ek2Var;
                                    th = th;
                                    ek2VarR.B();
                                    throw th;
                                }
                            }
                        } else {
                            es2Var.a();
                            if (cf7Var != null) {
                                i41Var = new i41(p41Var2, 0);
                            }
                        }
                        ek2VarR.j(objS2, i41Var);
                        break;
                    }
                    ek2VarR.a(es2Var, i2);
                    return ek2VarR.s();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thU = p41Var.u();
        int i4 = kgg.a;
        throw thU;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object K(p41 p41Var, nq4 nq4Var) {
        n41 n41Var;
        es2 es2Var;
        if (nq4Var instanceof n41) {
            n41Var = (n41) nq4Var;
            int i2 = n41Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n41Var.f = i2 - Integer.MIN_VALUE;
            } else {
                n41Var = new n41(p41Var, nq4Var);
            }
        } else {
            n41Var = new n41(p41Var, nq4Var);
        }
        n41 n41Var2 = n41Var;
        Object obj = n41Var2.d;
        int i3 = n41Var2.f;
        if (i3 != 0) {
            if (i3 == 1) {
                ch3.d0(obj);
                return ((ds2) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        i.getClass();
        es2 es2Var2 = (es2) bl0.a.getObjectVolatile(p41Var, p);
        while (!p41Var.C()) {
            long andIncrement = e.getAndIncrement(p41Var);
            long j2 = r41.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (es2Var2.e != j3) {
                es2 es2VarQ = p41Var.q(j3, es2Var2);
                if (es2VarQ == null) {
                    continue;
                } else {
                    es2Var = es2VarQ;
                }
            } else {
                es2Var = es2Var2;
            }
            p41 p41Var2 = p41Var;
            Object objS = p41Var2.S(es2Var, i4, andIncrement, null);
            if (objS == r41.m) {
                ore.k("unexpected");
                return null;
            }
            if (objS != r41.o) {
                if (objS != r41.n) {
                    es2Var.a();
                    return objS;
                }
                n41Var2.f = 1;
                Object objL = p41Var2.L(es2Var, i4, andIncrement, n41Var2);
                hu4 hu4Var = hu4.a;
                return objL == hu4Var ? hu4Var : objL;
            }
            if (andIncrement < p41Var2.w()) {
                es2Var.a();
            }
            p41Var = p41Var2;
            es2Var2 = es2Var;
        }
        return new bs2(p41Var.s());
    }

    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161 A[RETURN] */
    public static Object O(p41 p41Var, Object obj, lq4 lq4Var) throws IllegalAccessException, InvocationTargetException {
        sbi sbiVar;
        sbi sbiVar2;
        Object objS;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        atomicReferenceFieldUpdater.getClass();
        es2 es2Var = (es2) bl0.a.getObjectVolatile(p41Var, q);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(p41Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zB = p41Var.B(andIncrement, false);
            int i2 = r41.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = es2Var.e;
            sbiVar = sbi.a;
            hu4 hu4Var = hu4.a;
            if (j5 != j4) {
                es2 es2VarR = p41Var.r(j4, es2Var);
                if (es2VarR != null) {
                    es2Var = es2VarR;
                } else if (zB) {
                    Object objI = p41Var.I(lq4Var, obj);
                    if (objI != hu4Var) {
                        break;
                    }
                    return objI;
                }
            }
            int iG = g(p41Var, es2Var, i3, obj, j2, null, zB);
            if (iG == 0) {
                es2Var.a();
                return sbiVar;
            }
            if (iG == 1) {
                break;
            }
            if (iG == 2) {
                if (!zB) {
                    return sbiVar;
                }
                es2Var.n();
                Object objI2 = p41Var.I(lq4Var, obj);
                return objI2 == hu4Var ? objI2 : sbiVar;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (iG == 3) {
                ek2 ek2VarR = wk8.r(p90.B(lq4Var));
                try {
                    int iG2 = g(p41Var, es2Var, i3, obj, j2, ek2VarR, false);
                    if (iG2 != 0) {
                        if (iG2 == 1) {
                            sbiVar2 = sbiVar;
                            ek2VarR.resumeWith(sbiVar2);
                        } else if (iG2 == 2) {
                            sbiVar2 = sbiVar;
                            ek2VarR.a(es2Var, i3 + i2);
                        } else if (iG2 == 4) {
                            sbiVar2 = sbiVar;
                            if (j2 < atomicLongFieldUpdater2.get(p41Var)) {
                                es2Var.a();
                            }
                            e(p41Var, obj, ek2VarR);
                        } else {
                            if (iG2 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            es2Var.a();
                            es2 es2Var2 = (es2) atomicReferenceFieldUpdater.get(p41Var);
                            while (true) {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(p41Var);
                                long j6 = andIncrement2 & 1152921504606846975L;
                                boolean zB2 = p41Var.B(andIncrement2, false);
                                int i4 = r41.b;
                                long j7 = i4;
                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                long j8 = j6 / j7;
                                int i5 = (int) (j6 % j7);
                                sbiVar = sbiVar;
                                if (es2Var2.e != j8) {
                                    es2 es2VarR2 = p41Var.r(j8, es2Var2);
                                    if (es2VarR2 != null) {
                                        es2Var2 = es2VarR2;
                                    } else if (zB2) {
                                        e(p41Var, obj, ek2VarR);
                                        sbiVar2 = sbiVar;
                                    }
                                }
                                int iG3 = g(p41Var, es2Var2, i5, obj, j6, ek2VarR, zB2);
                                if (iG3 == 0) {
                                    sbiVar2 = sbiVar;
                                    es2Var2.a();
                                } else if (iG3 != 1) {
                                    if (iG3 == 2) {
                                        if (zB2) {
                                            es2Var2.n();
                                        } else {
                                            ek2VarR.a(es2Var2, i5 + i4);
                                        }
                                        sbiVar2 = sbiVar;
                                    } else {
                                        if (iG3 == 3) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        if (iG3 != 4) {
                                            if (iG3 == 5) {
                                                es2Var2.a();
                                            }
                                        } else if (j6 < atomicLongFieldUpdater2.get(p41Var)) {
                                            es2Var2.a();
                                        }
                                    }
                                    e(p41Var, obj, ek2VarR);
                                    sbiVar2 = sbiVar;
                                } else {
                                    sbiVar2 = sbiVar;
                                    ek2VarR.resumeWith(sbiVar2);
                                }
                            }
                        }
                        objS = ek2VarR.s();
                        if (objS != hu4Var) {
                            objS = sbiVar2;
                        }
                        if (objS == hu4Var) {
                            return objS;
                        }
                        return sbiVar2;
                    }
                    sbiVar2 = sbiVar;
                    es2Var.a();
                    ek2VarR.resumeWith(sbiVar2);
                    objS = ek2VarR.s();
                    if (objS != hu4Var) {
                        objS = sbiVar2;
                    }
                    if (objS == hu4Var) {
                        return objS;
                    }
                    return sbiVar2;
                } catch (Throwable th) {
                    ek2VarR.B();
                    throw th;
                }
            }
            if (iG == 4) {
                if (j2 < atomicLongFieldUpdater2.get(p41Var)) {
                    es2Var.a();
                }
                Object objI3 = p41Var.I(lq4Var, obj);
                if (objI3 != hu4Var) {
                    break;
                }
                return objI3;
            }
            if (iG == 5) {
                es2Var.a();
            }
        }
        return sbiVar;
    }

    public static final void e(p41 p41Var, Object obj, ek2 ek2Var) throws IllegalAccessException, InvocationTargetException {
        cf7 cf7Var = p41Var.b;
        if (cf7Var != null) {
            fel.a(cf7Var, obj, ek2Var.e);
        }
        ek2Var.resumeWith(new poe(p41Var.v()));
    }

    public static final int g(p41 p41Var, es2 es2Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        es2Var.s(i2, obj);
        if (z) {
            return p41Var.T(es2Var, i2, obj, j2, obj2, z);
        }
        Object objQ = es2Var.q(i2);
        if (objQ == null) {
            if (p41Var.j(j2)) {
                if (es2Var.p(null, i2, r41.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (es2Var.p(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (objQ instanceof qbj) {
            es2Var.s(i2, null);
            if (p41Var.P(objQ, obj)) {
                es2Var.t(i2, r41.i);
                return 0;
            }
            c5b c5bVar = r41.k;
            if (es2Var.h.getAndSet((i2 * 2) + 1, c5bVar) == c5bVar) {
                return 5;
            }
            es2Var.r(i2, true);
            return 5;
        }
        return p41Var.T(es2Var, i2, obj, j2, obj2, z);
    }

    public static void y(p41 p41Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(p41Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(p41Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(cf7 cf7Var) {
        Unsafe unsafe;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = bl0.a;
            p41 p41Var = this;
            if (unsafe2.compareAndSwapObject(p41Var, o, (Object) null, cf7Var)) {
                return;
            }
            long j2 = o;
            if (unsafe2.getObjectVolatile(p41Var, j2) != null) {
                while (true) {
                    Object objectVolatile = bl0.a.getObjectVolatile(p41Var, j2);
                    c5b c5bVar = r41.q;
                    if (objectVolatile != c5bVar) {
                        if (objectVolatile == r41.r) {
                            ore.k("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            qr7.v(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    c5b c5bVar2 = r41.r;
                    do {
                        p41 p41Var2 = p41Var;
                        unsafe = bl0.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(p41Var2, o, c5bVar, c5bVar2);
                        p41Var = p41Var2;
                        if (zCompareAndSwapObject) {
                            cf7Var.invoke(p41Var.s());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(p41Var, j2) == c5bVar);
                }
            } else {
                this = p41Var;
            }
        }
    }

    public final boolean B(long j2, boolean z) throws IllegalAccessException, InvocationTargetException {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                m(j2 & 1152921504606846975L);
                if (!z || !x()) {
                }
            } else {
                if (i2 != 3) {
                    ore.c(zo5.h(i2, "unexpected close status: "));
                    return false;
                }
                es2 es2VarM = m(j2 & 1152921504606846975L);
                UndeliveredElementException undeliveredElementExceptionB = null;
                Object objX0 = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = es2VarM.h;
                    for (int i3 = r41.b - 1; -1 < i3; i3--) {
                        long j3 = (es2VarM.e * ((long) r41.b)) + ((long) i3);
                        while (true) {
                            Object objQ = es2VarM.q(i3);
                            if (objQ == r41.i) {
                                break loop0;
                            }
                            c5b c5bVar = r41.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            cf7 cf7Var = this.b;
                            if (objQ != c5bVar) {
                                if (objQ != r41.e && objQ != null) {
                                    if (!(objQ instanceof qbj) && !(objQ instanceof rbj)) {
                                        c5b c5bVar2 = r41.g;
                                        if (objQ == c5bVar2 || objQ == r41.f) {
                                            break loop0;
                                        }
                                        if (objQ != c5bVar2) {
                                            break;
                                        }
                                    } else {
                                        if (j3 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        qbj qbjVar = objQ instanceof rbj ? ((rbj) objQ).a : (qbj) objQ;
                                        if (es2VarM.p(objQ, i3, r41.l)) {
                                            if (cf7Var != null) {
                                                undeliveredElementExceptionB = fel.b(cf7Var, atomicReferenceArray.get(i3 * 2), undeliveredElementExceptionB);
                                            }
                                            objX0 = yab.x0(objX0, qbjVar);
                                            es2VarM.s(i3, null);
                                            es2VarM.n();
                                            break;
                                        }
                                    }
                                } else {
                                    if (es2VarM.p(objQ, i3, r41.l)) {
                                        es2VarM.n();
                                        break;
                                    }
                                }
                            } else {
                                if (j3 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (es2VarM.p(objQ, i3, r41.l)) {
                                    if (cf7Var != null) {
                                        undeliveredElementExceptionB = fel.b(cf7Var, atomicReferenceArray.get(i3 * 2), undeliveredElementExceptionB);
                                    }
                                    es2VarM.s(i3, null);
                                    es2VarM.n();
                                    break;
                                }
                            }
                        }
                    }
                    es2VarM = (es2) es2VarM.f();
                } while (es2VarM != null);
                if (objX0 != null) {
                    if (objX0 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objX0;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            N((qbj) arrayList.get(size), false);
                        }
                    } else {
                        N((qbj) objX0, false);
                    }
                }
                if (undeliveredElementExceptionB != null) {
                    throw undeliveredElementExceptionB;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean C() {
        return B(d.get(this), true);
    }

    public final boolean D() throws IllegalAccessException, InvocationTargetException {
        return B(d.get(this), false);
    }

    public boolean E() {
        return false;
    }

    public final boolean F() {
        if (C() || x()) {
            return false;
        }
        return !C();
    }

    public final boolean G() {
        long j2 = f.get(this);
        return j2 == 0 || j2 == BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public final void H(long j2, es2 es2Var) {
        p41 p41Var;
        es2 es2Var2;
        es2 es2Var3;
        while (es2Var.e < j2 && (es2Var3 = (es2) es2Var.d()) != null) {
            es2Var = es2Var3;
        }
        while (true) {
            es2 es2Var4 = es2Var;
            while (es2Var4.g() && (es2Var2 = (es2) es2Var4.d()) != null) {
                es2Var4 = es2Var2;
            }
            while (true) {
                j.getClass();
                Unsafe unsafe = bl0.a;
                long j3 = n;
                gcf gcfVar = (gcf) unsafe.getObjectVolatile(this, j3);
                if (gcfVar.e >= es2Var4.e) {
                    return;
                }
                if (!es2Var4.o()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = bl0.a;
                    p41Var = this;
                    if (unsafe2.compareAndSwapObject(p41Var, n, gcfVar, es2Var4)) {
                        if (gcfVar.k()) {
                            gcfVar.i();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(p41Var, j3) != gcfVar) {
                        break;
                    } else {
                        this = p41Var;
                    }
                }
                if (es2Var4.k()) {
                    es2Var4.i();
                }
                this = p41Var;
            }
            es2Var = es2Var4;
        }
    }

    public final Object I(lq4 lq4Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionB;
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        cf7 cf7Var = this.b;
        if (cf7Var == null || (undeliveredElementExceptionB = fel.b(cf7Var, obj, null)) == null) {
            ek2Var.resumeWith(new poe(v()));
        } else {
            gm0.b(undeliveredElementExceptionB, v());
            ek2Var.resumeWith(new poe(undeliveredElementExceptionB));
        }
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(es2 es2Var, int i2, long j2, nq4 nq4Var) {
        o41 o41Var;
        ds2 ds2Var;
        es2 es2Var2;
        if (nq4Var instanceof o41) {
            o41Var = (o41) nq4Var;
            int i3 = o41Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o41Var.f = i3 - Integer.MIN_VALUE;
            } else {
                o41Var = new o41(this, nq4Var);
            }
        } else {
            o41Var = new o41(this, nq4Var);
        }
        Object objS = o41Var.d;
        int i4 = o41Var.f;
        i41 i41Var = null;
        if (i4 == 0) {
            ch3.d0(objS);
            o41Var.f = 1;
            ek2 ek2VarR = wk8.r(p90.B(o41Var));
            try {
                m9e m9eVar = new m9e(ek2VarR);
                Object objS2 = S(es2Var, i2, j2, m9eVar);
                if (objS2 != r41.m) {
                    Object obj = r41.o;
                    cf7 cf7Var = this.b;
                    if (objS2 == obj) {
                        if (j2 < w()) {
                            es2Var.a();
                        }
                        es2 es2Var3 = (es2) i.get(this);
                        while (true) {
                            if (C()) {
                                ek2VarR.resumeWith(new ds2(new bs2(s())));
                                break;
                            }
                            long andIncrement = e.getAndIncrement(this);
                            long j3 = r41.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (es2Var3.e != j4) {
                                es2 es2VarQ = q(j4, es2Var3);
                                if (es2VarQ != null) {
                                    es2Var2 = es2VarQ;
                                }
                            } else {
                                es2Var2 = es2Var3;
                            }
                            Object objS3 = S(es2Var2, i5, andIncrement, m9eVar);
                            es2 es2Var4 = es2Var2;
                            if (objS3 == r41.m) {
                                m9eVar.a(es2Var4, i5);
                                break;
                            }
                            if (objS3 == r41.o) {
                                if (andIncrement < w()) {
                                    es2Var4.a();
                                }
                                es2Var3 = es2Var4;
                            } else {
                                if (objS3 == r41.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                es2Var4.a();
                                ds2Var = new ds2(objS3);
                                if (cf7Var != null) {
                                    i41Var = new i41(this, 1);
                                }
                            }
                        }
                    } else {
                        es2Var.a();
                        ds2Var = new ds2(objS2);
                        if (cf7Var != null) {
                            i41Var = new i41(this, 1);
                        }
                    }
                    ek2VarR.j(ds2Var, i41Var);
                    break;
                }
                m9eVar.a(es2Var, i2);
                objS = ek2VarR.s();
                hu4 hu4Var = hu4.a;
                if (objS == hu4Var) {
                    return hu4Var;
                }
            } catch (Throwable th) {
                ek2VarR.B();
                throw th;
            }
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objS);
        }
        return ((ds2) objS).a;
    }

    public final void M(tdf tdfVar) {
        es2 es2Var;
        Object obj;
        i.getClass();
        es2 es2Var2 = (es2) bl0.a.getObjectVolatile(this, p);
        while (!this.C()) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = r41.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (es2Var2.e != j3) {
                es2 es2VarQ = this.q(j3, es2Var2);
                if (es2VarQ == null) {
                    continue;
                } else {
                    es2Var = es2VarQ;
                }
            } else {
                es2Var = es2Var2;
            }
            Object objS = this.S(es2Var, i2, andIncrement, tdfVar);
            es2Var2 = es2Var;
            if (objS == r41.m) {
                qbj qbjVar = tdfVar instanceof qbj ? (qbj) obj : null;
                if (qbjVar == null) {
                    obj = tdfVar;
                    return;
                } else {
                    obj = tdfVar;
                    qbjVar.a(es2Var2, i2);
                    return;
                }
            }
            if (objS != r41.o) {
                if (objS == r41.n) {
                    ore.k("unexpected");
                    return;
                } else {
                    es2Var2.a();
                    ((sdf) tdfVar).e = objS;
                    return;
                }
            }
            if (andIncrement < this.w()) {
                es2Var2.a();
            }
            this = this;
            tdfVar = tdfVar;
        }
        ((sdf) tdfVar).e = r41.l;
    }

    public final void N(qbj qbjVar, boolean z) {
        if (qbjVar instanceof ck2) {
            ((lq4) qbjVar).resumeWith(new poe(z ? u() : v()));
            return;
        }
        if (qbjVar instanceof m9e) {
            ((m9e) qbjVar).a.resumeWith(new ds2(new bs2(s())));
            return;
        }
        if (!(qbjVar instanceof h41)) {
            if (qbjVar instanceof tdf) {
                ((sdf) ((tdf) qbjVar)).l(this, r41.l);
                return;
            } else {
                qr7.v(qbjVar, "Unexpected waiter: ");
                return;
            }
        }
        h41 h41Var = (h41) qbjVar;
        ek2 ek2Var = h41Var.b;
        h41Var.b = null;
        h41Var.a = r41.l;
        Throwable thS = h41Var.c.s();
        if (thS == null) {
            ek2Var.resumeWith(Boolean.FALSE);
        } else {
            ek2Var.resumeWith(new poe(thS));
        }
    }

    public final boolean P(Object obj, Object obj2) {
        if (obj instanceof tdf) {
            return ((sdf) ((tdf) obj)).l(this, obj2);
        }
        boolean z = obj instanceof m9e;
        cf7 cf7Var = this.b;
        if (z) {
            return r41.a(((m9e) obj).a, new ds2(obj2), cf7Var != null ? new i41(this, 1) : null);
        }
        if (!(obj instanceof h41)) {
            if (obj instanceof ck2) {
                return r41.a((ck2) obj, obj2, cf7Var != null ? new i41(this, 0) : null);
            }
            qr7.v(obj, "Unexpected receiver type: ");
            return false;
        }
        h41 h41Var = (h41) obj;
        ek2 ek2Var = h41Var.b;
        h41Var.b = null;
        h41Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        cf7 cf7Var2 = h41Var.c.b;
        return r41.a(ek2Var, bool, cf7Var2 != null ? new f41(obj2, cf7Var2) : null);
    }

    public final boolean Q(Object obj, es2 es2Var, int i2) {
        char c;
        boolean z = obj instanceof ck2;
        sbi sbiVar = sbi.a;
        if (z) {
            return r41.a((ck2) obj, sbiVar, null);
        }
        if (!(obj instanceof tdf)) {
            qr7.v(obj, "Unexpected waiter: ");
            return false;
        }
        int iM = ((sdf) obj).m(this, sbiVar);
        if (iM == 0) {
            c = 1;
        } else if (iM != 1) {
            c = 3;
            if (iM != 2) {
                if (iM != 3) {
                    ore.k(nbh.q(iM, "Unexpected internal result: "));
                    return false;
                }
                c = 4;
            }
        } else {
            c = 2;
        }
        if (c == 2) {
            es2Var.s(i2, null);
        }
        return c == 1;
    }

    public final Object R(Object obj) throws IllegalAccessException, InvocationTargetException {
        es2 es2VarR;
        Object obj2 = r41.d;
        h.getClass();
        es2 es2Var = (es2) bl0.a.getObjectVolatile(this, q);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zB = this.B(andIncrement, false);
            int i2 = r41.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (es2Var.e != j4) {
                es2VarR = this.r(j4, es2Var);
                if (es2VarR == null) {
                    if (zB) {
                        return new bs2(this.v());
                    }
                }
            } else {
                es2VarR = es2Var;
            }
            Object obj3 = obj;
            int iG = g(this, es2VarR, i3, obj3, j2, obj2, zB);
            p41 p41Var = this;
            es2Var = es2VarR;
            sbi sbiVar = sbi.a;
            if (iG == 0) {
                es2Var.a();
                return sbiVar;
            }
            if (iG != 1) {
                if (iG != 2) {
                    if (iG == 3) {
                        ore.k("unexpected");
                        return null;
                    }
                    if (iG == 4) {
                        if (j2 < e.get(p41Var)) {
                            es2Var.a();
                        }
                        return new bs2(p41Var.v());
                    }
                    if (iG == 5) {
                        es2Var.a();
                    }
                    this = p41Var;
                    obj = obj3;
                } else {
                    if (zB) {
                        es2Var.n();
                        return new bs2(p41Var.v());
                    }
                    qbj qbjVar = obj2 instanceof qbj ? (qbj) obj2 : null;
                    if (qbjVar != null) {
                        qbjVar.a(es2Var, i3 + i2);
                    }
                    p41Var.n((es2Var.e * j3) + ((long) i3));
                }
            }
            return sbiVar;
        }
    }

    public final Object S(es2 es2Var, int i2, long j2, Object obj) {
        Object objQ = es2Var.q(i2);
        AtomicReferenceArray atomicReferenceArray = es2Var.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objQ == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return r41.n;
                }
                if (es2Var.p(objQ, i2, obj)) {
                    o();
                    return r41.m;
                }
            }
        } else if (objQ == r41.d && es2Var.p(objQ, i2, r41.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            es2Var.s(i2, null);
            return obj2;
        }
        while (true) {
            Object objQ2 = es2Var.q(i2);
            if (objQ2 == null || objQ2 == r41.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (es2Var.p(objQ2, i2, r41.h)) {
                        o();
                        return r41.o;
                    }
                } else {
                    if (obj == null) {
                        return r41.n;
                    }
                    if (es2Var.p(objQ2, i2, obj)) {
                        o();
                        return r41.m;
                    }
                }
            } else {
                if (objQ2 != r41.d) {
                    c5b c5bVar = r41.j;
                    if (objQ2 != c5bVar && objQ2 != r41.h) {
                        if (objQ2 == r41.l) {
                            o();
                            return r41.o;
                        }
                        if (objQ2 != r41.g && es2Var.p(objQ2, i2, r41.f)) {
                            boolean z = objQ2 instanceof rbj;
                            if (z) {
                                objQ2 = ((rbj) objQ2).a;
                            }
                            if (Q(objQ2, es2Var, i2)) {
                                es2Var.t(i2, r41.i);
                                o();
                                Object obj3 = atomicReferenceArray.get(i2 * 2);
                                es2Var.s(i2, null);
                                return obj3;
                            }
                            es2Var.t(i2, c5bVar);
                            es2Var.n();
                            if (z) {
                                o();
                            }
                            return r41.o;
                        }
                    }
                    return r41.o;
                }
                if (es2Var.p(objQ2, i2, r41.i)) {
                    o();
                    Object obj4 = atomicReferenceArray.get(i2 * 2);
                    es2Var.s(i2, null);
                    return obj4;
                }
            }
        }
    }

    public final int T(es2 es2Var, int i2, Object obj, long j2, Object obj2, boolean z) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            Object objQ = es2Var.q(i2);
            if (objQ == null) {
                if (!j(j2) || z) {
                    if (z) {
                        if (es2Var.p(null, i2, r41.j)) {
                            es2Var.n();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (es2Var.p(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (es2Var.p(null, i2, r41.d)) {
                    break;
                }
            } else {
                if (objQ != r41.e) {
                    c5b c5bVar = r41.k;
                    if (objQ == c5bVar) {
                        es2Var.s(i2, null);
                        return 5;
                    }
                    if (objQ == r41.h) {
                        es2Var.s(i2, null);
                        return 5;
                    }
                    if (objQ == r41.l) {
                        es2Var.s(i2, null);
                        D();
                        return 4;
                    }
                    es2Var.s(i2, null);
                    if (objQ instanceof rbj) {
                        objQ = ((rbj) objQ).a;
                    }
                    if (P(objQ, obj)) {
                        es2Var.t(i2, r41.i);
                        return 0;
                    }
                    if (es2Var.h.getAndSet((i2 * 2) + 1, c5bVar) != c5bVar) {
                        es2Var.r(i2, true);
                    }
                    return 5;
                }
                if (es2Var.p(objQ, i2, r41.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void U(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        p41 p41Var = this;
        if (p41Var.G()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f;
            if (atomicLongFieldUpdater.get(p41Var) > j2) {
                break;
            } else {
                p41Var = this;
            }
        }
        int i2 = r41.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(p41Var);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(p41Var)) && j3 == atomicLongFieldUpdater.get(p41Var)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(p41Var);
                    if (atomicLongFieldUpdater2.compareAndSet(p41Var, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        p41Var = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(p41Var);
                    long j6 = atomicLongFieldUpdater2.get(p41Var);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(p41Var)) {
                        break;
                    }
                    if (z) {
                        p41Var = this;
                    } else {
                        p41Var = this;
                        atomicLongFieldUpdater2.compareAndSet(p41Var, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(p41Var);
                    if (atomicLongFieldUpdater2.compareAndSet(p41Var, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        p41Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.kgf
    public Object a(lq4 lq4Var, Object obj) {
        return O(this, obj, lq4Var);
    }

    @Override // defpackage.hr2
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(true, cancellationException);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0072, please report this as an issue */
    @Override // defpackage.kgf
    public Object c(Object obj) throws IllegalAccessException, InvocationTargetException {
        int iG;
        sbi sbiVar;
        qbj qbjVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j3 = 1152921504606846975L;
        boolean z2 = B(j2, false) ? false : !j(j2 & 1152921504606846975L);
        cs2 cs2Var = ds2.b;
        if (z2) {
            return cs2Var;
        }
        Object obj2 = r41.j;
        h.getClass();
        es2 es2Var = (es2) bl0.a.getObjectVolatile(this, q);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean zB = B(andIncrement, z);
            int i2 = r41.b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (es2Var.e == j6) {
                iG = g(this, es2Var, i3, obj, j4, obj2, zB);
                sbiVar = sbi.a;
                if (iG != 0) {
                    es2Var.a();
                    return sbiVar;
                }
                if (iG != 1) {
                    return sbiVar;
                }
                if (iG != 2) {
                    if (zB) {
                        es2Var.n();
                        return new bs2(v());
                    }
                    qbjVar = obj2 instanceof qbj ? (qbj) obj2 : null;
                    if (qbjVar != null) {
                        qbjVar.a(es2Var, i3 + i2);
                    }
                    es2Var.n();
                    return cs2Var;
                }
                if (iG != 3) {
                    ore.k("unexpected");
                    return null;
                }
                if (iG != 4) {
                    if (j4 < e.get(this)) {
                        es2Var.a();
                    }
                    return new bs2(v());
                }
                if (iG == 5) {
                    es2Var.a();
                }
                z = false;
            } else {
                es2 es2VarR = r(j6, es2Var);
                if (es2VarR != null) {
                    es2Var = es2VarR;
                    iG = g(this, es2Var, i3, obj, j4, obj2, zB);
                    sbiVar = sbi.a;
                    if (iG != 0) {
                        es2Var.a();
                        return sbiVar;
                    }
                    if (iG != 1) {
                        return sbiVar;
                    }
                    if (iG != 2) {
                        if (zB) {
                            es2Var.n();
                            return new bs2(v());
                        }
                        if (obj2 instanceof qbj) {
                        }
                        if (qbjVar != null) {
                            qbjVar.a(es2Var, i3 + i2);
                        }
                        es2Var.n();
                        return cs2Var;
                    }
                    if (iG != 3) {
                        ore.k("unexpected");
                        return null;
                    }
                    if (iG != 4) {
                        if (j4 < e.get(this)) {
                            es2Var.a();
                        }
                        return new bs2(v());
                    }
                    if (iG == 5) {
                        es2Var.a();
                    }
                    z = false;
                } else {
                    if (zB) {
                        return new bs2(v());
                    }
                    z = false;
                }
            }
            j3 = 1152921504606846975L;
        }
    }

    @Override // defpackage.hr2
    public final Object d(mdh mdhVar) {
        return K(this, mdhVar);
    }

    @Override // defpackage.hr2
    public final gvb f() {
        l41 l41Var = l41.a;
        e9i.l(3, l41Var);
        m41 m41Var = m41.a;
        e9i.l(3, m41Var);
        return new gvb(this, l41Var, m41Var, this.c);
    }

    @Override // defpackage.hr2
    public final Object h() {
        es2 es2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = d.get(this);
        if (B(j3, true)) {
            return new bs2(s());
        }
        long j4 = j3 & 1152921504606846975L;
        cs2 cs2Var = ds2.b;
        if (j2 >= j4) {
            return cs2Var;
        }
        Object obj = r41.k;
        i.getClass();
        es2 es2Var2 = (es2) bl0.a.getObjectVolatile(this, p);
        while (!this.C()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = r41.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (es2Var2.e != j6) {
                es2 es2VarQ = this.q(j6, es2Var2);
                if (es2VarQ == null) {
                    continue;
                } else {
                    es2Var = es2VarQ;
                }
            } else {
                es2Var = es2Var2;
            }
            p41 p41Var = this;
            Object objS = p41Var.S(es2Var, i2, andIncrement, obj);
            es2Var2 = es2Var;
            if (objS == r41.m) {
                qbj qbjVar = obj instanceof qbj ? (qbj) obj : null;
                if (qbjVar != null) {
                    qbjVar.a(es2Var2, i2);
                }
                p41Var.U(andIncrement);
                es2Var2.n();
                return cs2Var;
            }
            if (objS != r41.o) {
                if (objS != r41.n) {
                    es2Var2.a();
                    return objS;
                }
                ore.k("unexpected");
                return null;
            }
            if (andIncrement < p41Var.w()) {
                es2Var2.a();
            }
            this = p41Var;
        }
        return new bs2(this.s());
    }

    @Override // defpackage.kgf
    public final boolean i(Throwable th) throws IllegalAccessException, InvocationTargetException {
        return l(false, th);
    }

    @Override // defpackage.hr2
    public final h41 iterator() {
        return new h41(this);
    }

    public final boolean j(long j2) {
        return j2 < f.get(this) || j2 < e.get(this) + ((long) this.a);
    }

    public final es2 k() {
        j.getClass();
        Unsafe unsafe = bl0.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, n);
        h.getClass();
        es2 es2Var = (es2) unsafe.getObjectVolatile(this, q);
        if (es2Var.e > ((es2) objectVolatile).e) {
            objectVolatile = es2Var;
        }
        i.getClass();
        es2 es2Var2 = (es2) unsafe.getObjectVolatile(this, p);
        if (es2Var2.e > ((es2) objectVolatile).e) {
            objectVolatile = es2Var2;
        }
        p94 p94Var = (p94) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p94.a;
            Object objE = p94Var.e();
            if (objE == sb8.a) {
                break;
            }
            p94 p94Var2 = (p94) objE;
            if (p94Var2 != null) {
                p94Var = p94Var2;
            } else if (p94Var.h()) {
                break;
            }
        }
        return (es2) p94Var;
    }

    public final boolean l(boolean z, Throwable th) throws IllegalAccessException, InvocationTargetException {
        p41 p41Var;
        boolean z2;
        long j2;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (!z) {
            p41Var = this;
            break;
        }
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                p41Var = this;
                break;
            }
            es2 es2Var = r41.a;
            p41Var = this;
            if (atomicLongFieldUpdater.compareAndSet(p41Var, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = p41Var;
        }
        c5b c5bVar = r41.s;
        while (true) {
            k.getClass();
            p41 p41Var2 = p41Var;
            Unsafe unsafe = bl0.a;
            long j6 = m;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(p41Var2, j6, c5bVar, th2);
            p41Var = p41Var2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(p41Var, j6) != c5bVar) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(p41Var);
            } while (!atomicLongFieldUpdater.compareAndSet(p41Var, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(p41Var);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(p41Var, j2, j3));
        }
        p41Var.D();
        if (z2) {
            p41Var.z();
        }
        return z2;
    }

    public final es2 m(long j2) {
        long j3;
        es2 es2VarK = k();
        if (E()) {
            es2 es2Var = es2VarK;
            loop0: while (true) {
                int i2 = r41.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (es2Var.e * ((long) r41.b)) + ((long) i2);
                        if (j3 >= e.get(this)) {
                            while (true) {
                                Object objQ = es2Var.q(i2);
                                if (objQ != null && objQ != r41.e) {
                                    if (objQ != r41.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (es2Var.p(objQ, i2, r41.l)) {
                                    es2Var.n();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        es2Var = (es2) es2Var.f();
                        if (es2Var == null) {
                        }
                    }
                    j3 = -1;
                    break loop0;
                }
            }
            if (j3 != -1) {
                n(j3);
            }
        }
        Object objX0 = null;
        loop3: for (es2 es2Var2 = es2VarK; es2Var2 != null; es2Var2 = (es2) es2Var2.f()) {
            for (int i3 = r41.b - 1; -1 < i3; i3--) {
                if ((es2Var2.e * ((long) r41.b)) + ((long) i3) < j2) {
                    break loop3;
                }
                while (true) {
                    Object objQ2 = es2Var2.q(i3);
                    if (objQ2 != null && objQ2 != r41.e) {
                        if (!(objQ2 instanceof rbj)) {
                            if (!(objQ2 instanceof qbj)) {
                                break;
                            }
                            if (es2Var2.p(objQ2, i3, r41.l)) {
                                objX0 = yab.x0(objX0, objQ2);
                                es2Var2.r(i3, true);
                                break;
                            }
                        } else {
                            if (es2Var2.p(objQ2, i3, r41.l)) {
                                objX0 = yab.x0(objX0, ((rbj) objQ2).a);
                                es2Var2.r(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (es2Var2.p(objQ2, i3, r41.l)) {
                            es2Var2.n();
                            break;
                        }
                    }
                }
            }
        }
        if (objX0 != null) {
            if (!(objX0 instanceof ArrayList)) {
                N((qbj) objX0, true);
                return es2VarK;
            }
            ArrayList arrayList = (ArrayList) objX0;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                N((qbj) arrayList.get(size), true);
            }
        }
        return es2VarK;
    }

    public final void n(long j2) {
        UndeliveredElementException undeliveredElementExceptionB;
        i.getClass();
        es2 es2Var = (es2) bl0.a.getObjectVolatile(this, p);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.a) + j3, f.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = r41.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (es2Var.e != j5) {
                    es2 es2VarQ = this.q(j5, es2Var);
                    if (es2VarQ != null) {
                        es2Var = es2VarQ;
                    }
                }
                es2 es2Var2 = es2Var;
                Object objS = this.S(es2Var2, i2, j3, null);
                if (objS != r41.o) {
                    es2Var2.a();
                    cf7 cf7Var = this.b;
                    if (cf7Var != null && (undeliveredElementExceptionB = fel.b(cf7Var, objS, null)) != null) {
                        throw undeliveredElementExceptionB;
                    }
                } else if (j3 < this.w()) {
                    es2Var2.a();
                }
                es2Var = es2Var2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    public final void o() {
        int i2;
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objQ;
        if (G()) {
            return;
        }
        j.getClass();
        es2 es2Var = (es2) bl0.a.getObjectVolatile(this, n);
        while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j2 = r41.b;
            long j3 = andIncrement / j2;
            if (this.w() <= andIncrement) {
                if (es2Var.e < j3 && es2Var.d() != null) {
                    this.H(j3, es2Var);
                }
                y(this);
                return;
            }
            p41 p41Var = this;
            if (es2Var.e == j3) {
                i2 = (int) (andIncrement % j2);
                Object objQ2 = es2Var.q(i2);
                z = objQ2 instanceof qbj;
                atomicLongFieldUpdater = e;
                if (z || andIncrement < atomicLongFieldUpdater.get(p41Var) || !es2Var.p(objQ2, i2, r41.g)) {
                    while (true) {
                        objQ = es2Var.q(i2);
                        if (objQ instanceof qbj) {
                            if (andIncrement < atomicLongFieldUpdater.get(p41Var)) {
                                if (es2Var.p(objQ, i2, new rbj((qbj) objQ))) {
                                    y(p41Var);
                                    return;
                                }
                            } else if (es2Var.p(objQ, i2, r41.g)) {
                                if (!p41Var.Q(objQ, es2Var, i2)) {
                                    es2Var.t(i2, r41.j);
                                    es2Var.n();
                                    break;
                                } else {
                                    es2Var.t(i2, r41.d);
                                    y(p41Var);
                                    return;
                                }
                            }
                        } else {
                            if (objQ == r41.j) {
                                break;
                            }
                            if (objQ == null) {
                                if (es2Var.p(objQ, i2, r41.e)) {
                                    y(p41Var);
                                    return;
                                }
                            } else if (objQ != r41.d || objQ == r41.h || objQ == r41.i || objQ == r41.k || objQ == r41.l) {
                                y(p41Var);
                                return;
                            } else if (objQ != r41.f) {
                                qr7.v(objQ, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    y(p41Var);
                } else if (p41Var.Q(objQ2, es2Var, i2)) {
                    es2Var.t(i2, r41.d);
                    y(p41Var);
                    return;
                } else {
                    es2Var.t(i2, r41.j);
                    es2Var.n();
                    y(p41Var);
                }
            } else {
                es2 es2VarP = p41Var.p(j3, es2Var, andIncrement);
                if (es2VarP == null) {
                    continue;
                } else {
                    es2Var = es2VarP;
                    i2 = (int) (andIncrement % j2);
                    Object objQ3 = es2Var.q(i2);
                    z = objQ3 instanceof qbj;
                    atomicLongFieldUpdater = e;
                    if (z) {
                        while (true) {
                            objQ = es2Var.q(i2);
                            if (objQ instanceof qbj) {
                                if (andIncrement < atomicLongFieldUpdater.get(p41Var)) {
                                    if (es2Var.p(objQ, i2, new rbj((qbj) objQ))) {
                                        y(p41Var);
                                        return;
                                    }
                                } else if (es2Var.p(objQ, i2, r41.g)) {
                                    if (!p41Var.Q(objQ, es2Var, i2)) {
                                        es2Var.t(i2, r41.j);
                                        es2Var.n();
                                        break;
                                    } else {
                                        es2Var.t(i2, r41.d);
                                        y(p41Var);
                                        return;
                                    }
                                }
                            } else {
                                if (objQ == r41.j) {
                                    break;
                                    break;
                                }
                                if (objQ == null) {
                                    if (objQ != r41.d) {
                                        if (objQ != r41.f) {
                                            qr7.v(objQ, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    y(p41Var);
                                    return;
                                }
                                if (es2Var.p(objQ, i2, r41.e)) {
                                    y(p41Var);
                                    return;
                                }
                            }
                        }
                        y(p41Var);
                    } else {
                        while (true) {
                            objQ = es2Var.q(i2);
                            if (objQ instanceof qbj) {
                                if (andIncrement < atomicLongFieldUpdater.get(p41Var)) {
                                    if (es2Var.p(objQ, i2, new rbj((qbj) objQ))) {
                                        y(p41Var);
                                        return;
                                    }
                                } else if (es2Var.p(objQ, i2, r41.g)) {
                                    if (!p41Var.Q(objQ, es2Var, i2)) {
                                        es2Var.t(i2, r41.j);
                                        es2Var.n();
                                        break;
                                    } else {
                                        es2Var.t(i2, r41.d);
                                        y(p41Var);
                                        return;
                                    }
                                }
                            } else {
                                if (objQ == r41.j) {
                                    break;
                                    break;
                                }
                                if (objQ == null) {
                                    if (objQ != r41.d) {
                                        if (objQ != r41.f) {
                                            qr7.v(objQ, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    y(p41Var);
                                    return;
                                }
                                if (es2Var.p(objQ, i2, r41.e)) {
                                    y(p41Var);
                                    return;
                                }
                            }
                        }
                        y(p41Var);
                    }
                }
            }
            this = p41Var;
        }
    }

    public final es2 p(long j2, es2 es2Var, long j3) {
        Object objZ;
        es2 es2Var2 = r41.a;
        q41 q41Var = q41.a;
        loop0: while (true) {
            objZ = sb8.z(es2Var, j2, q41Var);
            if (!rx8.O(objZ)) {
                gcf gcfVarH = rx8.H(objZ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    atomicReferenceFieldUpdater.getClass();
                    gcf gcfVar = (gcf) bl0.a.getObjectVolatile(this, n);
                    if (gcfVar.e >= gcfVarH.e) {
                        break loop0;
                    }
                    if (!gcfVarH.o()) {
                        break;
                    }
                    if (p.l(atomicReferenceFieldUpdater, this, gcfVar, gcfVarH)) {
                        if (!gcfVar.k()) {
                            break loop0;
                        }
                        gcfVar.i();
                        break loop0;
                    }
                    if (gcfVarH.k()) {
                        gcfVarH.i();
                    }
                }
            } else {
                break;
            }
        }
        if (rx8.O(objZ)) {
            D();
            H(j2, es2Var);
            y(this);
            return null;
        }
        es2 es2Var3 = (es2) rx8.H(objZ);
        long j4 = es2Var3.e;
        if (j4 <= j2) {
            return es2Var3;
        }
        long j5 = r41.b;
        if (!f.compareAndSet(this, j3 + 1, j4 * j5)) {
            y(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(this, (j4 * j5) - j3) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final es2 q(long j2, es2 es2Var) {
        Object objZ;
        es2 es2Var2;
        long j3;
        Unsafe unsafe;
        es2 es2Var3 = r41.a;
        q41 q41Var = q41.a;
        loop0: while (true) {
            objZ = sb8.z(es2Var, j2, q41Var);
            if (!rx8.O(objZ)) {
                gcf gcfVarH = rx8.H(objZ);
                while (true) {
                    i.getClass();
                    Unsafe unsafe2 = bl0.a;
                    long j4 = p;
                    gcf gcfVar = (gcf) unsafe2.getObjectVolatile(this, j4);
                    if (gcfVar.e >= gcfVarH.e) {
                        break loop0;
                    }
                    if (!gcfVarH.o()) {
                        break;
                    }
                    do {
                        unsafe = bl0.a;
                        if (unsafe.compareAndSwapObject(this, p, gcfVar, gcfVarH)) {
                            if (!gcfVar.k()) {
                                break loop0;
                            }
                            gcfVar.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == gcfVar);
                    if (gcfVarH.k()) {
                        gcfVarH.i();
                    }
                }
            } else {
                break;
            }
        }
        if (rx8.O(objZ)) {
            D();
            if (es2Var.e * ((long) r41.b) < w()) {
                es2Var.a();
                return null;
            }
        } else {
            es2 es2Var4 = (es2) rx8.H(objZ);
            long j5 = es2Var4.e;
            if (G() || j2 > f.get(this) / ((long) r41.b)) {
                es2Var2 = es2Var4;
                break;
            }
            loop3: while (true) {
                j.getClass();
                Unsafe unsafe3 = bl0.a;
                long j6 = n;
                gcf gcfVar2 = (gcf) unsafe3.getObjectVolatile(this, j6);
                if (gcfVar2.e >= j5 || !es2Var4.o()) {
                    es2Var2 = es2Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = bl0.a;
                    es2Var2 = es2Var4;
                    if (unsafe4.compareAndSwapObject(this, n, gcfVar2, es2Var4)) {
                        if (!gcfVar2.k()) {
                            break loop3;
                        }
                        gcfVar2.i();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j6) != gcfVar2) {
                        break;
                    }
                    es2Var4 = es2Var2;
                }
                if (es2Var2.k()) {
                    es2Var2.i();
                }
                es2Var4 = es2Var2;
            }
            if (j5 <= j2) {
                return es2Var2;
            }
            long j7 = j5 * ((long) r41.b);
            do {
                j3 = e.get(this);
                if (j3 >= j7) {
                    break;
                }
            } while (!e.compareAndSet(this, j3, j7));
            if (j5 * ((long) r41.b) < w()) {
                es2Var2.a();
            }
        }
        return null;
    }

    public final es2 r(long j2, es2 es2Var) throws IllegalAccessException, InvocationTargetException {
        Object objZ;
        long j3;
        long j4;
        Unsafe unsafe;
        es2 es2Var2 = r41.a;
        q41 q41Var = q41.a;
        loop0: while (true) {
            objZ = sb8.z(es2Var, j2, q41Var);
            if (!rx8.O(objZ)) {
                gcf gcfVarH = rx8.H(objZ);
                while (true) {
                    h.getClass();
                    Unsafe unsafe2 = bl0.a;
                    long j5 = q;
                    gcf gcfVar = (gcf) unsafe2.getObjectVolatile(this, j5);
                    if (gcfVar.e >= gcfVarH.e) {
                        break loop0;
                    }
                    if (!gcfVarH.o()) {
                        break;
                    }
                    do {
                        unsafe = bl0.a;
                        if (unsafe.compareAndSwapObject(this, q, gcfVar, gcfVarH)) {
                            if (!gcfVar.k()) {
                                break loop0;
                            }
                            gcfVar.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == gcfVar);
                    if (gcfVarH.k()) {
                        gcfVarH.i();
                    }
                }
            } else {
                break;
            }
        }
        boolean zO = rx8.O(objZ);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (zO) {
            D();
            if (es2Var.e * ((long) r41.b) < atomicLongFieldUpdater.get(this)) {
                es2Var.a();
                return null;
            }
        } else {
            es2 es2Var3 = (es2) rx8.H(objZ);
            long j6 = es2Var3.e;
            if (j6 <= j2) {
                return es2Var3;
            }
            long j7 = j6 * ((long) r41.b);
            do {
                j3 = d.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j7) {
                    break;
                }
            } while (!d.compareAndSet(this, j3, j4 + (((long) ((int) (j3 >> 60))) << 60)));
            if (j6 * ((long) r41.b) < atomicLongFieldUpdater.get(this)) {
                es2Var3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        k.getClass();
        return (Throwable) bl0.a.getObjectVolatile(this, m);
    }

    public final gvb t() {
        j41 j41Var = j41.a;
        e9i.l(3, j41Var);
        k41 k41Var = k41.a;
        e9i.l(3, k41Var);
        return new gvb(this, j41Var, k41Var, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i2;
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (d.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        i.getClass();
        Unsafe unsafe = bl0.a;
        int i4 = 0;
        h.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, q);
        int i5 = 1;
        j.getClass();
        List listP0 = xw3.P0(unsafe.getObjectVolatile(this, p), objectVolatile, unsafe.getObjectVolatile(this, n));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (((es2) obj) != r41.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            qr7.d();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((es2) next).e;
            do {
                Object next2 = it.next();
                long j3 = ((es2) next2).e;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        es2 es2Var = (es2) next;
        long j4 = e.get(this);
        long jW = w();
        loop2: while (true) {
            int i6 = r41.b;
            int i7 = i4;
            while (i7 < i6) {
                i2 = i5;
                long j5 = (es2Var.e * ((long) r41.b)) + ((long) i7);
                if (j5 >= jW && j5 >= j4) {
                    str = null;
                    break loop2;
                }
                Object objQ = es2Var.q(i7);
                Object obj2 = es2Var.h.get(i7 * 2);
                if (objQ instanceof ck2) {
                    string = (j5 >= j4 || j5 < jW) ? (j5 >= jW || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objQ instanceof tdf) {
                    string = (j5 >= j4 || j5 < jW) ? (j5 >= jW || j5 < j4) ? "select" : "onSend" : "onReceive";
                } else if (objQ instanceof m9e) {
                    string = "receiveCatching";
                } else if (objQ instanceof rbj) {
                    string = "EB(" + objQ + ')';
                } else if (cqk.d(objQ, r41.f) || cqk.d(objQ, r41.g)) {
                    string = "resuming_sender";
                } else {
                    if (objQ != null && !objQ.equals(r41.e) && !objQ.equals(r41.i) && !objQ.equals(r41.h) && !objQ.equals(r41.k) && !objQ.equals(r41.j) && !objQ.equals(r41.l)) {
                        string = objQ.toString();
                    }
                    i7++;
                    i5 = i2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i7++;
                i5 = i2;
            }
            i2 = i5;
            str = null;
            es2Var = (es2) es2Var.d();
            if (es2Var == null) {
                break;
            }
            i5 = i2;
            i4 = 0;
        }
        if (sb.length() == 0) {
            ore.f("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(r5h.Q0(sb)) == ',') {
            sb.deleteCharAt(sb.length() - i2);
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new ClosedReceiveChannelException() : thS;
    }

    public final Throwable v() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException() : thS;
    }

    public final long w() {
        return d.get(this) & 1152921504606846975L;
    }

    public final boolean x() {
        while (true) {
            i.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = p;
            es2 es2VarQ = (es2) unsafe.getObjectVolatile(this, j2);
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (w() <= j3) {
                return false;
            }
            long j4 = r41.b;
            long j5 = j3 / j4;
            if (es2VarQ.e == j5 || (es2VarQ = q(j5, es2VarQ)) != null) {
                es2VarQ.a();
                int i2 = (int) (j3 % j4);
                while (true) {
                    Object objQ = es2VarQ.q(i2);
                    if (objQ != null && objQ != r41.e) {
                        if (objQ != r41.d) {
                            if (objQ != r41.j && objQ != r41.l && objQ != r41.i && objQ != r41.h) {
                                if (objQ != r41.g) {
                                    if (objQ == r41.f || j3 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (es2VarQ.p(objQ, i2, r41.h)) {
                        o();
                        break;
                    }
                }
                e.compareAndSet(this, j3, j3 + 1);
            } else if (((es2) unsafe.getObjectVolatile(this, j2)).e < j5) {
                return false;
            }
        }
    }

    public final void z() {
        Object objectVolatile;
        p41 p41Var;
        loop0: while (true) {
            l.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = o;
            objectVolatile = unsafe.getObjectVolatile(this, j2);
            c5b c5bVar = objectVolatile == null ? r41.q : r41.r;
            while (true) {
                Unsafe unsafe2 = bl0.a;
                p41Var = this;
                if (unsafe2.compareAndSwapObject(p41Var, o, objectVolatile, c5bVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(p41Var, j2) != objectVolatile) {
                    break;
                } else {
                    this = p41Var;
                }
            }
            this = p41Var;
        }
        if (objectVolatile == null) {
            return;
        }
        e9i.l(1, objectVolatile);
        ((cf7) objectVolatile).invoke(p41Var.s());
    }
}
