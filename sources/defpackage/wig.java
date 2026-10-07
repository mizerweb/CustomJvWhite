package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.StatsReport;

/* JADX INFO: loaded from: classes3.dex */
public final class wig {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ yig b;
    public final /* synthetic */ xig c;

    public wig(yig yigVar, xig xigVar) {
        this.b = yigVar;
        this.c = xigVar;
    }

    public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, rkg[] rkgVarArr, Map map, j42 j42Var) {
        ArrayList arrayList;
        statsReportArr2.getClass();
        map.getClass();
        yig yigVar = this.b;
        o3j o3jVar = yigVar.d;
        zvh zvhVarW = j42Var.w();
        o91 o91Var = (o91) o3jVar.a;
        skg skgVar = o91Var.d0;
        skgVar.e(statsReportArr2, rkgVarArr);
        o91Var.h(map, zvhVarW);
        if (o91Var.P) {
            a4e a4eVarD = a4e.d(statsReportArr, o91Var.N);
            p5a p5aVarC = skgVar.c(o91Var.j0.a);
            if (p5aVarC != null) {
                pk2 pk2VarC = a4eVarD.c();
                o91Var.O.c(p5aVarC, pk2VarC != null ? pk2VarC.i.equals("tcp") : false, a4eVarD.a);
            }
        }
        Iterator it = yigVar.h.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.a;
            if (!zHasNext) {
                break;
            }
            aak aakVar = (aak) it.next();
            long j = this.c.b;
            aakVar.getClass();
            if (j % 5 == 0) {
                arrayList.add(aakVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a4e a4eVarD2 = a4e.d(statsReportArr, yigVar.a);
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ((aak) it2.next()).a.n0.Q(a4eVarD2);
        }
        arrayList.clear();
    }
}
