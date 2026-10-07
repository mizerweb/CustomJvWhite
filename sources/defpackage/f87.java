package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f87 {
    public static final HashMap a;

    static {
        HashMap mapO0 = wm9.O0(new ylc(4, e87.a), new ylc(3, e87.b), new ylc(2, e87.c), new ylc(1, e87.d), new ylc(0, e87.e));
        a = mapO0;
        Set<Map.Entry> setEntrySet = mapO0.entrySet();
        int iP0 = wm9.P0(yw3.W0(setEntrySet, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put((e87) entry.getValue(), vqi.E(((Number) entry.getKey()).intValue()));
        }
    }
}
