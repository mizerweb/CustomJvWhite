package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
@mif(with = fu8.class)
public final class cu8 extends jt8 implements Map<String, jt8>, uv8 {
    public static final bu8 Companion = new bu8();
    public final Map a;

    public cu8(Map map) {
        this.a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 compute(String str, BiFunction<? super String, ? super jt8, ? extends jt8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 computeIfAbsent(String str, Function<? super String, ? extends jt8> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 computeIfPresent(String str, BiFunction<? super String, ? super jt8, ? extends jt8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof jt8)) {
            return false;
        }
        return this.a.containsValue((jt8) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, jt8>> entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return cqk.d(this.a, obj);
    }

    @Override // java.util.Map
    public final jt8 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (jt8) this.a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 merge(String str, jt8 jt8Var, BiFunction<? super jt8, ? super jt8, ? extends jt8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 put(String str, jt8 jt8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends jt8> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 putIfAbsent(String str, jt8 jt8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final jt8 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ jt8 replace(String str, jt8 jt8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super jt8, ? extends jt8> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return ww3.z1(this.a.entrySet(), ",", "{", "}", new x27(17), 24);
    }

    @Override // java.util.Map
    public final Collection<jt8> values() {
        return this.a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, jt8 jt8Var, jt8 jt8Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
