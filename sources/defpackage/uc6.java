package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class uc6 {
    public final Object a;
    public final Method b;
    public final int c;
    public boolean d = true;

    public uc6(Object obj, Method method) {
        if (obj == null) {
            ore.n("EventProducer target cannot be null.");
            throw null;
        }
        if (method == null) {
            ore.n("EventProducer method cannot be null.");
            throw null;
        }
        this.a = obj;
        this.b = method;
        method.setAccessible(true);
        this.c = obj.hashCode() + ((method.hashCode() + 31) * 31);
    }

    public final Object a() {
        if (!this.d) {
            ore.k(toString().concat(" has been invalidated and can no longer produce events."));
            return null;
        }
        try {
            return this.b.invoke(this.a, null);
        } catch (IllegalAccessException e) {
            c.e(e);
            return null;
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw e2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc6.class != obj.getClass()) {
            return false;
        }
        uc6 uc6Var = (uc6) obj;
        return this.b.equals(uc6Var.b) && this.a == uc6Var.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[EventProducer " + this.b + "]";
    }
}
