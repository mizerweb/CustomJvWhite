package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class vr3 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public vr3(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            m09 m09Var = (m09) entry.getValue();
            List arrayList = (List) this.a.get(m09Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(m09Var, arrayList);
            }
            arrayList.add((wr3) entry.getKey());
        }
    }

    public static void a(List list, g19 g19Var, m09 m09Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                wr3 wr3Var = (wr3) list.get(size);
                Method method = wr3Var.b;
                try {
                    int i = wr3Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, g19Var);
                    } else if (i == 2) {
                        method.invoke(obj, g19Var, m09Var);
                    }
                } catch (IllegalAccessException e) {
                    qr7.o(e);
                    return;
                } catch (InvocationTargetException e2) {
                    ore.h("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
