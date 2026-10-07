package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class g98 implements Map, Serializable {
    public transient u98 a;
    public transient u98 b;
    public transient s88 c;

    public static g98 a(Map map) {
        if ((map instanceof g98) && !(map instanceof SortedMap)) {
            g98 g98Var = (g98) map;
            if (!g98Var.f()) {
                return g98Var;
            }
        }
        Set setEntrySet = map.entrySet();
        hle hleVar = new hle(setEntrySet != null ? setEntrySet.size() : 4);
        hleVar.l(setEntrySet);
        return hleVar.c(true);
    }

    public abstract u98 b();

    public abstract u98 c();

    @Override // java.util.Map
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

    public abstract s88 d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e */
    public u98 entrySet() {
        u98 u98Var = this.a;
        if (u98Var != null) {
            return u98Var;
        }
        u98 u98VarB = b();
        this.a = u98VarB;
        return u98VarB;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return tpk.d(this, obj);
    }

    public abstract boolean f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g */
    public u98 keySet() {
        u98 u98Var = this.b;
        if (u98Var != null) {
            return u98Var;
        }
        u98 u98VarC = c();
        this.b = u98VarC;
        return u98VarC;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h */
    public s88 values() {
        s88 s88Var = this.c;
        if (s88Var != null) {
            return s88Var;
        }
        s88 s88VarD = d();
        this.c = s88VarD;
        return s88VarD;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return xpl.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return tpk.f(this);
    }
}
