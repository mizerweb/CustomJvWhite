package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class vw3 {
    public static final ThreadLocal a = ThreadLocal.withInitial(new uw3(0));

    public static final boolean a(boolean z, LinkedHashSet linkedHashSet, boolean z2, Set set, Object obj) {
        o75 o75Var = er3.g;
        if (z) {
            return linkedHashSet.add(obj);
        }
        if (z2) {
            return set.add(obj);
        }
        List listI = e9i.i(a.get());
        List list = listI;
        boolean z3 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (o75Var.d(it.next(), obj)) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            listI.add(obj);
        }
        return z3;
    }

    public static final List b(int i, int i2, List list) {
        r66 r66Var;
        while (true) {
            r66Var = r66.a;
            if (i < 0 || i > xw3.O0(list)) {
                break;
            }
            if (i2 == 0) {
                return xw3.Q0(ww3.u1(i, list));
            }
            if (i2 > 0) {
                int size = i2 + i;
                if (size > list.size()) {
                    size = list.size();
                }
                try {
                    return list.subList(i, size);
                } catch (Throwable unused) {
                    return r66Var;
                }
            }
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i3;
            i2 = i;
            i = i4;
        }
        return r66Var;
    }
}
