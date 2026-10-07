package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class ask extends AbstractCollection {
    final Object a;
    Collection b;
    final ask c;
    final Collection d;
    final /* synthetic */ jsk e;

    public ask(jsk jskVar, Object obj, Collection collection, ask askVar) {
        this.e = jskVar;
        this.a = obj;
        this.b = collection;
        this.c = askVar;
        this.d = askVar == null ? null : askVar.b;
    }

    public final void a() {
        ask askVar = this.c;
        if (askVar != null) {
            askVar.a();
            return;
        }
        jsk jskVar = this.e;
        jskVar.d.put(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.e.e++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.e.e += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    public final void b() {
        ask askVar = this.c;
        if (askVar != null) {
            askVar.b();
            ask askVar2 = this.c;
            if (askVar2.b == this.d) {
                return;
            }
            c.c();
            return;
        }
        if (this.b.isEmpty()) {
            jsk jskVar = this.e;
            Collection collection = (Collection) jskVar.d.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    public final void c() {
        ask askVar = this.c;
        if (askVar != null) {
            askVar.c();
        } else if (this.b.isEmpty()) {
            jsk jskVar = this.e;
            jskVar.d.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.e -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new xrk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            this.e.e--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.b.size();
            this.e.e += size2 - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.b.size();
            this.e.e += size2 - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}
