package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class vuk extends AbstractSet {
    final /* synthetic */ evk a;

    public vuk(evk evkVar) {
        this.a = evkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        evk evkVar = this.a;
        Map mapO = evkVar.o();
        return mapO != null ? mapO.keySet().iterator() : new itk(evkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.a.o();
        if (mapO != null) {
            return mapO.keySet().remove(obj);
        }
        return this.a.B(obj) != evk.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
