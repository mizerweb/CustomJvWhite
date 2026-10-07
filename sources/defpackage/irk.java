package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class irk implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ jrk c;

    public irk(jrk jrkVar) {
        this.c = jrkVar;
        this.a = jrkVar.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new wvk(key, this.c.e.q(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        vpk.f(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.e.e -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
