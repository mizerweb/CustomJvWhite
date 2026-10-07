package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class amc {
    public final Object a;
    public final Object b;

    public amc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amc)) {
            return false;
        }
        amc amcVar = (amc) obj;
        return Objects.equals(amcVar.a, this.a) && Objects.equals(amcVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
