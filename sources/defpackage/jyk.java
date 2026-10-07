package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class jyk extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        dyk dykVar = new dyk(this);
        this.b = dykVar;
        return dykVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        gyk gykVar = new gyk(this);
        this.c = gykVar;
        return gykVar;
    }
}
