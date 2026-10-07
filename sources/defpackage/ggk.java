package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class ggk {
    public final Handler a;
    public final Object b;
    public final su6 c;

    public ggk(Handler handler, Object obj, su6 su6Var) {
        this.a = handler;
        this.b = obj;
        this.c = su6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ggk) {
            ggk ggkVar = (ggk) obj;
            return cqk.d(this.a, ggkVar.a) && this.b == ggkVar.b && this.c == ggkVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConcurrencyData(handler=" + this.a + ", lock=" + this.b + ", timeoutRunnable=" + this.c + ")";
    }
}
