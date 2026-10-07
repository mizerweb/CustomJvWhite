package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class ld9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ld9.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = bl0.a;
        d = unsafe.objectFieldOffset(ld9.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(ld9.class, Object.class, "_prev$volatile");
        e = unsafe.objectFieldOffset(ld9.class.getDeclaredField("_prev$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(ld9.class, Object.class, "_removedRef$volatile");
        f = unsafe.objectFieldOffset(ld9.class.getDeclaredField("_removedRef$volatile"));
    }

    public static ld9 g(ld9 ld9Var) {
        while (ld9Var.l()) {
            b.getClass();
            ld9Var = (ld9) bl0.a.getObjectVolatile(ld9Var, e);
        }
        return ld9Var;
    }

    public final boolean c(ld9 ld9Var, int i) {
        ld9 ld9VarK;
        do {
            ld9VarK = k();
            if (ld9VarK instanceof e79) {
                return (((e79) ld9VarK).g & i) == 0 && ld9VarK.c(ld9Var, i);
            }
        } while (!ld9VarK.d(ld9Var, this));
        return true;
    }

    public final boolean d(ld9 ld9Var, ld9 ld9Var2) {
        b.getClass();
        Unsafe unsafe = bl0.a;
        unsafe.putObjectVolatile(ld9Var, e, this);
        a.getClass();
        long j = d;
        unsafe.putObjectVolatile(ld9Var, j, ld9Var2);
        while (true) {
            Unsafe unsafe2 = bl0.a;
            ld9 ld9Var3 = this;
            ld9 ld9Var4 = ld9Var;
            ld9 ld9Var5 = ld9Var2;
            if (unsafe2.compareAndSwapObject(ld9Var3, d, ld9Var5, ld9Var4)) {
                ld9Var4.h(ld9Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(ld9Var3, j) != ld9Var5) {
                return false;
            }
            this = ld9Var3;
            ld9Var2 = ld9Var5;
            ld9Var = ld9Var4;
        }
    }

    public final void e(rhb rhbVar) {
        ld9 ld9Var;
        rhb rhbVar2;
        b.getClass();
        Unsafe unsafe = bl0.a;
        unsafe.putObjectVolatile(rhbVar, e, this);
        a.getClass();
        long j = d;
        unsafe.putObjectVolatile(rhbVar, j, this);
        while (this.i() == this) {
            while (true) {
                Unsafe unsafe2 = bl0.a;
                ld9Var = this;
                rhbVar2 = rhbVar;
                if (unsafe2.compareAndSwapObject(ld9Var, d, this, rhbVar2)) {
                    rhbVar2.h(ld9Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(ld9Var, j) != ld9Var) {
                        break;
                    }
                    this = ld9Var;
                    rhbVar = rhbVar2;
                }
            }
            this = ld9Var;
            rhbVar = rhbVar2;
        }
    }

    public final ld9 f() {
        while (true) {
            b.getClass();
            Unsafe unsafe = bl0.a;
            long j = e;
            ld9 ld9Var = (ld9) unsafe.getObjectVolatile(this, j);
            ld9 ld9Var2 = null;
            ld9 ld9Var3 = ld9Var;
            while (true) {
                a.getClass();
                if (ld9Var3 == null) {
                    ore.m();
                    return null;
                }
                Unsafe unsafe2 = bl0.a;
                long j2 = d;
                Object objectVolatile = unsafe2.getObjectVolatile(ld9Var3, j2);
                if (objectVolatile == this) {
                    if (ld9Var != ld9Var3) {
                        while (true) {
                            Unsafe unsafe3 = bl0.a;
                            ld9 ld9Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(ld9Var4, e, ld9Var, ld9Var3);
                            ld9 ld9Var5 = ld9Var;
                            this = ld9Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != ld9Var5) {
                                    break;
                                }
                                this = this;
                                ld9Var = ld9Var5;
                            }
                        }
                    }
                    return ld9Var3;
                }
                ld9Var = ld9Var;
                this = this;
                if (this.l()) {
                    return null;
                }
                if (!(objectVolatile instanceof fje)) {
                    ld9Var2 = ld9Var3;
                    ld9Var3 = (ld9) objectVolatile;
                } else if (ld9Var2 != null) {
                    ld9 ld9Var6 = ((fje) objectVolatile).a;
                    while (true) {
                        ld9 ld9Var7 = ld9Var3;
                        Unsafe unsafe4 = bl0.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(ld9Var2, d, ld9Var7, ld9Var6);
                        ld9Var3 = ld9Var7;
                        if (zCompareAndSwapObject2) {
                            ld9Var3 = ld9Var2;
                            ld9Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(ld9Var2, j2) != ld9Var3) {
                            break;
                        }
                    }
                } else {
                    if (ld9Var3 == null) {
                        ore.m();
                        return null;
                    }
                    ld9Var3 = (ld9) unsafe2.getObjectVolatile(ld9Var3, j);
                }
            }
            this = this;
        }
    }

    public final void h(ld9 ld9Var) {
        ld9 ld9Var2;
        while (true) {
            b.getClass();
            if (ld9Var == null) {
                ore.m();
                return;
            }
            Unsafe unsafe = bl0.a;
            long j = e;
            ld9 ld9Var3 = (ld9) unsafe.getObjectVolatile(ld9Var, j);
            if (this.i() != ld9Var) {
                return;
            }
            while (true) {
                if (ld9Var == null) {
                    ore.m();
                    return;
                }
                Unsafe unsafe2 = bl0.a;
                ld9Var2 = this;
                ld9 ld9Var4 = ld9Var;
                if (unsafe2.compareAndSwapObject(ld9Var4, e, ld9Var3, ld9Var2)) {
                    if (ld9Var2.l()) {
                        ld9Var4.f();
                        return;
                    }
                    return;
                } else {
                    if (ld9Var4 == null) {
                        ore.m();
                        return;
                    }
                    ld9Var = ld9Var4;
                    if (unsafe2.getObjectVolatile(ld9Var4, j) != ld9Var3) {
                        break;
                    } else {
                        this = ld9Var2;
                    }
                }
            }
            this = ld9Var2;
        }
    }

    public final Object i() {
        a.getClass();
        return bl0.a.getObjectVolatile(this, d);
    }

    public final ld9 j() {
        Object objI = i();
        fje fjeVar = objI instanceof fje ? (fje) objI : null;
        return fjeVar != null ? fjeVar.a : (ld9) objI;
    }

    public final ld9 k() {
        ld9 ld9VarF = f();
        if (ld9VarF != null) {
            return ld9VarF;
        }
        b.getClass();
        return g((ld9) bl0.a.getObjectVolatile(this, e));
    }

    public boolean l() {
        return i() instanceof fje;
    }

    public final ld9 m() {
        ld9 ld9Var;
        while (true) {
            Object objI = this.i();
            if (objI instanceof fje) {
                return ((fje) objI).a;
            }
            if (objI == this) {
                return (ld9) objI;
            }
            ld9 ld9Var2 = (ld9) objI;
            fje fjeVarN = ld9Var2.n();
            while (true) {
                a.getClass();
                Unsafe unsafe = bl0.a;
                long j = d;
                ld9Var = this;
                if (unsafe.compareAndSwapObject(ld9Var, j, objI, fjeVarN)) {
                    ld9Var2.f();
                    return null;
                }
                if (unsafe.getObjectVolatile(ld9Var, j) != objI) {
                    break;
                }
                this = ld9Var;
            }
            this = ld9Var;
        }
    }

    public final fje n() {
        c.getClass();
        Unsafe unsafe = bl0.a;
        long j = f;
        fje fjeVar = (fje) unsafe.getObjectVolatile(this, j);
        if (fjeVar != null) {
            return fjeVar;
        }
        fje fjeVar2 = new fje(this);
        unsafe.putObjectVolatile(this, j, fjeVar2);
        return fjeVar2;
    }

    public String toString() {
        return new kd9(this) + '@' + f55.n(this);
    }
}
