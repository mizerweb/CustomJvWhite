package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sa8 {
    public final long a;
    public final ConcurrentHashMap b;
    public volatile long c;

    public sa8() {
        ghb ghbVar = ew5.b;
        this.a = ew5.g(qe7.O(24, lw5.HOURS));
        this.b = new ConcurrentHashMap(20);
    }

    public final void a(List list) {
        this.b.clear();
        ConcurrentHashMap concurrentHashMap = this.b;
        List list2 = list;
        int iP0 = wm9.P0(yw3.W0(list2, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        for (Object obj : list2) {
            linkedHashMap.put(Long.valueOf(((st2) obj).a), obj);
        }
        concurrentHashMap.putAll(linkedHashMap);
        this.c = System.currentTimeMillis();
    }
}
