package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class rrk extends dyk {
    final /* synthetic */ jsk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrk(jsk jskVar, Map map) {
        super(map);
        this.b = jskVar;
    }

    @Override // defpackage.dyk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        xwk.a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    @Override // defpackage.dyk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ork(this, this.a.entrySet().iterator());
    }

    @Override // defpackage.dyk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.b.e -= size;
        return size > 0;
    }
}
