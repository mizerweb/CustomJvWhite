package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class jsk extends wsk implements Serializable {
    private final transient Map d;
    private transient int e;

    public jsk(Map map) {
        vpk.d(map.isEmpty());
        this.d = map;
    }

    public static /* bridge */ /* synthetic */ void x(jsk jskVar, Object obj) {
        Object objRemove;
        try {
            objRemove = jskVar.d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            jskVar.e -= size;
        }
    }

    @Override // defpackage.pyk
    public final int a() {
        return this.e;
    }

    @Override // defpackage.wsk, defpackage.pyk
    public final boolean f(Object obj, Object obj2) {
        Collection collection = (Collection) this.d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.e++;
            return true;
        }
        Collection collectionN = n();
        if (!collectionN.add(obj2)) {
            c.e("New Collection violated the Collection spec");
            return false;
        }
        this.e++;
        this.d.put(obj, collectionN);
        return true;
    }

    @Override // defpackage.pyk
    public final void h() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.d.clear();
        this.e = 0;
    }

    @Override // defpackage.wsk
    public final Collection i() {
        return this instanceof tzk ? new ssk(this) : new psk(this);
    }

    @Override // defpackage.wsk
    public final Iterator j() {
        return new drk(this);
    }

    @Override // defpackage.wsk
    public final Map k() {
        return new jrk(this, this.d);
    }

    @Override // defpackage.wsk
    public final Set l() {
        return new rrk(this, this.d);
    }

    public abstract Collection n();

    public Collection o() {
        throw null;
    }

    public Collection p(Collection collection) {
        throw null;
    }

    public Collection q(Object obj, Collection collection) {
        throw null;
    }

    public final Collection s(Object obj) {
        Collection collectionN = (Collection) this.d.get(obj);
        if (collectionN == null) {
            collectionN = n();
        }
        return q(obj, collectionN);
    }

    public final Collection t(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return o();
        }
        Collection collectionN = n();
        collectionN.addAll(collection);
        this.e -= collection.size();
        collection.clear();
        return p(collectionN);
    }

    public final List u(Object obj, List list, ask askVar) {
        return list instanceof RandomAccess ? new urk(this, obj, list, askVar) : new gsk(this, obj, list, askVar);
    }
}
