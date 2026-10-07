package defpackage;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ep5 implements Provider {
    public static final Object c = new Object();
    public volatile rj6 a;
    public volatile Object b;

    public static Provider a(rj6 rj6Var) {
        if (rj6Var instanceof ep5) {
            return rj6Var;
        }
        ep5 ep5Var = new ep5();
        ep5Var.b = c;
        ep5Var.a = rj6Var;
        return ep5Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
