package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cm9 implements Map.Entry, uv8 {
    public final Object a;
    public final Object b;

    public cm9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm9)) {
            return false;
        }
        cm9 cm9Var = (cm9) obj;
        return cqk.d(this.a, cm9Var.a) && cqk.d(this.b, cm9Var.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.a + ", value=" + this.b + ')';
    }
}
