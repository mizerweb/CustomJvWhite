package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ah0 extends ct3 {
    public final ng0 a;

    public ah0(ng0 ng0Var) {
        this.a = ng0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ct3)) {
            return false;
        }
        ct3 ct3Var = (ct3) obj;
        Object obj2 = bt3.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((ah0) ct3Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((bt3.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + bt3.a + ", androidClientInfo=" + this.a + "}";
    }
}
