package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dd8 {
    public final int a;
    public final Object b;

    public dd8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd8)) {
            return false;
        }
        dd8 dd8Var = (dd8) obj;
        return this.a == dd8Var.a && cqk.d(this.b, dd8Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
