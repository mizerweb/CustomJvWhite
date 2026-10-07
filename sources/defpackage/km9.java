package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class km9 implements Map, uv8 {
    public final b9b a;
    public ja6 b;
    public ix8 c;
    public lri d;

    public km9(b9b b9bVar) {
        this.a = b9bVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ja6 ja6Var = this.b;
        if (ja6Var != null) {
            return ja6Var;
        }
        ja6 ja6Var2 = new ja6(this.a);
        this.b = ja6Var2;
        return ja6Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || km9.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((km9) obj).a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.e();
    }

    @Override // java.util.Map
    public final Set keySet() {
        ix8 ix8Var = this.c;
        if (ix8Var != null) {
            return ix8Var;
        }
        ix8 ix8Var2 = new ix8(this.a);
        this.c = ix8Var2;
        return ix8Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.e;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        lri lriVar = this.d;
        if (lriVar != null) {
            return lriVar;
        }
        lri lriVar2 = new lri(this.a);
        this.d = lriVar2;
        return lriVar2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
