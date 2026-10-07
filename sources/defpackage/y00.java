package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y00 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y00(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Iterable iterableSingleton;
        xn6 xn6Var;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                kw7 kw7Var = (kw7) ww3.t1(list);
                kw7 kw7Var2 = (kw7) ww3.D1(list);
                return s5h.y0("insertDataSourceResult: after iterate with insert, \n                        |first:" + (kw7Var != null ? Long.valueOf(kw7Var.getA()) : null) + ":" + (kw7Var != null ? Long.valueOf(kw7Var.getC()) : null) + ", \n                        |last:" + (kw7Var2 != null ? Long.valueOf(kw7Var2.getA()) : null) + ":" + (kw7Var2 != null ? Long.valueOf(kw7Var2.getC()) : null) + "\n                        |");
            case 1:
                qu6 qu6VarM0 = yhf.m0(new sw(1, list), new us5(22));
                us5 us5Var = new us5(23);
                Iterator it = qu6VarM0.iterator();
                if (it.hasNext()) {
                    Object objInvoke = us5Var.invoke(it.next());
                    if (it.hasNext()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add(objInvoke);
                        while (it.hasNext()) {
                            linkedHashSet.add(us5Var.invoke(it.next()));
                        }
                        iterableSingleton = linkedHashSet;
                    } else {
                        iterableSingleton = Collections.singleton(objInvoke);
                    }
                } else {
                    iterableSingleton = c76.a;
                }
                int iP0 = wm9.P0(yw3.W0(iterableSingleton, 10));
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                for (Object obj : iterableSingleton) {
                    long jLongValue = ((Number) obj).longValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            ore.f("List contains no element matching the predicate.");
                            return null;
                        }
                        xn6Var = (xn6) listIterator.previous();
                    } while (xn6Var.j() != jLongValue);
                    linkedHashMap.put(obj, xn6Var);
                }
                return linkedHashMap;
            case 2:
                kw7 kw7Var3 = (kw7) ww3.t1(list);
                Long lValueOf = kw7Var3 != null ? Long.valueOf(kw7Var3.getC()) : null;
                kw7 kw7Var4 = (kw7) ww3.D1(list);
                return "getHistoryItems, first:" + lValueOf + ", last:" + (kw7Var4 != null ? Long.valueOf(kw7Var4.getC()) : null);
            default:
                kw7 kw7Var5 = (kw7) ww3.t1(list);
                Long lValueOf2 = kw7Var5 != null ? Long.valueOf(kw7Var5.getC()) : null;
                kw7 kw7Var6 = (kw7) ww3.D1(list);
                return "getHistoryItems, first:" + lValueOf2 + ", last:" + (kw7Var6 != null ? Long.valueOf(kw7Var6.getC()) : null);
        }
    }
}
