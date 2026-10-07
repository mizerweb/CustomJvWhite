package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class lof extends p90 {
    public static LinkedHashSet W(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(objArr.length));
        a.l1(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet X(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && cqk.d(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set Y(Set set, Iterable iterable) {
        Collection<?> collectionC1 = cx3.c1(iterable);
        if (collectionC1.isEmpty()) {
            return ww3.X1(set);
        }
        if (!(collectionC1 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionC1);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionC1).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet Z(Set set, Iterable iterable) {
        int size;
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(size));
        linkedHashSet.addAll(set);
        cx3.Z0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet a0(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set b0(Object... objArr) {
        return a.p1(objArr);
    }
}
