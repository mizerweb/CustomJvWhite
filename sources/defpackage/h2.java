package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends kof {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractMap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(AbstractMap abstractMap, int i) {
        super(0);
        this.b = i;
        this.c = abstractMap;
    }

    public final boolean a(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapB = b();
        mapB.getClass();
        try {
            obj2 = mapB.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (ndl.c(obj2, entry.getValue())) {
            return obj2 != null || b().containsKey(key);
        }
        return false;
    }

    public final Map b() {
        int i = this.b;
        AbstractMap abstractMap = this.c;
        switch (i) {
            case 0:
                return (j2) abstractMap;
            default:
                return (um9) abstractMap;
        }
    }

    public final boolean c(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return b().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // defpackage.kof, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                Set setEntrySet = ((j2) this.c).c.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return a(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        AbstractMap abstractMap = this.c;
        switch (i) {
            case 0:
                return new i2((j2) abstractMap);
            default:
                um9 um9Var = (um9) abstractMap;
                Iterator it = um9Var.a.entrySet().iterator();
                tm9 tm9Var = um9Var.b;
                tm9Var.getClass();
                return new vn8(it, new zo7(19, tm9Var));
        }
    }

    @Override // defpackage.kof, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                c2 c2Var = ((j2) this.c).d;
                Object key = entry.getKey();
                Map map = c2Var.e;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    c2Var.f -= size;
                }
                return true;
            default:
                return c(obj);
        }
    }

    @Override // defpackage.kof, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // defpackage.kof, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(tpk.a(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return b().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }
}
