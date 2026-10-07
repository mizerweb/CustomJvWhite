package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ha6 {
    public abstract void a(vxe vxeVar, Object obj);

    public abstract String b();

    public final void c(qxe qxeVar, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        vxe vxeVarO0 = qxeVar.O0(b());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    a(vxeVarO0, obj);
                    vxeVarO0.M0();
                    vxeVarO0.reset();
                }
            }
            p90.f(vxeVarO0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public final void d(qxe qxeVar, Object obj) {
        if (obj == null) {
            return;
        }
        vxe vxeVarO0 = qxeVar.O0(b());
        try {
            a(vxeVarO0, obj);
            vxeVarO0.M0();
            p90.f(vxeVarO0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public final long e(qxe qxeVar, Object obj) {
        if (obj == null) {
            return -1L;
        }
        vxe vxeVarO0 = qxeVar.O0(b());
        try {
            a(vxeVarO0, obj);
            vxeVarO0.M0();
            p90.f(vxeVarO0, null);
            return e9i.b0(qxeVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public final List f(qxe qxeVar, Collection collection) {
        if (collection == null) {
            return r66.a;
        }
        c79 c79VarW = yab.w();
        vxe vxeVarO0 = qxeVar.O0(b());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    a(vxeVarO0, obj);
                    vxeVarO0.M0();
                    vxeVarO0.reset();
                    c79VarW.add(Long.valueOf(e9i.b0(qxeVar)));
                } else {
                    c79VarW.add(-1L);
                }
            }
            p90.f(vxeVarO0, null);
            return yab.j(c79VarW);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }
}
