package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l1e {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(pi0.h, Range.create(2160, 4319));
        map.put(pi0.g, Range.create(1080, 1439));
        map.put(pi0.f, Range.create(720, 1079));
        map.put(pi0.e, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, ix.a);
        map2.put(1, ix.c);
    }

    public l1e(List list, HashMap map) {
        HashMap map2;
        Integer num;
        pi0 pi0Var;
        HashMap map3 = b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = c;
            if (!zHasNext) {
                break;
            }
            pi0 pi0Var2 = (pi0) it.next();
            this.a.put(new oi0(pi0Var2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.a.put(new oi0(pi0Var2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.a.get(new oi0((pi0) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    pi0Var = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    pi0Var = (pi0) entry2.getKey();
                    break;
                }
            }
            if (pi0Var != null) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (ix.a(size, (Rational) entry3.getValue(), mag.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.a.get(new oi0(pi0Var, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.a.entrySet()) {
            Size size2 = (Size) map.get(((oi0) entry4.getKey()).a);
            if (size2 != null) {
                Size size3 = mag.a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: k1e
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iA = mag.a((Size) obj);
                        int i = height;
                        return Math.abs(iA - i) - Math.abs(mag.a((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
