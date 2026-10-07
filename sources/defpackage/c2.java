package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c2 extends v2 implements o79, Serializable {
    public final transient Map e;
    public transient int f;

    public c2(Map map) {
        lvb.R(map.isEmpty());
        this.e = map;
    }

    @Override // defpackage.c7b
    public final void clear() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // defpackage.v2
    public Map d() {
        return new j2(this, this.e);
    }

    @Override // defpackage.v2
    public final Collection e() {
        return new u2(0, this);
    }

    @Override // defpackage.v2
    public Set f() {
        return new k2(this, this.e);
    }

    @Override // defpackage.v2
    public final Iterator g() {
        return new g2(this, 1);
    }

    public abstract Collection h();

    @Override // defpackage.c7b
    /* JADX INFO: renamed from: i */
    public final List get(Object obj) {
        Collection collectionH = (Collection) this.e.get(obj);
        if (collectionH == null) {
            collectionH = h();
        }
        List list = (List) collectionH;
        return list instanceof RandomAccess ? new n2(this, obj, list, null) : new r2(this, obj, list, null);
    }

    public final boolean j(Object obj, Object obj2) {
        Map map = this.e;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection collectionH = h();
        if (!collectionH.add(obj2)) {
            c.e("New Collection violated the Collection spec");
            return false;
        }
        this.f++;
        map.put(obj, collectionH);
        return true;
    }

    public final Collection k() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        u2 u2Var = new u2(1, this);
        this.c = u2Var;
        return u2Var;
    }

    @Override // defpackage.c7b
    public final int size() {
        return this.f;
    }
}
