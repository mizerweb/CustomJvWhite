package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mbc {
    public static final nbc[] d = {nbc.SPACE, nbc.FEB23, nbc.MAR8, nbc.NATURE, nbc.NEON, nbc.MOSCOW, nbc.LEBEDEV, nbc.SIMPLE};
    public final ifh a;
    public final Map b;
    public final ConcurrentHashMap c;

    public mbc(ifh ifhVar) {
        this.a = ifhVar;
        nbc[] nbcVarArr = d;
        this.b = Collections.synchronizedMap(new LinkedHashMap(nbcVarArr.length));
        this.c = new ConcurrentHashMap(nbcVarArr.length * 2);
        for (nbc nbcVar : nbcVarArr) {
            b(nbcVar.c, nbcVar);
        }
    }

    public final nbc a(String str) {
        return (nbc) this.b.computeIfAbsent(str, new mm(13, new ol(11, this, str)));
    }

    public final void b(String str, nbc nbcVar) {
        this.b.put(str, nbcVar);
        kbc kbcVar = nbcVar.a;
        kbc kbcVar2 = nbcVar.b;
        String name = kbcVar2.getName();
        ConcurrentHashMap concurrentHashMap = this.c;
        concurrentHashMap.put(name, kbcVar2);
        concurrentHashMap.put(kbcVar.getName(), kbcVar);
        for (nbc nbcVar2 : d) {
            if (nbcVar2.c.equals(str)) {
                return;
            }
        }
        ((SharedPreferences) this.a.getValue()).edit();
        oel.c();
        throw null;
    }
}
