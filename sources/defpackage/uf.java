package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class uf implements hc6 {
    public final rrc a;

    public uf(rrc rrcVar) {
        this.a = rrcVar;
    }

    @Override // defpackage.hc6
    public final void a(String str, b9b b9bVar, List list, lrc lrcVar, String str2) {
        ul9 ul9Var = new ul9();
        ul9Var.put("properties", b9bVar);
        if (lrcVar != null) {
            ul9Var.put("errorType", Integer.valueOf(lrcVar.a()));
        }
        if (str2 != null) {
            ul9Var.put("errorDesc", str2);
        }
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            List<ylc> list2 = list;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            for (ylc ylcVar : list2) {
                arrayList.add(p90.N(SdkMetricStatEvent.NAME_KEY, ylcVar.a, "duration", ylcVar.b));
            }
            ul9Var.put("spans", arrayList);
        }
        ul9 ul9VarB = ul9Var.b();
        boolean z = false;
        if (!str.equals("login") && lrcVar != null) {
            z = true;
        }
        ((ae9) this.a.f.getValue()).j("PERF", str, ul9VarB, z);
    }
}
