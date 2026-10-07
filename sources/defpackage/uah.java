package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uah implements pah {
    public static final v25 d = new v25(5);
    public final Object a = new Object();
    public volatile pah b;
    public Object c;

    public uah(pah pahVar) {
        this.b = pahVar;
    }

    @Override // defpackage.pah
    public final Object get() {
        pah pahVar = this.b;
        v25 v25Var = d;
        if (pahVar != v25Var) {
            synchronized (this.a) {
                try {
                    if (this.b != v25Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = v25Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
