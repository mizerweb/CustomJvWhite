package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class ek2 extends un5 implements ck2, iu4, qbj {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ek2.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(ek2.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final lq4 d;
    public final vt4 e;

    static {
        Unsafe unsafe = bl0.a;
        j = unsafe.objectFieldOffset(ek2.class.getDeclaredField("_state$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(ek2.class, Object.class, "_parentHandle$volatile");
        i = unsafe.objectFieldOffset(ek2.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ek2(int i2, lq4 lq4Var) {
        super(i2);
        this.d = lq4Var;
        this.e = lq4Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b9.a;
    }

    public static Object F(hib hibVar, Object obj, int i2, tf7 tf7Var) {
        if (obj instanceof s64) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (tf7Var != null || (hibVar instanceof rj2)) {
            return new q64(obj, hibVar instanceof rj2 ? (rj2) hibVar : null, tf7Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable thP;
        lq4 lq4Var = this.d;
        sn5 sn5Var = lq4Var instanceof sn5 ? (sn5) lq4Var : null;
        if (sn5Var == null || (thP = sn5Var.p(this)) == null) {
            return;
        }
        o();
        n(thP);
    }

    public final boolean C() {
        g.getClass();
        Unsafe unsafe = bl0.a;
        long j2 = j;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        if ((objectVolatile instanceof q64) && ((q64) objectVolatile).d != null) {
            o();
            return false;
        }
        f.set(this, 536870911);
        unsafe.putObjectVolatile(this, j2, b9.a);
        return true;
    }

    public final void D(Object obj, int i2, tf7 tf7Var) throws IllegalAccessException, DispatchException, InvocationTargetException {
        ek2 ek2Var;
        while (true) {
            g.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof hib)) {
                ek2 ek2Var2 = this;
                if (objectVolatile instanceof ok2) {
                    ok2 ok2Var = (ok2) objectVolatile;
                    if (ok2.c.compareAndSet(ok2Var, 0, 1)) {
                        if (tf7Var != null) {
                            ek2Var2.k(tf7Var, ok2Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                qr7.v(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((hib) objectVolatile, obj, i2, tf7Var);
            while (true) {
                Unsafe unsafe2 = bl0.a;
                ek2Var = this;
                if (unsafe2.compareAndSwapObject(ek2Var, j, objectVolatile, objF)) {
                    if (!ek2Var.y()) {
                        ek2Var.o();
                    }
                    ek2Var.p(i2);
                    return;
                } else if (unsafe2.getObjectVolatile(ek2Var, j2) != objectVolatile) {
                    break;
                } else {
                    this = ek2Var;
                }
            }
            this = ek2Var;
        }
    }

    public final void E(xt4 xt4Var) {
        lq4 lq4Var = this.d;
        sn5 sn5Var = lq4Var instanceof sn5 ? (sn5) lq4Var : null;
        D(sbi.a, (sn5Var != null ? sn5Var.d : null) == xt4Var ? 4 : this.c, null);
    }

    public final c5b G(Object obj, tf7 tf7Var) {
        ek2 ek2Var;
        c5b c5bVar = vd7.c;
        while (true) {
            g.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof hib)) {
                return null;
            }
            Object objF = F((hib) objectVolatile, obj, this.c, tf7Var);
            while (true) {
                Unsafe unsafe2 = bl0.a;
                ek2Var = this;
                if (unsafe2.compareAndSwapObject(ek2Var, j, objectVolatile, objF)) {
                    if (!ek2Var.y()) {
                        ek2Var.o();
                    }
                    return c5bVar;
                }
                if (unsafe2.getObjectVolatile(ek2Var, j2) != objectVolatile) {
                    break;
                }
                this = ek2Var;
            }
            this = ek2Var;
        }
    }

    @Override // defpackage.qbj
    public final void a(gcf gcfVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                ore.k("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        x(gcfVar);
    }

    @Override // defpackage.un5
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        ek2 ek2Var;
        while (true) {
            g.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile instanceof hib) {
                ore.k("Not completed");
                return;
            }
            if (objectVolatile instanceof s64) {
                return;
            }
            if (objectVolatile instanceof q64) {
                q64 q64Var = (q64) objectVolatile;
                if (q64Var.e != null) {
                    ore.k("Must be called at most once");
                    return;
                }
                q64 q64VarA = q64.a(q64Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = bl0.a;
                    ek2 ek2Var2 = this;
                    if (unsafe2.compareAndSwapObject(ek2Var2, j, objectVolatile, q64VarA)) {
                        rj2 rj2Var = q64Var.b;
                        if (rj2Var != null) {
                            ek2Var2.i(rj2Var, cancellationException);
                        }
                        tf7 tf7Var = q64Var.c;
                        if (tf7Var != null) {
                            ek2Var2.k(tf7Var, cancellationException, q64Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(ek2Var2, j2) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        ek2Var = ek2Var2;
                        break;
                    }
                    this = ek2Var2;
                }
            } else {
                ek2 ek2Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                q64 q64Var2 = new q64(objectVolatile, (rj2) null, (tf7) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    q64 q64Var3 = q64Var2;
                    Unsafe unsafe3 = bl0.a;
                    ek2Var = ek2Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(ek2Var, j, objectVolatile, q64Var3);
                    q64Var2 = q64Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ek2Var, j2) != objectVolatile) {
                        break;
                    } else {
                        ek2Var3 = ek2Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = ek2Var;
        }
    }

    @Override // defpackage.un5
    public final lq4 c() {
        return this.d;
    }

    @Override // defpackage.un5
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // defpackage.ck2
    public final c5b e(Object obj, tf7 tf7Var) {
        return G(obj, tf7Var);
    }

    @Override // defpackage.un5
    public final Object f(Object obj) {
        return obj instanceof q64 ? ((q64) obj).a : obj;
    }

    @Override // defpackage.iu4
    public final iu4 getCallerFrame() {
        lq4 lq4Var = this.d;
        if (lq4Var instanceof iu4) {
            return (iu4) lq4Var;
        }
        return null;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return this.e;
    }

    @Override // defpackage.un5
    public final Object h() {
        return t();
    }

    public final void i(rj2 rj2Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            rj2Var.b(th);
        } catch (Throwable th2) {
            e9i.f0(this.e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ck2
    public final boolean isActive() {
        return t() instanceof hib;
    }

    @Override // defpackage.ck2
    public final boolean isCancelled() {
        return t() instanceof ok2;
    }

    @Override // defpackage.ck2
    public final void j(Object obj, tf7 tf7Var) throws IllegalAccessException, DispatchException, InvocationTargetException {
        D(obj, this.c, tf7Var);
    }

    public final void k(tf7 tf7Var, Throwable th, Object obj) throws IllegalAccessException, InvocationTargetException {
        vt4 vt4Var = this.e;
        try {
            tf7Var.i(th, obj, vt4Var);
        } catch (Throwable th2) {
            e9i.f0(vt4Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(gcf gcfVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        vt4 vt4Var = this.e;
        int i2 = f.get(this) & 536870911;
        if (i2 == 536870911) {
            ore.k("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            gcfVar.m(i2, vt4Var);
        } catch (Throwable th2) {
            e9i.f0(vt4Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ck2
    public final void m(Object obj) throws DispatchException {
        p(this.c);
    }

    public final boolean n(Throwable th) {
        Throwable cancellationException;
        ek2 ek2Var;
        while (true) {
            g.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof hib)) {
                return false;
            }
            boolean z = (objectVolatile instanceof rj2) || (objectVolatile instanceof gcf);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            ok2 ok2Var = new ok2(z, cancellationException);
            while (true) {
                Unsafe unsafe2 = bl0.a;
                ek2Var = this;
                if (unsafe2.compareAndSwapObject(ek2Var, j, objectVolatile, ok2Var)) {
                    hib hibVar = (hib) objectVolatile;
                    if (hibVar instanceof rj2) {
                        ek2Var.i((rj2) objectVolatile, th);
                    } else if (hibVar instanceof gcf) {
                        ek2Var.l((gcf) objectVolatile, th);
                    }
                    if (!ek2Var.y()) {
                        ek2Var.o();
                    }
                    ek2Var.p(ek2Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ek2Var, j2) != objectVolatile) {
                    break;
                }
                this = ek2Var;
            }
            this = ek2Var;
        }
    }

    public final void o() {
        no5 no5VarR = r();
        if (no5VarR == null) {
            return;
        }
        no5VarR.dispose();
        h.getClass();
        bl0.a.putObjectVolatile(this, i, dib.a);
    }

    public final void p(int i2) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    ore.k("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                lq4 lq4Var = this.d;
                if (!z && (lq4Var instanceof sn5)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.c;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        sn5 sn5Var = (sn5) lq4Var;
                        xt4 xt4Var = sn5Var.d;
                        vt4 context = sn5Var.e.getContext();
                        if (e9i.A0(xt4Var, context)) {
                            e9i.z0(xt4Var, context, this);
                            return;
                        }
                        nc6 nc6VarA = qqh.a();
                        if (nc6VarA.c >= 4294967296L) {
                            nc6VarA.T0(this);
                            return;
                        }
                        nc6VarA.U0(true);
                        try {
                            cqk.I(this, lq4Var, true);
                            do {
                            } while (nc6VarA.W0());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                nc6VarA.S0(true);
                            }
                        }
                        return;
                    }
                }
                cqk.I(this, lq4Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable q(up8 up8Var) {
        return up8Var.A();
    }

    public final no5 r() {
        h.getClass();
        return (no5) bl0.a.getObjectVolatile(this, i);
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        Throwable thA = roe.a(obj);
        if (thA != null) {
            obj = new s64(false, thA);
        }
        D(obj, this.c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        vo8 vo8Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    ore.k("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object objT = t();
                if (objT instanceof s64) {
                    throw ((s64) objT).a;
                }
                int i4 = this.c;
                if ((i4 != 1 && i4 != 2) || (vo8Var = (vo8) this.e.x0(nhb.h)) == null || vo8Var.isActive()) {
                    return f(objT);
                }
                CancellationException cancellationExceptionA = vo8Var.A();
                b(cancellationExceptionA);
                throw cancellationExceptionA;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (r() == null) {
            v();
        }
        if (zY) {
            B();
        }
        return hu4.a;
    }

    public final Object t() {
        g.getClass();
        return bl0.a.getObjectVolatile(this, j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(f55.B(this.d));
        sb.append("){");
        Object objT = t();
        if (objT instanceof hib) {
            str = "Active";
        } else {
            str = objT instanceof ok2 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(f55.n(this));
        return sb.toString();
    }

    public final void u() {
        no5 no5VarV = v();
        if (no5VarV == null || (t() instanceof hib)) {
            return;
        }
        no5VarV.dispose();
        h.getClass();
        bl0.a.putObjectVolatile(this, i, dib.a);
    }

    public final no5 v() {
        vo8 vo8Var = (vo8) this.e.x0(nhb.h);
        if (vo8Var == null) {
            return null;
        }
        no5 no5VarD = vd7.D(vo8Var, new up3(this));
        while (true) {
            h.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = i;
            ek2 ek2Var = this;
            if (unsafe.compareAndSwapObject(ek2Var, j2, (Object) null, no5VarD) || unsafe.getObjectVolatile(ek2Var, j2) != null) {
                break;
            }
            this = ek2Var;
        }
        return no5VarD;
    }

    public final void w(cf7 cf7Var) {
        x(new qj2(0, cf7Var));
    }

    public final void x(hib hibVar) {
        ek2 ek2Var;
        Unsafe unsafe;
        ek2 ek2Var2;
        while (true) {
            g.getClass();
            Unsafe unsafe2 = bl0.a;
            long j2 = j;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile instanceof b9) {
                while (true) {
                    Unsafe unsafe3 = bl0.a;
                    ek2Var = this;
                    if (unsafe3.compareAndSwapObject(ek2Var, j, objectVolatile, hibVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ek2Var, j2) != objectVolatile) {
                        break;
                    } else {
                        this = ek2Var;
                    }
                }
            } else {
                ek2Var = this;
                if ((objectVolatile instanceof rj2) || (objectVolatile instanceof gcf)) {
                    z(hibVar, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof s64) {
                    s64 s64Var = (s64) objectVolatile;
                    if (!s64.b.compareAndSet(s64Var, 0, 1)) {
                        z(hibVar, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof ok2) {
                        Throwable th = s64Var.a;
                        if (hibVar instanceof rj2) {
                            ek2Var.i((rj2) hibVar, th);
                            return;
                        } else {
                            ek2Var.l((gcf) hibVar, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof q64) {
                    q64 q64Var = (q64) objectVolatile;
                    if (q64Var.b != null) {
                        z(hibVar, objectVolatile);
                        throw null;
                    }
                    if (hibVar instanceof gcf) {
                        return;
                    }
                    rj2 rj2Var = (rj2) hibVar;
                    Throwable th2 = q64Var.e;
                    if (th2 != null) {
                        ek2Var.i(rj2Var, th2);
                        return;
                    }
                    q64 q64VarA = q64.a(q64Var, rj2Var, null, 29);
                    do {
                        unsafe = bl0.a;
                        ek2Var2 = ek2Var;
                        if (unsafe.compareAndSwapObject(ek2Var, j, objectVolatile, q64VarA)) {
                            return;
                        } else {
                            ek2Var = ek2Var2;
                        }
                    } while (unsafe.getObjectVolatile(ek2Var2, j2) == objectVolatile);
                } else {
                    ek2 ek2Var3 = ek2Var;
                    if (hibVar instanceof gcf) {
                        return;
                    }
                    q64 q64Var2 = new q64(objectVolatile, (rj2) hibVar, (tf7) null, (Throwable) null, 28);
                    while (true) {
                        q64 q64Var3 = q64Var2;
                        Unsafe unsafe4 = bl0.a;
                        ek2Var = ek2Var3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(ek2Var, j, objectVolatile, q64Var3);
                        q64Var2 = q64Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(ek2Var, j2) != objectVolatile) {
                            break;
                        } else {
                            ek2Var3 = ek2Var;
                        }
                    }
                }
            }
            this = ek2Var;
        }
    }

    public final boolean y() {
        return this.c == 2 && ((sn5) this.d).n();
    }
}
