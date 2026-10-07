package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class up8 implements vo8 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(up8.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = bl0.a;
        d = unsafe.objectFieldOffset(up8.class.getDeclaredField("_state$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(up8.class, Object.class, "_parentHandle$volatile");
        c = unsafe.objectFieldOffset(up8.class.getDeclaredField("_parentHandle$volatile"));
    }

    public up8(boolean z) {
        this._state$volatile = z ? rx8.k : rx8.j;
    }

    public static wp3 T(ld9 ld9Var) {
        while (ld9Var.l()) {
            ld9Var = ld9Var.k();
        }
        while (true) {
            ld9Var = ld9Var.j();
            if (!ld9Var.l()) {
                if (ld9Var instanceof wp3) {
                    return (wp3) ld9Var;
                }
                if (ld9Var instanceof rhb) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof np8)) {
            if (obj instanceof qc8) {
                return ((qc8) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof s64 ? "Cancelled" : "Completed";
        }
        np8 np8Var = (np8) obj;
        if (np8Var.e()) {
            return "Cancelling";
        }
        return np8.b.get(np8Var) == 1 ? "Completing" : "Active";
    }

    @Override // defpackage.vo8
    public final CancellationException A() {
        CancellationException cancellationException;
        Object objJ = J();
        if (objJ instanceof np8) {
            Throwable thD = ((np8) objJ).d();
            if (thD == null) {
                qr7.v(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thD, this) : cancellationException;
        }
        if (objJ instanceof qc8) {
            qr7.v(this, "Job is still new or active: ");
            return null;
        }
        if (!(objJ instanceof s64)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((s64) objJ).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(t(), th, this) : cancellationException;
    }

    public final Throwable B(np8 np8Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (np8Var.e()) {
                return new JobCancellationException(t(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean C() {
        return true;
    }

    public final gvb D() {
        rp8 rp8Var = rp8.a;
        e9i.l(3, rp8Var);
        sp8 sp8Var = sp8.a;
        e9i.l(3, sp8Var);
        return new gvb(this, rp8Var, sp8Var, (Object) null);
    }

    @Override // defpackage.vt4
    public final Object E(Object obj, qf7 qf7Var) {
        return qf7Var.invoke(obj, this);
    }

    public boolean F() {
        return this instanceof i64;
    }

    public final rhb G(qc8 qc8Var) {
        rhb rhbVarB = qc8Var.b();
        if (rhbVarB != null) {
            return rhbVarB;
        }
        if (qc8Var instanceof g66) {
            return new rhb();
        }
        if (qc8Var instanceof gp8) {
            a0((gp8) qc8Var);
            return null;
        }
        qr7.v(qc8Var, "State should have list: ");
        return null;
    }

    public final vp3 H() {
        b.getClass();
        return (vp3) bl0.a.getObjectVolatile(this, c);
    }

    @Override // defpackage.vt4
    public final vt4 I(ut4 ut4Var) {
        return tre.r0(this, ut4Var);
    }

    public final Object J() {
        a.getClass();
        return bl0.a.getObjectVolatile(this, d);
    }

    @Override // defpackage.vo8
    public final no5 K(boolean z, boolean z2, fz7 fz7Var) {
        return O(z2, z ? new tm8(fz7Var) : new um8(fz7Var));
    }

    public boolean L(Throwable th) {
        return false;
    }

    public void M(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void N(vo8 vo8Var) {
        dib dibVar = dib.a;
        if (vo8Var == null) {
            c0(dibVar);
            return;
        }
        vo8Var.start();
        vp3 vp3VarO0 = vo8Var.o0(this);
        c0(vp3VarO0);
        if (W()) {
            vp3VarO0.dispose();
            c0(dibVar);
        }
    }

    public final no5 O(boolean z, gp8 gp8Var) {
        up8 up8Var;
        gp8 gp8Var2;
        boolean zC;
        gp8Var.g = this;
        loop0: while (true) {
            Object objJ = this.J();
            if (!(objJ instanceof g66)) {
                up8Var = this;
                gp8Var2 = gp8Var;
                boolean z2 = objJ instanceof qc8;
                dib dibVar = dib.a;
                if (z2) {
                    qc8 qc8Var = (qc8) objJ;
                    rhb rhbVarB = qc8Var.b();
                    if (rhbVarB == null) {
                        up8Var.a0((gp8) objJ);
                    } else {
                        if (gp8Var2.o()) {
                            np8 np8Var = qc8Var instanceof np8 ? (np8) qc8Var : null;
                            Throwable thD = np8Var != null ? np8Var.d() : null;
                            if (thD == null) {
                                zC = rhbVarB.c(gp8Var2, 5);
                            } else if (z) {
                                gp8Var2.p(thD);
                                return dibVar;
                            }
                        } else {
                            zC = rhbVarB.c(gp8Var2, 1);
                        }
                        if (zC) {
                            break;
                        }
                    }
                    this = up8Var;
                    gp8Var = gp8Var2;
                } else if (z) {
                    Object objJ2 = up8Var.J();
                    s64 s64Var = objJ2 instanceof s64 ? (s64) objJ2 : null;
                    gp8Var2.p(s64Var != null ? s64Var.a : null);
                }
                return dibVar;
            }
            g66 g66Var = (g66) objJ;
            if (g66Var.a) {
                while (true) {
                    a.getClass();
                    Unsafe unsafe = bl0.a;
                    long j = d;
                    up8Var = this;
                    gp8Var2 = gp8Var;
                    if (unsafe.compareAndSwapObject(up8Var, j, objJ, gp8Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(up8Var, j) != objJ) {
                        break;
                    }
                    this = up8Var;
                    gp8Var = gp8Var2;
                }
            } else {
                up8Var = this;
                gp8Var2 = gp8Var;
                up8Var.Z(g66Var);
            }
            this = up8Var;
            gp8Var = gp8Var2;
        }
        return gp8Var2;
    }

    public boolean P() {
        return this instanceof jz0;
    }

    public final boolean Q(Object obj) {
        Object objH0;
        do {
            objH0 = h0(J(), obj);
            if (objH0 == rx8.e) {
                return false;
            }
            if (objH0 == rx8.f) {
                return true;
            }
        } while (objH0 == rx8.g);
        n(objH0);
        return true;
    }

    public final Object R(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objH0;
        do {
            objH0 = h0(J(), obj);
            if (objH0 == rx8.e) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                s64 s64Var = obj instanceof s64 ? (s64) obj : null;
                throw new IllegalStateException(str, s64Var != null ? s64Var.a : null);
            }
        } while (objH0 == rx8.g);
        return objH0;
    }

    public String S() {
        return getClass().getSimpleName();
    }

    public final void U(rhb rhbVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        rhbVar.c(new e79(4), 4);
        CompletionHandlerException completionHandlerException = null;
        for (ld9 ld9VarJ = (ld9) rhbVar.i(); !cqk.d(ld9VarJ, rhbVar); ld9VarJ = ld9VarJ.j()) {
            if ((ld9VarJ instanceof gp8) && ((gp8) ld9VarJ).o()) {
                try {
                    ((gp8) ld9VarJ).p(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        gm0.b(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + ld9VarJ + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            M(completionHandlerException);
        }
        s(th);
    }

    public void V(Object obj) {
    }

    @Override // defpackage.vo8
    public final boolean W() {
        return !(J() instanceof qc8);
    }

    public void X() {
    }

    @Override // defpackage.vo8
    public final no5 Y(cf7 cf7Var) {
        return O(true, new um8(cf7Var));
    }

    public final void Z(g66 g66Var) {
        rhb rhbVar = new rhb();
        Object wb8Var = g66Var.a ? rhbVar : new wb8(rhbVar);
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = d;
            up8 up8Var = this;
            g66 g66Var2 = g66Var;
            if (unsafe.compareAndSwapObject(up8Var, j, g66Var2, wb8Var) || unsafe.getObjectVolatile(up8Var, j) != g66Var2) {
                return;
            }
            this = up8Var;
            g66Var = g66Var2;
        }
    }

    public final void a0(gp8 gp8Var) {
        gp8Var.e(new rhb());
        ld9 ld9VarJ = gp8Var.j();
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = d;
            up8 up8Var = this;
            gp8 gp8Var2 = gp8Var;
            if (unsafe.compareAndSwapObject(up8Var, j, gp8Var2, ld9VarJ) || unsafe.getObjectVolatile(up8Var, j) != gp8Var2) {
                return;
            }
            this = up8Var;
            gp8Var = gp8Var2;
        }
    }

    @Override // defpackage.vo8, defpackage.hr2
    public void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t(), null, this);
        }
        r(cancellationException);
    }

    public final void b0(gp8 gp8Var) {
        up8 up8Var;
        while (true) {
            Object objJ = this.J();
            if (!(objJ instanceof gp8)) {
                if (!(objJ instanceof qc8) || ((qc8) objJ).b() == null) {
                    return;
                }
                gp8Var.m();
                return;
            }
            if (objJ != gp8Var) {
                return;
            }
            g66 g66Var = rx8.k;
            while (true) {
                a.getClass();
                Unsafe unsafe = bl0.a;
                long j = d;
                up8Var = this;
                if (unsafe.compareAndSwapObject(up8Var, j, objJ, g66Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(up8Var, j) != objJ) {
                    break;
                } else {
                    this = up8Var;
                }
            }
            this = up8Var;
        }
    }

    public final void c0(vp3 vp3Var) {
        b.getClass();
        bl0.a.putObjectVolatile(this, c, vp3Var);
    }

    public final int d0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof g66;
        long j = d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((g66) obj).a) {
                return 0;
            }
            g66 g66Var = rx8.k;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = bl0.a;
                if (unsafe2.compareAndSwapObject(this, d, obj, g66Var)) {
                    X();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof wb8)) {
            return 0;
        }
        rhb rhbVar = ((wb8) obj).a;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = bl0.a;
            if (unsafe.compareAndSwapObject(this, d, obj, rhbVar)) {
                X();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final boolean f0(qc8 qc8Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object rc8Var = obj instanceof qc8 ? new rc8((qc8) obj) : obj;
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = d;
            up8 up8Var = this;
            qc8 qc8Var2 = qc8Var;
            if (unsafe.compareAndSwapObject(up8Var, j, qc8Var2, rc8Var)) {
                up8Var.V(obj);
                up8Var.v(qc8Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(up8Var, j) != qc8Var2) {
                return false;
            }
            this = up8Var;
            qc8Var = qc8Var2;
        }
    }

    @Override // defpackage.vo8
    public final Object g(lq4 lq4Var) {
        Object objJ;
        sbi sbiVar;
        do {
            objJ = J();
            boolean z = objJ instanceof qc8;
            sbiVar = sbi.a;
            if (!z) {
                vd7.q(lq4Var.getContext());
                return sbiVar;
            }
        } while (d0(objJ) < 0);
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        ek2Var.x(new qj2(1, vd7.D(this, new yoe(ek2Var))));
        Object objS = ek2Var.s();
        hu4 hu4Var = hu4.a;
        if (objS != hu4Var) {
            objS = sbiVar;
        }
        return objS == hu4Var ? objS : sbiVar;
    }

    public final boolean g0(qc8 qc8Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        rhb rhbVarG = G(qc8Var);
        if (rhbVarG == null) {
            return false;
        }
        np8 np8Var = new np8(rhbVarG, th);
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = d;
            up8 up8Var = this;
            qc8 qc8Var2 = qc8Var;
            if (unsafe.compareAndSwapObject(up8Var, j, qc8Var2, np8Var)) {
                up8Var.U(rhbVarG, th);
                return true;
            }
            if (unsafe.getObjectVolatile(up8Var, j) != qc8Var2) {
                return false;
            }
            this = up8Var;
            qc8Var = qc8Var2;
        }
    }

    @Override // defpackage.tt4
    public final ut4 getKey() {
        return nhb.h;
    }

    public final Object h0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof qc8)) {
            return rx8.e;
        }
        if (((obj instanceof g66) || (obj instanceof gp8)) && !(obj instanceof wp3) && !(obj2 instanceof s64)) {
            return f0((qc8) obj, obj2) ? obj2 : rx8.g;
        }
        qc8 qc8Var = (qc8) obj;
        rhb rhbVarG = G(qc8Var);
        if (rhbVarG == null) {
            return rx8.g;
        }
        np8 np8Var = qc8Var instanceof np8 ? (np8) qc8Var : null;
        if (np8Var == null) {
            np8Var = new np8(rhbVarG, null);
        }
        synchronized (np8Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = np8.b;
            if (atomicIntegerFieldUpdater.get(np8Var) == 1) {
                return rx8.e;
            }
            atomicIntegerFieldUpdater.set(np8Var, 1);
            if (np8Var != qc8Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, qc8Var, np8Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != qc8Var) {
                        return rx8.g;
                    }
                }
            }
            boolean zE = np8Var.e();
            s64 s64Var = obj2 instanceof s64 ? (s64) obj2 : null;
            if (s64Var != null) {
                np8Var.a(s64Var.a);
            }
            Throwable thD = zE ? null : np8Var.d();
            if (thD != null) {
                U(rhbVarG, thD);
            }
            wp3 wp3VarT = T(rhbVarG);
            if (wp3VarT != null && i0(np8Var, wp3VarT, obj2)) {
                return rx8.f;
            }
            rhbVarG.c(new e79(2), 2);
            wp3 wp3VarT2 = T(rhbVarG);
            return (wp3VarT2 == null || !i0(np8Var, wp3VarT2, obj2)) ? x(np8Var, obj2) : rx8.f;
        }
    }

    public final boolean i0(np8 np8Var, wp3 wp3Var, Object obj) {
        while (wp3Var.h.O(false, new mp8(this, np8Var, wp3Var, obj)) == dib.a) {
            wp3Var = T(wp3Var);
            if (wp3Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vo8
    public boolean isActive() {
        Object objJ = J();
        return (objJ instanceof qc8) && ((qc8) objJ).isActive();
    }

    @Override // defpackage.vo8
    public final boolean isCancelled() {
        Object objJ = J();
        if (objJ instanceof s64) {
            return true;
        }
        return (objJ instanceof np8) && ((np8) objJ).e();
    }

    public gvb k0() {
        return D();
    }

    public Object l() {
        return z();
    }

    public void n(Object obj) {
    }

    public void o(Object obj) {
        n(obj);
    }

    @Override // defpackage.vo8
    public final vp3 o0(up8 up8Var) {
        up8 up8Var2;
        wp3 wp3Var = new wp3(up8Var);
        wp3Var.g = this;
        loop0: while (true) {
            Object objJ = this.J();
            if (objJ instanceof g66) {
                g66 g66Var = (g66) objJ;
                if (g66Var.a) {
                    while (true) {
                        a.getClass();
                        Unsafe unsafe = bl0.a;
                        long j = d;
                        up8Var2 = this;
                        if (unsafe.compareAndSwapObject(up8Var2, j, objJ, wp3Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(up8Var2, j) != objJ) {
                            break;
                        }
                        this = up8Var2;
                    }
                } else {
                    up8Var2 = this;
                    up8Var2.Z(g66Var);
                }
                this = up8Var2;
            } else {
                up8Var2 = this;
                boolean z = objJ instanceof qc8;
                dib dibVar = dib.a;
                Throwable thD = null;
                if (!z) {
                    Object objJ2 = up8Var2.J();
                    s64 s64Var = objJ2 instanceof s64 ? (s64) objJ2 : null;
                    wp3Var.p(s64Var != null ? s64Var.a : null);
                    return dibVar;
                }
                rhb rhbVarB = ((qc8) objJ).b();
                if (rhbVarB != null) {
                    if (rhbVarB.c(wp3Var, 7)) {
                        break;
                    }
                    boolean zC = rhbVarB.c(wp3Var, 3);
                    Object objJ3 = up8Var2.J();
                    if (objJ3 instanceof np8) {
                        thD = ((np8) objJ3).d();
                    } else {
                        s64 s64Var2 = objJ3 instanceof s64 ? (s64) objJ3 : null;
                        if (s64Var2 != null) {
                            thD = s64Var2.a;
                        }
                    }
                    wp3Var.p(thD);
                    if (zC) {
                        break;
                    }
                    return dibVar;
                }
                up8Var2.a0((gp8) objJ);
                this = up8Var2;
            }
        }
        return wp3Var;
    }

    public final Object p(lq4 lq4Var) throws Throwable {
        Object objJ;
        do {
            objJ = J();
            if (!(objJ instanceof qc8)) {
                if (objJ instanceof s64) {
                    throw ((s64) objJ).a;
                }
                return rx8.m0(objJ);
            }
        } while (d0(objJ) < 0);
        lp8 lp8Var = new lp8(p90.B(lq4Var), this);
        lp8Var.u();
        lp8Var.x(new qj2(1, vd7.D(this, new xoe(lp8Var))));
        return lp8Var.s();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean q(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thW;
        Object objJ;
        Throwable thD;
        c5b c5bVar;
        qc8 qc8Var;
        Object objH0;
        Object objH1 = rx8.e;
        if (F()) {
            do {
                Object objJ2 = J();
                if (objJ2 instanceof qc8) {
                    if (objJ2 instanceof np8) {
                        if (np8.b.get((np8) objJ2) == 1) {
                        }
                    }
                    objH1 = h0(objJ2, new s64(false, w(obj)));
                }
                objH1 = rx8.e;
                break;
            } while (objH1 == rx8.g);
            if (objH1 != rx8.f) {
                if (objH1 == rx8.e) {
                    thW = null;
                    while (true) {
                        objJ = J();
                        if (objJ instanceof np8) {
                            synchronized (objJ) {
                                if (((np8) objJ).c() == rx8.i) {
                                    c5bVar = rx8.h;
                                } else {
                                    boolean zE = ((np8) objJ).e();
                                    if (obj == null || !zE) {
                                        if (thW == null) {
                                            thW = w(obj);
                                        }
                                        ((np8) objJ).a(thW);
                                    }
                                    thD = zE ? null : ((np8) objJ).d();
                                    if (thD != null) {
                                        U(((np8) objJ).a, thD);
                                    }
                                    c5bVar = rx8.e;
                                }
                            }
                        } else if (objJ instanceof qc8) {
                            if (thW == null) {
                                thW = w(obj);
                            }
                            qc8Var = (qc8) objJ;
                            if (qc8Var.isActive()) {
                                objH0 = h0(objJ, new s64(false, thW));
                                if (objH0 != rx8.e) {
                                    qr7.v(objJ, "Cannot happen in ");
                                    return false;
                                }
                                if (objH0 != rx8.g) {
                                    objH1 = objH0;
                                    break;
                                }
                            } else if (g0(qc8Var, thW)) {
                                c5bVar = rx8.e;
                            }
                        } else {
                            c5bVar = rx8.h;
                        }
                        objH1 = c5bVar;
                        break;
                    }
                }
                if (objH1 != rx8.e && objH1 != rx8.f) {
                    if (objH1 == rx8.h) {
                        return false;
                    }
                    n(objH1);
                    return true;
                }
            }
        } else {
            if (objH1 == rx8.e) {
                thW = null;
                while (true) {
                    objJ = J();
                    if (objJ instanceof np8) {
                        synchronized (objJ) {
                            if (((np8) objJ).c() == rx8.i) {
                                c5bVar = rx8.h;
                            } else {
                                boolean zE2 = ((np8) objJ).e();
                                if (obj == null) {
                                    if (thW == null) {
                                        thW = w(obj);
                                    }
                                    ((np8) objJ).a(thW);
                                } else {
                                    if (thW == null) {
                                        thW = w(obj);
                                    }
                                    ((np8) objJ).a(thW);
                                }
                                if (zE2) {
                                }
                                if (thD != null) {
                                    U(((np8) objJ).a, thD);
                                }
                                c5bVar = rx8.e;
                            }
                        }
                    } else if (objJ instanceof qc8) {
                        if (thW == null) {
                            thW = w(obj);
                        }
                        qc8Var = (qc8) objJ;
                        if (qc8Var.isActive()) {
                            objH0 = h0(objJ, new s64(false, thW));
                            if (objH0 != rx8.e) {
                                qr7.v(objJ, "Cannot happen in ");
                                return false;
                            }
                            if (objH0 != rx8.g) {
                                objH1 = objH0;
                                break;
                            }
                        } else if (g0(qc8Var, thW)) {
                            c5bVar = rx8.e;
                        }
                    } else {
                        c5bVar = rx8.h;
                    }
                    objH1 = c5bVar;
                    break;
                }
            }
            if (objH1 != rx8.e) {
                if (objH1 == rx8.h) {
                    return false;
                }
                n(objH1);
                return true;
            }
        }
        return true;
    }

    public void r(Throwable th) throws IllegalAccessException, InvocationTargetException {
        q(th);
    }

    public final boolean s(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        vp3 vp3VarH = H();
        if (vp3VarH == null || vp3VarH == dib.a) {
            return z;
        }
        return vp3VarH.a(th) || z;
    }

    @Override // defpackage.vo8
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(J());
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(S() + '{' + e0(J()) + '}');
        sb.append('@');
        sb.append(f55.n(this));
        return sb.toString();
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && C();
    }

    @Override // defpackage.vt4
    public final vt4 u0(vt4 vt4Var) {
        return lvb.x0(this, vt4Var);
    }

    public final void v(qc8 qc8Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        vp3 vp3VarH = H();
        if (vp3VarH != null) {
            vp3VarH.dispose();
            c0(dib.a);
        }
        CompletionHandlerException completionHandlerException = null;
        s64 s64Var = obj instanceof s64 ? (s64) obj : null;
        Throwable th = s64Var != null ? s64Var.a : null;
        if (qc8Var instanceof gp8) {
            try {
                ((gp8) qc8Var).p(th);
                return;
            } catch (Throwable th2) {
                M(new CompletionHandlerException("Exception in completion handler " + qc8Var + " for " + this, th2));
                return;
            }
        }
        rhb rhbVarB = qc8Var.b();
        if (rhbVarB != null) {
            rhbVarB.c(new e79(1), 1);
            for (ld9 ld9VarJ = (ld9) rhbVarB.i(); !cqk.d(ld9VarJ, rhbVarB); ld9VarJ = ld9VarJ.j()) {
                if (ld9VarJ instanceof gp8) {
                    try {
                        ((gp8) ld9VarJ).p(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            gm0.b(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + ld9VarJ + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                M(completionHandlerException);
            }
        }
    }

    @Override // defpackage.vo8
    public final ki3 v0() {
        tp8 tp8Var = tp8.a;
        e9i.l(3, tp8Var);
        ki3 ki3Var = new ki3();
        ki3Var.a = this;
        ki3Var.b = tp8Var;
        ki3Var.c = udf.a;
        return ki3Var;
    }

    public final Throwable w(Object obj) {
        Throwable thD;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(t(), null, this) : th;
        }
        up8 up8Var = (up8) obj;
        Object objJ = up8Var.J();
        if (objJ instanceof np8) {
            thD = ((np8) objJ).d();
        } else if (objJ instanceof s64) {
            thD = ((s64) objJ).a;
        } else {
            if (objJ instanceof qc8) {
                qr7.v(objJ, "Cannot be cancelling child in this state: ");
                return null;
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(e0(objJ)), thD, up8Var) : cancellationException;
    }

    public final Object x(np8 np8Var, Object obj) throws Throwable {
        Throwable th;
        up8 up8Var;
        np8 np8Var2;
        s64 s64Var = obj instanceof s64 ? (s64) obj : null;
        Throwable th2 = s64Var != null ? s64Var.a : null;
        synchronized (np8Var) {
            try {
                np8Var.e();
                ArrayList<Throwable> arrayListF = np8Var.f(th2);
                Throwable thB = B(np8Var, arrayListF);
                if (thB != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            for (Throwable th3 : arrayListF) {
                                if (th3 != thB && th3 != thB && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    gm0.b(thB, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thB != null && thB != th2) {
                    obj = new s64(false, thB);
                }
                if (thB != null && (s(thB) || L(thB))) {
                    s64 s64Var2 = (s64) obj;
                    s64Var2.getClass();
                    s64.b.compareAndSet(s64Var2, 0, 1);
                }
                V(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                Object rc8Var = obj instanceof qc8 ? new rc8((qc8) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = bl0.a;
                    long j = d;
                    up8Var = this;
                    np8Var2 = np8Var;
                    if (unsafe.compareAndSwapObject(up8Var, j, np8Var2, rc8Var) || unsafe.getObjectVolatile(up8Var, j) != np8Var2) {
                        break;
                    }
                    this = up8Var;
                    np8Var = np8Var2;
                }
                up8Var.v(np8Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // defpackage.vt4
    public final tt4 x0(ut4 ut4Var) {
        return tre.a0(this, ut4Var);
    }

    @Override // defpackage.vo8
    public final ohf y() {
        return new tw(3, new qp8(null, this));
    }

    public final Object z() throws Throwable {
        Object objJ = J();
        if (objJ instanceof qc8) {
            ore.k("This job has not completed yet");
            return null;
        }
        if (objJ instanceof s64) {
            throw ((s64) objJ).a;
        }
        return rx8.m0(objJ);
    }

    public Object z0(lq4 lq4Var) {
        return p(lq4Var);
    }
}
