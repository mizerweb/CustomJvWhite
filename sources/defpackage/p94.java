package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class p94 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(p94.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = bl0.a;
        c = unsafe.objectFieldOffset(p94.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(p94.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(p94.class.getDeclaredField("_prev$volatile"));
    }

    public p94(gcf gcfVar) {
        this._prev$volatile = gcfVar;
    }

    public final void a() {
        b.getClass();
        bl0.a.putObjectVolatile(this, d, (Object) null);
    }

    public final p94 c() {
        p94 p94VarF = f();
        while (p94VarF != null && p94VarF.g()) {
            b.getClass();
            p94VarF = (p94) bl0.a.getObjectVolatile(p94VarF, d);
        }
        return p94VarF;
    }

    public final p94 d() {
        Object objE = e();
        if (objE == sb8.a) {
            return null;
        }
        return (p94) objE;
    }

    public final Object e() {
        a.getClass();
        return bl0.a.getObjectVolatile(this, c);
    }

    public final p94 f() {
        b.getClass();
        return (p94) bl0.a.getObjectVolatile(this, d);
    }

    public abstract boolean g();

    public final boolean h() {
        c5b c5bVar = sb8.a;
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = c;
            p94 p94Var = this;
            if (unsafe.compareAndSwapObject(p94Var, j, (Object) null, c5bVar)) {
                return true;
            }
            if (unsafe.getObjectVolatile(p94Var, j) != null) {
                return false;
            }
            this = p94Var;
        }
    }

    public final void i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Unsafe unsafe;
        Object objectVolatile;
        p94 p94VarD;
        if (d() == null) {
            return;
        }
        while (true) {
            p94 p94VarC = c();
            p94 p94VarD2 = d();
            while (p94VarD2.g() && (p94VarD = p94VarD2.d()) != null) {
                p94VarD2 = p94VarD;
            }
            do {
                atomicReferenceFieldUpdater = b;
                atomicReferenceFieldUpdater.getClass();
                unsafe = bl0.a;
                objectVolatile = unsafe.getObjectVolatile(p94VarD2, d);
            } while (!tt2.g(atomicReferenceFieldUpdater, p94VarD2, objectVolatile, ((p94) objectVolatile) == null ? null : p94VarC));
            if (p94VarC != null) {
                a.getClass();
                unsafe.putObjectVolatile(p94VarC, c, p94VarD2);
            }
            if (!p94VarD2.g() || p94VarD2.d() == null) {
                if (p94VarC == null || !p94VarC.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(gcf gcfVar) {
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = c;
            p94 p94Var = this;
            gcf gcfVar2 = gcfVar;
            if (unsafe.compareAndSwapObject(p94Var, j, (Object) null, gcfVar2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(p94Var, j) != null) {
                return false;
            }
            this = p94Var;
            gcfVar = gcfVar2;
        }
    }
}
