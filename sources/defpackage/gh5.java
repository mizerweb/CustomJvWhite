package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gh5 {
    public final ny8 a;

    public gh5(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(long j, long j2, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            pvb pvbVar = (pvb) this.a.getValue();
            List listS = c0a.s(jLongValue);
            int i = z ? -1 : 0;
            if (pvbVar.j(j)) {
                d73 d73Var = new d73(i, 0, pvbVar.u().a.g(), j, j2, p63.MEMBER, e73.REMOVE, listS, true);
                if (i == 0) {
                    pvb.t(pvbVar, d73Var);
                } else {
                    pvb.s(pvbVar, d73Var);
                }
            }
        }
    }
}
