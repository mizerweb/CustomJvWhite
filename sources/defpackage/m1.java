package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends grk {
    public static final Unsafe b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                ore.h("Could not initialize intrinsics", e2.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new l1());
        }
        try {
            d = unsafe.objectFieldOffset(o1.class.getDeclaredField(DatabaseHelper.COMPRESSED_COLUMN_NAME));
            c = unsafe.objectFieldOffset(o1.class.getDeclaredField("b"));
            e = unsafe.objectFieldOffset(o1.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(n1.class.getDeclaredField("a"));
            g = unsafe.objectFieldOffset(n1.class.getDeclaredField("b"));
            b = unsafe;
        } catch (NoSuchFieldException e3) {
            qr7.o(e3);
        }
    }

    @Override // defpackage.grk
    public final boolean b(o1 o1Var, c1 c1Var, c1 c1Var2) {
        return j1.a(b, o1Var, c, c1Var, c1Var2);
    }

    @Override // defpackage.grk
    public final boolean c(o1 o1Var, Object obj, Object obj2) {
        return k1.a(b, o1Var, e, obj, obj2);
    }

    @Override // defpackage.grk
    public final boolean d(o1 o1Var, n1 n1Var, n1 n1Var2) {
        return i1.a(b, o1Var, d, n1Var, n1Var2);
    }

    @Override // defpackage.grk
    public final c1 e(o1 o1Var) {
        c1 c1Var;
        c1 c1Var2 = c1.d;
        do {
            c1Var = o1Var.b;
            if (c1Var2 == c1Var) {
                break;
            }
        } while (!b(o1Var, c1Var, c1Var2));
        return c1Var;
    }

    @Override // defpackage.grk
    public final n1 f(o1 o1Var) {
        n1 n1Var;
        n1 n1Var2 = n1.c;
        do {
            n1Var = o1Var.c;
            if (n1Var2 == n1Var) {
                break;
            }
        } while (!d(o1Var, n1Var, n1Var2));
        return n1Var;
    }

    @Override // defpackage.grk
    public final void g(n1 n1Var, n1 n1Var2) {
        b.putObject(n1Var, g, n1Var2);
    }

    @Override // defpackage.grk
    public final void h(n1 n1Var, Thread thread) {
        b.putObject(n1Var, f, thread);
    }
}
