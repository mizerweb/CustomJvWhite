package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i44 implements yc6 {
    @Override // defpackage.yc6
    public final lrc a(qrc qrcVar, String str, b9b b9bVar, List list, lrc lrcVar) {
        if (!r5h.X0(str) && (!list.isEmpty() || lrcVar != null)) {
            if (!list.isEmpty()) {
                ylc ylcVar = (ylc) ww3.t1(list);
                if (cqk.d(ylcVar != null ? (String) ylcVar.a : null, str)) {
                    if (!qrcVar.a.b && lrcVar == null) {
                        long jLongValue = ((Number) ylcVar.b).longValue();
                        Iterator it = yhf.l0(new sw(1, list), 1).iterator();
                        long jLongValue2 = 0;
                        while (it.hasNext()) {
                            jLongValue2 += ((Number) ((ylc) it.next()).b).longValue();
                        }
                        if (jLongValue != jLongValue2) {
                            return mrc.ROOT_SPAN_INVALID_DURATION;
                        }
                    }
                    List list2 = list;
                    Iterator it2 = yhf.l0(new sw(1, list2), 1).iterator();
                    while (it2.hasNext()) {
                        if (((Number) ((ylc) it2.next()).b).longValue() < 0) {
                            return mrc.NEGATIVE_DURATIONS;
                        }
                    }
                    Iterator it3 = yhf.l0(new sw(1, list2), 1).iterator();
                    while (it3.hasNext()) {
                        if (((Number) ((ylc) it3.next()).b).longValue() == 0) {
                            return mrc.ZERO_DURATIONS;
                        }
                    }
                }
            }
            return lrcVar;
        }
        return mrc.INVALID_SCHEMA;
    }
}
