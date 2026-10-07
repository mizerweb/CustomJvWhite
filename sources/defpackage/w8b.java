package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class w8b extends dhc {
    public static w8b e() {
        return new w8b(new TreeMap(dhc.b));
    }

    public static w8b h(t94 t94Var) {
        TreeMap treeMap = new TreeMap(dhc.b);
        for (bh0 bh0Var : t94Var.c()) {
            Set<s94> setD = t94Var.d(bh0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (s94 s94Var : setD) {
                arrayMap.put(s94Var, t94Var.k(bh0Var, s94Var));
            }
            treeMap.put(bh0Var, arrayMap);
        }
        return new w8b(treeMap);
    }

    public final void l(bh0 bh0Var, s94 s94Var, Object obj) {
        s94 s94Var2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(bh0Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(bh0Var, arrayMap);
            arrayMap.put(s94Var, obj);
            return;
        }
        s94 s94Var3 = (s94) Collections.min(map.keySet());
        if (Objects.equals(map.get(s94Var3), obj) || s94Var3 != (s94Var2 = s94.c) || s94Var != s94Var2) {
            map.put(s94Var, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(bh0Var.a);
        sb.append(", existing value (");
        sb.append(s94Var3);
        Object obj2 = map.get(s94Var3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(s94Var);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void m(bh0 bh0Var, Object obj) {
        l(bh0Var, s94.d, obj);
    }

    public final void o(bh0 bh0Var) {
        this.a.remove(bh0Var);
    }
}
