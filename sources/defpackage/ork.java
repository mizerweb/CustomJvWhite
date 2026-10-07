package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ork implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ rrk c;

    public ork(rrk rrkVar, Iterator it) {
        this.b = it;
        this.c = rrkVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        vpk.f(this.a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        this.c.b.e -= collection.size();
        collection.clear();
        this.a = null;
    }
}
