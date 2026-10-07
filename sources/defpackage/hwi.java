package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hwi {
    public static final LinkedHashMap a;

    static {
        ma6 ma6Var = sne.c;
        int iP0 = wm9.P0(yw3.W0(ma6Var, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            Object next = y1Var.next();
            linkedHashMap.put(Integer.valueOf(((sne) next).a), next);
        }
        a = linkedHashMap;
    }
}
