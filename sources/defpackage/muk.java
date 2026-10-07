package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class muk extends AbstractSet {
    final /* synthetic */ evk a;

    public muk(evk evkVar) {
        this.a = evkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapO = this.a.o();
        if (mapO != null) {
            return mapO.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZ = this.a.z(entry.getKey());
            if (iZ != -1 && qpk.a(evk.m(this.a, iZ), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        evk evkVar = this.a;
        Map mapO = evkVar.o();
        return mapO != null ? mapO.entrySet().iterator() : new euk(evkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.a.o();
        if (mapO != null) {
            return mapO.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        evk evkVar = this.a;
        if (evkVar.u()) {
            return false;
        }
        int iY = evkVar.y();
        Object key = entry.getKey();
        Object value = entry.getValue();
        evk evkVar2 = this.a;
        int iB = hvk.b(key, value, iY, evk.l(evkVar2), evkVar2.a(), evkVar2.b(), evkVar2.c());
        if (iB == -1) {
            return false;
        }
        this.a.t(iB, iY);
        this.a.f--;
        this.a.r();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
