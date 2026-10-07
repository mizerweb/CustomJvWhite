package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ww3 extends cx3 {
    public static Object A1(Iterable iterable) {
        if (iterable instanceof List) {
            return B1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            ore.f("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object B1(List list) {
        if (!list.isEmpty()) {
            return list.get(xw3.O0(list));
        }
        ore.f("List is empty.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object C1(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof List) {
            List list = (List) abstractCollection;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = abstractCollection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object D1(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable E1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List F1(Iterable iterable, Iterable iterable2) {
        Collection collectionC1 = cx3.c1(iterable2);
        if (collectionC1.isEmpty()) {
            return T1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionC1.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList G1(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            cx3.Z0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList H1(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object I1(Collection collection) {
        h4e h4eVar = i4e.a;
        if (collection.isEmpty()) {
            ore.f("Collection is empty.");
            return null;
        }
        return n1(collection, i4e.b.d(collection.size()));
    }

    public static List J1(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return T1(iterable);
        }
        List listV1 = V1(iterable);
        Collections.reverse(listV1);
        return listV1;
    }

    public static Object K1(List list) {
        int size = list.size();
        if (size == 0) {
            ore.f("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        ore.p("List has more than one element.");
        return null;
    }

    public static List L1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listV1 = V1(iterable);
            if (((ArrayList) listV1).size() > 1) {
                Collections.sort(listV1);
            }
            return listV1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return T1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    public static List M1(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listV1 = V1(iterable);
            bx3.Y0(listV1, comparator);
            return listV1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return T1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static List N1(Iterable iterable, int i) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return r66.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return T1(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(q1(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return xw3.S0(arrayList);
    }

    public static List O1(int i, List list) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return r66.a;
        }
        int size = list.size();
        if (i >= size) {
            return T1(list);
        }
        if (i == 1) {
            return Collections.singletonList(B1(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static void P1(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] Q1(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet R1(Iterable iterable) {
        HashSet hashSet = new HashSet(wm9.P0(yw3.W0(iterable, 12)));
        P1(iterable, hashSet);
        return hashSet;
    }

    public static int[] S1(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List T1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return xw3.S0(V1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r66.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] U1(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final List V1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        P1(iterable, arrayList);
        return arrayList;
    }

    public static Set W1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        P1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set X1(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(collection.size()));
                P1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            P1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return c76.a;
    }

    public static ArrayList Y1(Iterable iterable, int i, int i2) {
        Iterator it;
        qe7.k(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            if (it2.hasNext()) {
                thf thfVar = new thf();
                zag zagVar = new zag(i, i2, it2, thfVar);
                zagVar.h = thfVar;
                thfVar.d = zagVar;
                it = thfVar;
            } else {
                it = q66.a;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static ArrayList Z1(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(yw3.W0(iterable, 10), yw3.W0(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new ylc(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int g1(int i, List list) {
        if (i >= 0 && i <= xw3.O0(list)) {
            return xw3.O0(list) - i;
        }
        StringBuilder sbY = zo5.y(i, "Element index ", " must be in range [");
        sbY.append(new hj8(0, xw3.O0(list), 1));
        sbY.append("].");
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    public static final int h1(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbY = zo5.y(i, "Position index ", " must be in range [");
        sbY.append(new hj8(0, list.size(), 1));
        sbY.append("].");
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    public static double i1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i++;
            if (i < 0) {
                xw3.U0();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    public static boolean j1(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return v1(iterable, obj) >= 0;
    }

    public static List k1(Iterable iterable) {
        return T1(W1(iterable));
    }

    public static List l1(Iterable iterable, int i) {
        ArrayList arrayList;
        if (i < 0) {
            c.o(c0a.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return T1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return r66.a;
            }
            if (size == 1) {
                return Collections.singletonList(A1(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return xw3.S0(arrayList);
    }

    public static List m1(int i, List list) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return N1(list2, size);
    }

    public static Object n1(Iterable iterable, int i) {
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        hb8 hb8Var = new hb8(i, 4);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            hb8Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            hb8Var.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        hb8Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static List o1(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        p1(iterable, arrayList);
        return arrayList;
    }

    public static void p1(Iterable iterable, Collection collection) {
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static Object q1(Iterable iterable) {
        if (iterable instanceof List) {
            return r1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        ore.f("Collection is empty.");
        return null;
    }

    public static Object r1(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ore.f("List is empty.");
        return null;
    }

    public static Object s1(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object t1(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object u1(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int v1(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            if (cqk.d(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet w1(Iterable iterable, Iterable iterable2) {
        Collection collectionC1 = cx3.c1(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionC1.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static void x1(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, String str, cf7 cf7Var) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                sb8.d(sb, obj, cf7Var);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append((CharSequence) str);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void y1(Iterable iterable, StringBuilder sb, String str, cf7 cf7Var, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str2 = str;
        CharSequence charSequence = (i & 4) != 0 ? "" : "[";
        String str3 = (i & 8) == 0 ? "]" : "";
        int i2 = (i & 16) != 0 ? -1 : 5;
        if ((i & 64) != 0) {
            cf7Var = null;
        }
        x1(iterable, sb, str2, charSequence, str3, i2, "...", cf7Var);
    }

    public static String z1(Iterable iterable, String str, String str2, String str3, cf7 cf7Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        int i2 = (i & 8) != 0 ? -1 : 5;
        if ((i & 32) != 0) {
            cf7Var = null;
        }
        StringBuilder sb = new StringBuilder();
        x1(iterable, sb, str4, str5, str6, i2, "...", cf7Var);
        return sb.toString();
    }
}
