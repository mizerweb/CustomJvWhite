package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class jc6 {
    public final Object a;
    public final Method b;
    public final int c;
    public boolean d = true;

    public jc6(Object obj, Method method) {
        if (obj == null) {
            ore.n("EventHandler target cannot be null.");
            throw null;
        }
        if (method == null) {
            ore.n("EventHandler method cannot be null.");
            throw null;
        }
        this.a = obj;
        this.b = method;
        method.setAccessible(true);
        this.c = obj.hashCode() + ((method.hashCode() + 31) * 31);
    }

    public final void a(Object obj) throws InvocationTargetException {
        if (!this.d) {
            ore.k(toString().concat(" has been invalidated and can no longer handle events."));
            return;
        }
        try {
            this.b.invoke(this.a, obj);
        } catch (IllegalAccessException e) {
            c.e(e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof Error)) {
                throw e2;
            }
            throw ((Error) e2.getCause());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jc6.class != obj.getClass()) {
            return false;
        }
        jc6 jc6Var = (jc6) obj;
        return this.b.equals(jc6Var.b) && this.a == jc6Var.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[EventHandler " + this.b + "]";
    }
}
