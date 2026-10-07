package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owk implements Map, Serializable {
    private transient rwk a;
    private transient rwk b;
    private transient tvk c;

    public static owk c(Object obj, Object obj2) {
        gtk.b("optional-module-barcode", zgc.c);
        return qzk.g(1, new Object[]{"optional-module-barcode", zgc.c}, null);
    }

    public abstract tvk a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b */
    public final tvk values() {
        tvk tvkVar = this.c;
        if (tvkVar != null) {
            return tvkVar;
        }
        tvk tvkVarA = a();
        this.c = tvkVarA;
        return tvkVarA;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract rwk d();

    public abstract rwk e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f */
    public final rwk entrySet() {
        rwk rwkVar = this.a;
        if (rwkVar != null) {
            return rwkVar;
        }
        rwk rwkVarD = d();
        this.a = rwkVarD;
        return rwkVarD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzk.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        rwk rwkVar = this.b;
        if (rwkVar != null) {
            return rwkVar;
        }
        rwk rwkVarE = e();
        this.b = rwkVarE;
        return rwkVarE;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        gtk.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
