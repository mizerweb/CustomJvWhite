package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zlc {
    public final Object a;
    public final Object b;

    public zlc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zlc.class == obj.getClass()) {
            zlc zlcVar = (zlc) obj;
            Object obj2 = zlcVar.a;
            Object obj3 = this.a;
            if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
                return false;
            }
            Object obj4 = zlcVar.b;
            Object obj5 = this.b;
            if (obj5 != null) {
                return obj5.equals(obj4);
            }
            if (obj4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{first=" + this.a + ", second=" + this.b + '}';
    }
}
