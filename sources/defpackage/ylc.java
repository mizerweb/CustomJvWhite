package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ylc implements Serializable {
    public final Object a;
    public final Object b;

    public ylc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylc)) {
            return false;
        }
        ylc ylcVar = (ylc) obj;
        return cqk.d(this.a, ylcVar.a) && cqk.d(this.b, ylcVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
