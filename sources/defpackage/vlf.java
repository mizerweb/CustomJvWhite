package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vlf extends mjf {
    public final long b;
    public final String c = vlf.class.getName();

    public vlf(long j) {
        this.b = j;
    }

    @Override // defpackage.mjf
    public final void B() {
        List<sfa> list;
        qw2 qw2VarI = i();
        long j = this.b;
        rt2 rt2VarN = qw2VarI.N(j);
        String str = this.c;
        if (rt2VarN != null) {
            nx2 nx2Var = rt2VarN.b;
            long j2 = 0;
            if (nx2Var.e.isEmpty()) {
                fda fdaVar = rt2VarN.c;
                if (fdaVar != null) {
                    j2 = fdaVar.a.c;
                }
            } else {
                for (Map.Entry entry : nx2Var.e.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    long jLongValue2 = ((Number) entry.getValue()).longValue();
                    if (jLongValue != t().a.t() && jLongValue2 > j2) {
                        j2 = jLongValue2;
                    }
                }
            }
            long j3 = j2;
            qfa qfaVarS = s();
            uoa uoaVarC = qfaVarS.b.c();
            long jT = qfaVarS.d.a.t();
            ose oseVar = (ose) uoaVarC;
            wna wnaVarH = oseVar.h();
            List list2 = xfa.b;
            List list3 = xfa.b;
            toa toaVar = (toa) wnaVarH;
            List list4 = (List) ch3.G(toaVar.a, false, true, new doa(0, this.b, jT, j3, wja.DELETED, toaVar));
            ArrayList arrayList = new ArrayList(yw3.W0(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(oseVar.b((gga) it.next()));
            }
            boolean zIsEmpty = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty) {
                gm0.n(str, zo5.g(arrayList.size(), j, "updated messages for chat ", " count = "));
                list = arrayList;
            }
        } else {
            list = r66.a;
        }
        gm0.n(str, zo5.g(list.size(), j, "messages for chat ", " to update = "));
        if (list.isEmpty()) {
            return;
        }
        rt2 rt2VarN2 = i().N(j);
        for (sfa sfaVar : list) {
            njf njfVar = null;
            if ((rt2VarN2 != null ? rt2VarN2.c : null) != null && rt2VarN2.c.a.a == sfaVar.a) {
                i().g0(this.b, sfaVar, false, null);
            }
            njf njfVar2 = this.a;
            if (njfVar2 != null) {
                njfVar = njfVar2;
            }
            ((t51) njfVar.d.getValue()).c(new kfi(sfaVar.h, sfaVar.a, false));
        }
        gm0.n(str, "records updated " + list.size());
    }
}
