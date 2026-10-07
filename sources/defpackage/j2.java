package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class j2 extends AbstractMap {
    public transient h2 a;
    public transient u2 b;
    public final transient Map c;
    public final /* synthetic */ c2 d;

    public j2(c2 c2Var, Map map) {
        this.d = c2Var;
        this.c = map;
    }

    public final u88 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        c2 c2Var = this.d;
        return new u88(key, z ? new n2(c2Var, key, list, null) : new r2(c2Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c2 c2Var = this.d;
        if (this.c == c2Var.e) {
            c2Var.clear();
            return;
        }
        i2 i2Var = new i2(this);
        while (i2Var.hasNext()) {
            i2Var.next();
            i2Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h2 h2Var = this.a;
        if (h2Var != null) {
            return h2Var;
        }
        h2 h2Var2 = new h2(this, 0);
        this.a = h2Var2;
        return h2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        c2 c2Var = this.d;
        return z ? new n2(c2Var, obj, list, null) : new r2(c2Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.d.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        c2 c2Var = this.d;
        Collection collectionH = c2Var.h();
        collectionH.addAll(collection);
        c2Var.f -= collection.size();
        collection.clear();
        return collectionH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        u2 u2Var = this.b;
        if (u2Var != null) {
            return u2Var;
        }
        u2 u2Var2 = new u2(this);
        this.b = u2Var2;
        return u2Var2;
    }
}
