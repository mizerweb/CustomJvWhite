package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
abstract class wsk implements pyk {
    private transient Collection a;
    private transient Set b;
    private transient Map c;

    @Override // defpackage.pyk
    public final Set c() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setL = l();
        this.b = setL;
        return setL;
    }

    @Override // defpackage.pyk
    public final boolean d(Object obj, Object obj2) {
        Collection collection = ((jrk) g()).get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.pyk
    public final boolean e(Object obj, Object obj2) {
        Collection collection = ((jrk) g()).get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pyk) {
            return g().equals(((pyk) obj).g());
        }
        return false;
    }

    @Override // defpackage.pyk
    public boolean f(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.pyk
    public final Map g() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapK = k();
        this.c = mapK;
        return mapK;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public abstract Collection i();

    public abstract Iterator j();

    public abstract Map k();

    public abstract Set l();

    public final Collection m() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionI = i();
        this.a = collectionI;
        return collectionI;
    }

    public final String toString() {
        return g().toString();
    }
}
