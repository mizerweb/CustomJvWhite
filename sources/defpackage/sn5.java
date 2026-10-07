package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class sn5 extends un5 implements iu4, lq4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(sn5.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long i = bl0.a.objectFieldOffset(sn5.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final xt4 d;
    public final nq4 e;
    public Object f;
    public final Object g;

    public sn5(xt4 xt4Var, nq4 nq4Var) {
        super(-1);
        this.d = xt4Var;
        this.e = nq4Var;
        this.f = e9i.a;
        this.g = nq4Var.getContext().E(0, np4.e);
    }

    @Override // defpackage.un5
    public final lq4 c() {
        return this;
    }

    @Override // defpackage.iu4
    public final iu4 getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.un5
    public final Object h() {
        Object obj = this.f;
        this.f = e9i.a;
        return obj;
    }

    public final void i() {
        do {
            h.getClass();
        } while (bl0.a.getObjectVolatile(this, i) == e9i.b);
    }

    public final ek2 k() {
        sn5 sn5Var;
        c5b c5bVar = e9i.b;
        while (true) {
            h.getClass();
            Unsafe unsafe = bl0.a;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, c5bVar);
                return null;
            }
            if (objectVolatile instanceof ek2) {
                while (true) {
                    Unsafe unsafe2 = bl0.a;
                    sn5 sn5Var2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(sn5Var2, i, objectVolatile, c5bVar);
                    sn5Var = sn5Var2;
                    if (zCompareAndSwapObject) {
                        return (ek2) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(sn5Var, j) != objectVolatile) {
                        break;
                    }
                    this = sn5Var;
                }
            } else {
                sn5Var = this;
                if (objectVolatile != c5bVar && !(objectVolatile instanceof Throwable)) {
                    qr7.v(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = sn5Var;
        }
    }

    public final ek2 l() {
        h.getClass();
        Object objectVolatile = bl0.a.getObjectVolatile(this, i);
        if (objectVolatile instanceof ek2) {
            return (ek2) objectVolatile;
        }
        return null;
    }

    public final boolean n() {
        h.getClass();
        return bl0.a.getObjectVolatile(this, i) != null;
    }

    public final boolean o(Throwable th) {
        sn5 sn5Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            h.getClass();
            Unsafe unsafe2 = bl0.a;
            long j = i;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            c5b c5bVar = e9i.b;
            if (cqk.d(objectVolatile, c5bVar)) {
                while (true) {
                    Unsafe unsafe3 = bl0.a;
                    sn5 sn5Var2 = this;
                    th2 = th;
                    sn5Var = sn5Var2;
                    if (unsafe3.compareAndSwapObject(sn5Var2, i, c5bVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(sn5Var, j) != c5bVar) {
                        break;
                    }
                    this = sn5Var;
                    th = th2;
                }
            } else {
                sn5Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = bl0.a;
                    if (unsafe.compareAndSwapObject(sn5Var, i, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(sn5Var, j) == objectVolatile);
            }
            this = sn5Var;
            th = th2;
        }
    }

    public final Throwable p(ek2 ek2Var) {
        Unsafe unsafe;
        sn5 sn5Var;
        ek2 ek2Var2;
        while (true) {
            h.getClass();
            Unsafe unsafe2 = bl0.a;
            long j = i;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            c5b c5bVar = e9i.b;
            if (objectVolatile != c5bVar) {
                sn5 sn5Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    qr7.v(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = bl0.a;
                    if (unsafe.compareAndSwapObject(sn5Var2, i, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(sn5Var2, j) == objectVolatile);
                ore.p("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = bl0.a;
                sn5Var = this;
                ek2Var2 = ek2Var;
                if (unsafe3.compareAndSwapObject(sn5Var, i, c5bVar, ek2Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(sn5Var, j) != c5bVar) {
                    break;
                }
                this = sn5Var;
                ek2Var = ek2Var2;
            }
            this = sn5Var;
            ek2Var = ek2Var2;
        }
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thA = roe.a(obj);
        Object s64Var = thA == null ? obj : new s64(false, thA);
        nq4 nq4Var = this.e;
        vt4 context = nq4Var.getContext();
        xt4 xt4Var = this.d;
        if (e9i.A0(xt4Var, context)) {
            this.f = s64Var;
            this.c = 0;
            e9i.z0(xt4Var, nq4Var.getContext(), this);
            return;
        }
        nc6 nc6VarA = qqh.a();
        if (nc6VarA.c >= 4294967296L) {
            this.f = s64Var;
            this.c = 0;
            nc6VarA.T0(this);
            return;
        }
        nc6VarA.U0(true);
        try {
            vt4 context2 = nq4Var.getContext();
            Object objI = np4.I(context2, this.g);
            try {
                nq4Var.resumeWith(obj);
                np4.A(context2, objI);
                while (nc6VarA.W0()) {
                }
            } catch (Throwable th) {
                np4.A(context2, objI);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                nc6VarA.S0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + f55.B(this.e) + ']';
    }
}
