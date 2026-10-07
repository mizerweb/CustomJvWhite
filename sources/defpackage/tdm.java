package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tdm implements Map, Serializable {
    public transient jam a;
    public transient rbm b;
    public transient vcm c;
    public final transient Object[] d;

    public tdm(Object[] objArr) {
        this.d = objArr;
    }

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
        vcm vcmVar = this.c;
        if (vcmVar == null) {
            vcmVar = new vcm(this.d, 1);
            this.c = vcmVar;
        }
        return vcmVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        jam jamVar = this.a;
        if (jamVar != null) {
            return jamVar;
        }
        jam jamVar2 = new jam(this, this.d);
        this.a = jamVar2;
        return jamVar2;
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

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.d;
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        jam jamVar = this.a;
        if (jamVar == null) {
            jamVar = new jam(this, this.d);
            this.a = jamVar;
        }
        Iterator it = jamVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        rbm rbmVar = this.b;
        if (rbmVar != null) {
            return rbmVar;
        }
        rbm rbmVar2 = new rbm(this, new vcm(this.d, 0));
        this.b = rbmVar2;
        return rbmVar2;
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

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (jam) entrySet()) {
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
        vcm vcmVar = this.c;
        if (vcmVar != null) {
            return vcmVar;
        }
        vcm vcmVar2 = new vcm(this.d, 1);
        this.c = vcmVar2;
        return vcmVar2;
    }
}
