package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class xrk implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ ask c;

    public xrk(ask askVar) {
        this.c = askVar;
        Collection collection = askVar.b;
        this.b = collection;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        this.c.b();
        if (this.c.b == this.b) {
            return;
        }
        c.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        this.c.e.e--;
        this.c.c();
    }

    public xrk(ask askVar, Iterator it) {
        this.c = askVar;
        this.b = askVar.b;
        this.a = it;
    }
}
