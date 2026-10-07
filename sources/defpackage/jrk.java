package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class jrk extends jyk {
    final transient Map d;
    final /* synthetic */ jsk e;

    public jrk(jsk jskVar, Map map) {
        this.e = jskVar;
        this.d = map;
    }

    @Override // defpackage.jyk
    public final Set a() {
        return new frk(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b */
    public final Collection get(Object obj) {
        Collection collection = (Collection) myk.a(this.d, obj);
        if (collection == null) {
            return null;
        }
        return this.e.q(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        jsk jskVar = this.e;
        if (this.d == jskVar.d) {
            jskVar.h();
        } else {
            xwk.a(new irk(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return myk.b(this.d, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.jyk, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.e.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionN = this.e.n();
        collectionN.addAll(collection);
        this.e.e -= collection.size();
        collection.clear();
        return collectionN;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.d.toString();
    }
}
