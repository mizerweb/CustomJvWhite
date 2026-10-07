package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class s44 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractMap b;

    public /* synthetic */ s44(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((hbg) this.b).f((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                ((u44) abstractMap).clear();
                break;
            case 1:
                ((u44) abstractMap).clear();
                break;
            default:
                ((hbg) abstractMap).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                u44 u44Var = (u44) abstractMap;
                Map mapC = u44Var.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = u44Var.e(entry.getKey());
                    if (iE != -1 && ndl.c(u44Var.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((u44) abstractMap).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((hbg) abstractMap).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                u44 u44Var = (u44) abstractMap;
                Map mapC = u44Var.c();
                return mapC != null ? mapC.entrySet().iterator() : new r44(u44Var, 1);
            case 1:
                u44 u44Var2 = (u44) abstractMap;
                Map mapC2 = u44Var2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new r44(u44Var2, 0);
            default:
                return new lbg((hbg) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                u44 u44Var = (u44) abstractMap;
                Map mapC = u44Var.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (u44Var.g()) {
                    return false;
                }
                int iD = u44Var.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = u44Var.a;
                Objects.requireNonNull(obj2);
                int iD2 = mnl.d(key, value, iD, obj2, u44Var.i(), u44Var.j(), u44Var.k());
                if (iD2 == -1) {
                    return false;
                }
                u44Var.f(iD2, iD);
                u44Var.f--;
                u44Var.e += 32;
                return true;
            case 1:
                u44 u44Var2 = (u44) abstractMap;
                Map mapC2 = u44Var2.c();
                if (mapC2 != null) {
                    return mapC2.keySet().remove(obj);
                }
                return u44Var2.h(obj) != u44.j;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((hbg) abstractMap).remove(entry2.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                return ((u44) abstractMap).size();
            case 1:
                return ((u44) abstractMap).size();
            default:
                return ((hbg) abstractMap).size();
        }
    }
}
