package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class bn2 {
    public final hl2 a;

    public bn2() {
        HashSet hashSet = new HashSet();
        w8b w8bVarE = w8b.e();
        ArrayList arrayList = new ArrayList();
        g9b g9bVarA = g9b.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        dhc dhcVarA = dhc.a(w8bVarE);
        ArrayList arrayList3 = new ArrayList(arrayList);
        ghh ghhVar = ghh.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = g9bVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.a = new hl2(arrayList2, dhcVarA, -1, arrayList3, new ghh(arrayMap));
    }
}
