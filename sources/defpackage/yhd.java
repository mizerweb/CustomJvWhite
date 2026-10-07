package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yhd {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(vhd.a, 0);
        map.put(vhd.b, 1);
        map.put(vhd.c, 2);
        for (vhd vhdVar : map.keySet()) {
            a.append(((Integer) b.get(vhdVar)).intValue(), vhdVar);
        }
    }

    public static int a(vhd vhdVar) {
        Integer num = (Integer) b.get(vhdVar);
        if (num != null) {
            return num.intValue();
        }
        c.q(vhdVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static vhd b(int i) {
        vhd vhdVar = (vhd) a.get(i);
        if (vhdVar != null) {
            return vhdVar;
        }
        ore.p(zo5.h(i, "Unknown Priority for value "));
        return null;
    }
}
