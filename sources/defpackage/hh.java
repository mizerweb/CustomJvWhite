package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hh implements vm2 {
    public final /* synthetic */ int a;
    public final i4h b;
    public final se2 c;

    public /* synthetic */ hh(i4h i4hVar, se2 se2Var, int i) {
        this.a = i;
        this.b = i4hVar;
        this.c = se2Var;
    }

    @Override // defpackage.vm2
    public final um2 a(le2 le2Var, Map map, zm2 zm2Var) throws Exception {
        boolean zI;
        int i = this.a;
        s66 s66Var = s66.a;
        i4h i4hVar = this.b;
        se2 se2Var = this.c;
        switch (i) {
            case 0:
                so2 so2Var = so2.e;
                ArrayList arrayList = se2Var.d;
                if (arrayList != null) {
                    xjc xjcVar = (xjc) ww3.K1(((fi8) ww3.K1(arrayList)).a.a);
                    InputConfiguration inputConfiguration = new InputConfiguration(xjcVar.a.getWidth(), xjcVar.a.getHeight(), xjcVar.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!le2Var.P0(inputConfiguration, arrayList2, zm2Var)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + le2Var + " for " + zm2Var + '!');
                        zm2Var.b();
                        return so2Var;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!le2Var.z0(arrayList3, zm2Var)) {
                        Log.w("CXCP", "Failed to create captures session from " + le2Var + " for " + zm2Var + '!');
                        zm2Var.b();
                        return so2Var;
                    }
                }
                return new tm2(s66Var, ikl.a(map, i4hVar));
            default:
                so2 so2Var2 = so2.e;
                kjc kjcVarB = ikl.b(se2Var, i4hVar, map);
                ArrayList arrayList4 = kjcVarB.a;
                if (arrayList4.isEmpty()) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + se2Var);
                    zm2Var.b();
                    return so2Var2;
                }
                ArrayList arrayList5 = se2Var.d;
                if (arrayList5 == null) {
                    zI = le2Var.D0(arrayList4, zm2Var);
                } else {
                    xjc xjcVar2 = (xjc) ww3.K1(((fi8) ww3.K1(arrayList5)).a.a);
                    zI = le2Var.I(new rg8(xjcVar2.a.getWidth(), xjcVar2.a.getHeight(), xjcVar2.b), arrayList4, zm2Var);
                }
                if (zI) {
                    return new tm2(s66Var, kjcVarB.d);
                }
                Log.w("CXCP", "Failed to create capture session from " + le2Var + " for " + zm2Var + '!');
                zm2Var.b();
                return so2Var2;
        }
    }
}
