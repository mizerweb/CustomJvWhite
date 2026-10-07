package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lh implements vm2 {
    public final zqh a;
    public final se2 b;
    public final i4h c;

    public lh(zqh zqhVar, se2 se2Var, i4h i4hVar) {
        this.a = zqhVar;
        this.b = se2Var;
        this.c = i4hVar;
    }

    @Override // defpackage.vm2
    public final um2 a(le2 le2Var, Map map, zm2 zm2Var) throws Exception {
        int i;
        ArrayList arrayList;
        so2 so2Var = so2.e;
        se2 se2Var = this.b;
        int i2 = se2Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                qr7.j(bjl.b(se2Var.h), "Unsupported session mode: ");
                return null;
            }
            i = i2;
        }
        kjc kjcVarB = ikl.b(se2Var, this.c, map);
        ArrayList arrayList2 = kjcVarB.a;
        if (arrayList2.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + se2Var);
            zm2Var.b();
            return so2Var;
        }
        ArrayList arrayList3 = se2Var.d;
        if (arrayList3 != null) {
            arrayList = new ArrayList(yw3.W0(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                xjc xjcVar = (xjc) ww3.K1(((fi8) it.next()).a.a);
                arrayList.add(new rg8(xjcVar.a.getWidth(), xjcVar.a.getHeight(), xjcVar.b));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((rg8) it2.next()).c != ((rg8) arrayList.get(0)).c) {
                    ore.k("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (le2Var.u0(new omf(i, arrayList, arrayList2, (Executor) this.a.j.getValue(), zm2Var, se2Var.f, se2Var.g))) {
            return new tm2(kjcVarB.b, kjcVarB.d);
        }
        Log.w("CXCP", "Failed to create capture session from " + le2Var + " for " + zm2Var + '!');
        zm2Var.b();
        return so2Var;
    }
}
