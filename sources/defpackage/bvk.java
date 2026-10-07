package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class bvk extends AbstractCollection {
    final /* synthetic */ evk a;

    public bvk(evk evkVar) {
        this.a = evkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        evk evkVar = this.a;
        Map mapO = evkVar.o();
        return mapO != null ? mapO.values().iterator() : new iuk(evkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
