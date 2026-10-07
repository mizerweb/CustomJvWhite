package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j8f {
    public static final r6a a = new r6a((Object) null, (Object) null, (Object) null);
    public static r6a b;

    public static boolean a(List list, Object obj) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!ndl.c(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !ndl.c(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static int b(c98 c98Var, Object obj) {
        int size = c98Var.size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(c98Var.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int c(c98 c98Var, Object obj) {
        for (int size = c98Var.size() - 1; size >= 0; size--) {
            if (obj.equals(c98Var.get(size))) {
                return size;
            }
        }
        return -1;
    }

    public static ArrayList d(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList e(Object... objArr) {
        int length = objArr.length;
        oc9.p(length, "arraySize");
        ArrayList arrayList = new ArrayList(k4m.g(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList f(mf7 mf7Var, List list) {
        return list instanceof RandomAccess ? new w89(mf7Var, list) : new x89(mf7Var, list);
    }

    public static int g(int i, int i2) {
        if (i2 < 0) {
            c.e("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
