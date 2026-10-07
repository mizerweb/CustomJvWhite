package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class l9b extends egf implements j9b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(l9b.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long k = bl0.a.objectFieldOffset(l9b.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public l9b() {
        super(1);
        this.owner$volatile = np4.c;
    }

    @Override // defpackage.j9b
    public final Object b(lq4 lq4Var) {
        boolean zF = f();
        sbi sbiVar = sbi.a;
        if (!zF) {
            ek2 ek2VarR = wk8.r(p90.B(lq4Var));
            try {
                k9b k9bVar = new k9b(this, ek2VarR);
                while (true) {
                    int andDecrement = egf.g.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            k9bVar.j(sbiVar, this.b);
                            break;
                        }
                        if (c(k9bVar)) {
                            break;
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

    public final boolean f() {
        int iH = h();
        if (iH == 0) {
            return true;
        }
        if (iH == 1) {
            return false;
        }
        if (iH != 2) {
            ore.k("unexpected");
            return false;
        }
        ore.c("This mutex is already locked by the specified owner: null");
        return false;
    }

    @Override // defpackage.j9b
    public final void g(Object obj) {
        while (Math.max(egf.g.get(this), 0) == 0) {
            j.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            c5b c5bVar = np4.c;
            if (objectVolatile != c5bVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = bl0.a;
                    l9b l9bVar = this;
                    if (unsafe2.compareAndSwapObject(l9bVar, k, objectVolatile, c5bVar)) {
                        l9bVar.d();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(l9bVar, j2) != objectVolatile) {
                            this = l9bVar;
                            break;
                        }
                        this = l9bVar;
                    }
                }
            }
        }
        ore.k("This mutex is not locked");
    }

    public final int h() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = egf.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    j.getClass();
                    bl0.a.putObjectVolatile(this, k, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(f55.n(this));
        sb.append("[isLocked=");
        sb.append(Math.max(egf.g.get(this), 0) == 0);
        sb.append(",owner=");
        j.getClass();
        sb.append(bl0.a.getObjectVolatile(this, k));
        sb.append(']');
        return sb.toString();
    }
}
