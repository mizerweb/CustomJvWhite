package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rd9 extends hih {
    public rd9(List list) {
        super(null);
        if (list == null || list.isEmpty()) {
            ore.p("status can't be null or empty");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kp kpVar = (kp) it.next();
            kpVar.getClass();
            ul9 ul9Var = new ul9();
            ul9Var.put("time", Long.valueOf(kpVar.a));
            ul9Var.put("userId", Long.valueOf(kpVar.b));
            ul9Var.put("type", kpVar.d);
            ul9Var.put("event", kpVar.e);
            Map map = kpVar.f;
            if (map != null) {
                ul9Var.put("params", map);
            }
            long j = kpVar.c;
            Long lValueOf = j <= 0 ? null : Long.valueOf(j);
            if (lValueOf != null) {
                ul9Var.put("sessionId", Long.valueOf(lValueOf.longValue()));
            }
            arrayList.add(ul9Var.b());
        }
        d("events", arrayList);
    }

    @Override // defpackage.hih
    public final short k() {
        lhb lhbVar = kfc.c;
        return (short) 5;
    }

    @Override // defpackage.hih
    public final boolean o() {
        return true;
    }
}
