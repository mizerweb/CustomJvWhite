package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rl9 implements Map.Entry, uv8 {
    public final ul9 a;
    public final int b;
    public final int c;

    public rl9(ul9 ul9Var, int i) {
        this.a = ul9Var;
        this.b = i;
        this.c = ul9Var.h;
    }

    public final void a() {
        if (this.a.h != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return cqk.d(entry.getKey(), getKey()) && cqk.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        return this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        ul9 ul9Var = this.a;
        ul9Var.c();
        Object[] objArr = ul9Var.b;
        if (objArr == null) {
            int length = ul9Var.a.length;
            if (length < 0) {
                ore.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            ul9Var.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
