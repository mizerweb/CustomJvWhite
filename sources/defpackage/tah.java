package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class tah implements pah, Serializable {
    public final transient Object a = new Object();
    public final pah b;
    public volatile transient boolean c;
    public transient Object d;

    public tah(pah pahVar) {
        this.b = pahVar;
    }

    @Override // defpackage.pah
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
