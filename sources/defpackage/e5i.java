package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e5i implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public e5i(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5i)) {
            return false;
        }
        e5i e5iVar = (e5i) obj;
        return cqk.d(this.a, e5iVar.a) && cqk.d(this.b, e5iVar.b) && cqk.d(this.c, e5iVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
