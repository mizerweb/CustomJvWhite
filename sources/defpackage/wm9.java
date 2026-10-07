package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wm9 extends lvb {
    public static Object N0(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap O0(ylc... ylcVarArr) {
        HashMap map = new HashMap(P0(ylcVarArr.length));
        U0(map, ylcVarArr);
        return map;
    }

    public static int P0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map Q0(ylc... ylcVarArr) {
        if (ylcVarArr.length <= 0) {
            return s66.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0(ylcVarArr.length));
        U0(linkedHashMap, ylcVarArr);
        return linkedHashMap;
    }

    public static Map R0(Map map, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        int size = linkedHashMap.size();
        if (size == 0) {
            return s66.a;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static LinkedHashMap S0(ylc... ylcVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0(ylcVarArr.length));
        U0(linkedHashMap, ylcVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap T0(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void U0(HashMap map, ylc[] ylcVarArr) {
        for (ylc ylcVar : ylcVarArr) {
            map.put(ylcVar.a, ylcVar.b);
        }
    }

    public static void V0(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ylc ylcVar = (ylc) it.next();
            map.put(ylcVar.a, ylcVar.b);
        }
    }

    public static Map W0(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        s66 s66Var = s66.a;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            V0(linkedHashMap, iterable);
            int size = linkedHashMap.size();
            if (size == 0) {
                return s66Var;
            }
            if (size != 1) {
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return s66Var;
        }
        if (size2 == 1) {
            ylc ylcVar = (ylc) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            return Collections.singletonMap(ylcVar.a, ylcVar.b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0(collection.size()));
        V0(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map X0(Map map) {
        int size = map.size();
        if (size == 0) {
            return s66.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
