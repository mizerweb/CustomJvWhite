package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v2 implements c7b {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    @Override // defpackage.c7b
    public Collection a() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.a = collectionE;
        return collectionE;
    }

    @Override // defpackage.c7b
    public Map b() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.d = mapD;
        return mapD;
    }

    public boolean c(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c7b) {
            return b().equals(((c7b) obj).b());
        }
        return false;
    }

    public abstract Set f();

    public abstract Iterator g();

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // defpackage.c7b
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.b = setF;
        return setF;
    }

    @Override // defpackage.c7b
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }
}
