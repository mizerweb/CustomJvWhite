package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dp5 implements vwd {
    public static final Object c = new Object();
    public volatile vwd a;
    public volatile Object b = c;

    public dp5(vwd vwdVar) {
        this.a = vwdVar;
    }

    public static vwd a(vwd vwdVar) {
        return vwdVar instanceof dp5 ? vwdVar : new dp5(vwdVar);
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
        }
        return obj;
    }
}
