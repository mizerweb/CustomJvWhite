package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class cx3 extends bx3 {
    public static void Z0(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void a1(AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.addAll(Arrays.asList(objArr));
    }

    public static void b1(AbstractList abstractList, ohf ohfVar) {
        Iterator it = ohfVar.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }

    public static final Collection c1(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : ww3.T1(iterable);
    }

    public static void d1(List list, cf7 cf7Var) {
        int iO0;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof uv8) && !(list instanceof vv8)) {
                e9i.I0(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Boolean) cf7Var.invoke(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                return;
            } catch (ClassCastException e) {
                cqk.J(e, e9i.class.getName());
                throw e;
            }
        }
        int iO1 = xw3.O0(list);
        int i = 0;
        if (iO1 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) cf7Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iO1) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iO0 = xw3.O0(list))) {
            return;
        }
        while (true) {
            list.remove(iO0);
            if (iO0 == i) {
                return;
            } else {
                iO0--;
            }
        }
    }

    public static Object e1(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        ore.f("List is empty.");
        return null;
    }

    public static Object f1(List list) {
        if (!list.isEmpty()) {
            return list.remove(xw3.O0(list));
        }
        ore.f("List is empty.");
        return null;
    }
}
