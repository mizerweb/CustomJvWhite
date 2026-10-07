package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class tbh {
    public static final t4h e = t4h.DEFAULT;
    public static final rbh[] f = {rbh.S720P_16_9, rbh.S1080P_4_3, rbh.S1080P_16_9, rbh.S1440P_16_9, rbh.UHD, rbh.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final sbh a;
    public final rbh b;
    public final t4h c;
    public final int d;

    static {
        Map mapQ0 = wm9.Q0(new ylc(sbh.b, 35), new ylc(sbh.c, Integer.valueOf(np0.n)), new ylc(sbh.d, 4101), new ylc(sbh.e, 32), new ylc(sbh.a, 34));
        g = mapQ0;
        Set<Map.Entry> setEntrySet = mapQ0.entrySet();
        int iP0 = wm9.P0(yw3.W0(setEntrySet, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (sbh) entry.getKey());
        }
        h = linkedHashMap;
    }

    public tbh(sbh sbhVar, rbh rbhVar, t4h t4hVar) {
        this.a = sbhVar;
        this.b = rbhVar;
        this.c = t4hVar;
        Integer num = (Integer) g.get(sbhVar);
        this.d = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbh)) {
            return false;
        }
        tbh tbhVar = (tbh) obj;
        return this.a == tbhVar.a && this.b == tbhVar.b && this.c == tbhVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
