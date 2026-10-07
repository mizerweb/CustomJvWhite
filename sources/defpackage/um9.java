package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class um9 extends AbstractMap {
    public final Map a;
    public final tm9 b;

    public um9(Map map, tm9 tm9Var) {
        map.getClass();
        this.a = map;
        this.b = tm9Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new h2(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.a;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.b.h(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.a;
        if (map.containsKey(obj)) {
            return this.b.h(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new u2(this);
    }
}
