package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface baa {
    static ArrayList f(rt2 rt2Var, List list, Map map) {
        List<vg4> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (vg4 vg4Var : list2) {
            int i = rt2Var.v0(vg4Var.v()) ? 1 : rt2Var.Y(vg4Var.v()) ? 2 : 3;
            ylc ylcVar = (ylc) map.get(Long.valueOf(vg4Var.v()));
            long jLongValue = 0;
            long jLongValue2 = ylcVar != null ? ((Number) ylcVar.a).longValue() : 0L;
            if (ylcVar != null) {
                jLongValue = ((Number) ylcVar.b).longValue();
            }
            arrayList.add(new n63(vg4Var, i, jLongValue2, jLongValue));
        }
        return arrayList;
    }

    boolean a();

    r8e b();

    xx6 c();

    void cancel();

    void d();

    void e(String str);

    void g();
}
