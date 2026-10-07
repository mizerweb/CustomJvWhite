package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oj9 {
    public final LinkedHashMap a;

    public oj9(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public kig a(iyj iyjVar) {
        return (kig) this.a.remove(iyjVar);
    }

    public List b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (cqk.d(((iyj) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((iyj) it.next());
        }
        return ww3.T1(linkedHashMap.values());
    }

    public kig c(iyj iyjVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object kigVar = linkedHashMap.get(iyjVar);
        if (kigVar == null) {
            kigVar = new kig(iyjVar);
            linkedHashMap.put(iyjVar, kigVar);
        }
        return (kig) kigVar;
    }
}
