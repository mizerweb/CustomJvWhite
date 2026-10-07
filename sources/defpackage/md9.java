package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class md9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(md9.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = bl0.a.objectFieldOffset(md9.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new od9(8, false);

    public final boolean a(Runnable runnable) {
        md9 md9Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = b;
            od9 od9Var = (od9) unsafe.getObjectVolatile(this, j);
            int iA = od9Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                od9 od9VarD = od9Var.d();
                while (true) {
                    Unsafe unsafe2 = bl0.a;
                    md9Var = this;
                    if (unsafe2.compareAndSwapObject(md9Var, b, od9Var, od9VarD) || unsafe2.getObjectVolatile(md9Var, j) != od9Var) {
                        break;
                    }
                    this = md9Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                md9Var = this;
            }
            this = md9Var;
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            atomicReferenceFieldUpdater.getClass();
            od9 od9Var = (od9) bl0.a.getObjectVolatile(this, b);
            if (od9Var.c()) {
                return;
            } else {
                mw7.i(atomicReferenceFieldUpdater, this, od9Var, od9Var.d());
            }
        }
    }

    public final int c() {
        a.getClass();
        od9 od9Var = (od9) bl0.a.getObjectVolatile(this, b);
        od9Var.getClass();
        long j = od9.f.get(od9Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        md9 md9Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = bl0.a;
            long j = b;
            od9 od9Var = (od9) unsafe.getObjectVolatile(this, j);
            Object objE = od9Var.e();
            if (objE != od9.g) {
                return objE;
            }
            od9 od9VarD = od9Var.d();
            while (true) {
                Unsafe unsafe2 = bl0.a;
                md9Var = this;
                if (unsafe2.compareAndSwapObject(md9Var, b, od9Var, od9VarD) || unsafe2.getObjectVolatile(md9Var, j) != od9Var) {
                    break;
                }
                this = md9Var;
            }
            this = md9Var;
        }
    }
}
