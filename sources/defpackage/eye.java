package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eye implements Map.Entry {
    public final Object a;
    public final Object b;
    public eye c;
    public eye d;

    public eye(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eye)) {
            return false;
        }
        eye eyeVar = (eye) obj;
        return this.a.equals(eyeVar.a) && this.b.equals(eyeVar.b);
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
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
