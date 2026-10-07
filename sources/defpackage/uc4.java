package defpackage;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes.dex */
public final class uc4 extends p41 {
    public final int r;

    public uc4(int i, int i2, cf7 cf7Var) {
        super(i, cf7Var);
        this.r = i2;
        if (i2 == 1) {
            ore.d(zfe.a(p41.class).h(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        c.o(c0a.k(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.p41
    public final boolean E() {
        return this.r == 2;
    }

    public final Object V(Object obj, boolean z) throws IllegalAccessException, InvocationTargetException {
        cf7 cf7Var;
        UndeliveredElementException undeliveredElementExceptionB;
        if (this.r != 3) {
            return R(obj);
        }
        Object objC = super.c(obj);
        if (!(objC instanceof cs2) || (objC instanceof bs2)) {
            return objC;
        }
        if (!z || (cf7Var = this.b) == null || (undeliveredElementExceptionB = fel.b(cf7Var, obj, null)) == null) {
            return sbi.a;
        }
        throw undeliveredElementExceptionB;
    }

    @Override // defpackage.p41, defpackage.kgf
    public final Object a(lq4 lq4Var, Object obj) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionB;
        if (!(V(obj, true) instanceof bs2)) {
            return sbi.a;
        }
        cf7 cf7Var = this.b;
        if (cf7Var == null || (undeliveredElementExceptionB = fel.b(cf7Var, obj, null)) == null) {
            throw v();
        }
        gm0.b(undeliveredElementExceptionB, v());
        throw undeliveredElementExceptionB;
    }

    @Override // defpackage.p41, defpackage.kgf
    public final Object c(Object obj) {
        return V(obj, false);
    }
}
