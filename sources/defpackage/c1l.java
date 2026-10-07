package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class c1l extends u0l {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

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
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            c = unsafe.objectFieldOffset(f1l.class.getDeclaredField(DatabaseHelper.COMPRESSED_COLUMN_NAME));
            b = unsafe.objectFieldOffset(f1l.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(f1l.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(d1l.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(d1l.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            qr7.o(e3);
        }
    }

    public /* synthetic */ c1l(g2l g2lVar) {
        super(null);
    }

    @Override // defpackage.u0l
    public final x0l a(f1l f1lVar, x0l x0lVar) {
        x0l x0lVar2;
        do {
            x0lVar2 = f1lVar.b;
            if (x0lVar == x0lVar2) {
                break;
            }
        } while (!e(f1lVar, x0lVar2, x0lVar));
        return x0lVar2;
    }

    @Override // defpackage.u0l
    public final d1l b(f1l f1lVar, d1l d1lVar) {
        d1l d1lVar2;
        do {
            d1lVar2 = f1lVar.c;
            if (d1lVar == d1lVar2) {
                break;
            }
        } while (!g(f1lVar, d1lVar2, d1lVar));
        return d1lVar2;
    }

    @Override // defpackage.u0l
    public final void c(d1l d1lVar, d1l d1lVar2) {
        a.putObject(d1lVar, f, d1lVar2);
    }

    @Override // defpackage.u0l
    public final void d(d1l d1lVar, Thread thread) {
        a.putObject(d1lVar, e, thread);
    }

    @Override // defpackage.u0l
    public final boolean e(f1l f1lVar, x0l x0lVar, x0l x0lVar2) {
        return d2l.a(a, f1lVar, b, x0lVar, x0lVar2);
    }

    @Override // defpackage.u0l
    public final boolean f(f1l f1lVar, Object obj, Object obj2) {
        return d2l.a(a, f1lVar, d, obj, obj2);
    }

    @Override // defpackage.u0l
    public final boolean g(f1l f1lVar, d1l d1lVar, d1l d1lVar2) {
        return d2l.a(a, f1lVar, c, d1lVar, d1lVar2);
    }

    private c1l() {
        throw null;
    }
}
