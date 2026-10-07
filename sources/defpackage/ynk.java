package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ynk implements Map, Serializable {
    public transient pok a;
    public transient rok b;
    public transient uok c;

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
        uok uokVar = this.c;
        if (uokVar == null) {
            xok xokVar = (xok) this;
            uok uokVar2 = new uok(xokVar.e, 1, xokVar.f);
            this.c = uokVar2;
            uokVar = uokVar2;
        }
        return uokVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        pok pokVar = this.a;
        if (pokVar != null) {
            return pokVar;
        }
        xok xokVar = (xok) this;
        pok pokVar2 = new pok(xokVar, xokVar.e, xokVar.f);
        this.a = pokVar2;
        return pokVar2;
    }

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
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        pok pokVar = this.a;
        if (pokVar == null) {
            xok xokVar = (xok) this;
            pok pokVar2 = new pok(xokVar, xokVar.e, xokVar.f);
            this.a = pokVar2;
            pokVar = pokVar2;
        }
        Iterator it = pokVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((xok) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        rok rokVar = this.b;
        if (rokVar != null) {
            return rokVar;
        }
        xok xokVar = (xok) this;
        rok rokVar2 = new rok(xokVar, new uok(xokVar.e, 0, xokVar.f));
        this.b = rokVar2;
        return rokVar2;
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
        int i = ((xok) this).f;
        if (i < 0) {
            ore.p(zo5.h(i, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (pok) entrySet()) {
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

    @Override // java.util.Map
    public final Collection values() {
        uok uokVar = this.c;
        if (uokVar != null) {
            return uokVar;
        }
        xok xokVar = (xok) this;
        uok uokVar2 = new uok(xokVar.e, 1, xokVar.f);
        this.c = uokVar2;
        return uokVar2;
    }
}
