package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class d25 {
    public static final d25 b;
    public final HashMap a;

    static {
        d25 d25Var = new d25(new LinkedHashMap());
        f55.y(d25Var);
        b = d25Var;
    }

    public d25(d25 d25Var) {
        this.a = new HashMap(d25Var.a);
    }

    public final boolean a(String str, boolean z) {
        Object objValueOf = Boolean.valueOf(z);
        Object obj = this.a.get(str);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final int b(String str, int i) {
        Object objValueOf = Integer.valueOf(i);
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final long c(String str, long j) {
        Object objValueOf = Long.valueOf(j);
        Object obj = this.a.get(str);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final String d(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] e(String str) {
        Object obj = this.a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        c25 c25Var = new c25(1, obj);
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c25Var.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && d25.class.equals(obj.getClass())) {
                HashMap map = ((d25) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (cqk.d(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = a.O0(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return zo5.w(new StringBuilder("Data {"), ww3.z1(this.a.entrySet(), null, null, null, new w83(21), 31), "}");
    }

    public d25(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
