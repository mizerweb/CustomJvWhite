package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class od9 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(od9.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = bl0.a.objectFieldOffset(od9.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(od9.class, "_state$volatile");
    public static final c5b g = new c5b("REMOVE_FROZEN", 1);

    public od9(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            ore.k("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        ore.k("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                od9 od9Var = this;
                if (f.compareAndSet(od9Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    od9 od9VarD = od9Var;
                    while ((atomicLongFieldUpdater.get(od9VarD) & 1152921504606846976L) != 0) {
                        od9VarD = od9VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = od9VarD.d;
                        int i4 = od9VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof nd9) && ((nd9) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            od9VarD = null;
                        }
                        if (od9VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = od9Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final od9 b(long j) {
        od9 od9Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = bl0.a;
            long j2 = h;
            od9 od9Var2 = (od9) unsafe.getObjectVolatile(this, j2);
            if (od9Var2 != null) {
                return od9Var2;
            }
            od9 od9Var3 = new od9(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object nd9Var = this.d.get(i4);
                if (nd9Var == null) {
                    nd9Var = new nd9(i);
                }
                od9Var3.d.set(od9Var3.c & i, nd9Var);
                i++;
            }
            f.set(od9Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = bl0.a;
                od9Var = this;
                if (unsafe2.compareAndSwapObject(od9Var, h, (Object) null, od9Var3) || unsafe2.getObjectVolatile(od9Var, j2) != null) {
                    break;
                }
                this = od9Var;
            }
            this = od9Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            od9 od9Var = this;
            if (atomicLongFieldUpdater.compareAndSet(od9Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = od9Var;
        }
    }

    public final od9 d() {
        long j;
        od9 od9Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                od9Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            od9Var = this;
            if (atomicLongFieldUpdater.compareAndSet(od9Var, j, j2)) {
                j = j2;
                break;
            }
            this = od9Var;
        }
        return od9Var.b(j);
    }

    public final Object e() {
        od9 od9VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(od9VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = od9VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = od9VarD.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = od9VarD.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof nd9)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(od9VarD, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    od9VarD = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(od9VarD);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                od9VarD = od9VarD.d();
                            } else {
                                od9 od9Var = od9VarD;
                                if (f.compareAndSet(od9Var, j3, (j3 & (-1073741824)) | j2)) {
                                    od9Var.d.set(i4 & od9Var.c, null);
                                    od9VarD = null;
                                } else {
                                    od9VarD = od9Var;
                                }
                            }
                            if (od9VarD == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
