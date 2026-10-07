package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b92 {
    public final rt2 a;
    public final vg4 b;
    public final fda c;
    public ArrayList d;

    public b92(fda fdaVar, vg4 vg4Var) {
        this.b = vg4Var;
        this.c = fdaVar;
        this.a = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.c.a.a));
        ArrayList arrayList2 = this.d;
        if ((arrayList2 == null ? 0 : arrayList2.size()) > 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((b92) it.next()).c.a.a));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b92.class == obj.getClass()) {
            b92 b92Var = (b92) obj;
            rt2 rt2Var = b92Var.a;
            rt2 rt2Var2 = this.a;
            if (rt2Var2 == null ? rt2Var == null : rt2Var2.equals(rt2Var)) {
                vg4 vg4Var = b92Var.b;
                vg4 vg4Var2 = this.b;
                if (vg4Var2 != null) {
                    if (vg4Var2 != vg4Var) {
                        return false;
                    }
                } else if (vg4Var == null) {
                }
                fda fdaVar = b92Var.c;
                fda fdaVar2 = this.c;
                if (fdaVar2 == null ? fdaVar == null : fdaVar2.equals(fdaVar)) {
                    ArrayList arrayList = this.d;
                    ArrayList arrayList2 = b92Var.d;
                    if (arrayList != null) {
                        return arrayList.equals(arrayList2);
                    }
                    if (arrayList2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rt2 rt2Var = this.a;
        int iHashCode = (rt2Var != null ? rt2Var.hashCode() : 0) * 31;
        vg4 vg4Var = this.b;
        int iHashCode2 = (iHashCode + (vg4Var != null ? vg4Var.hashCode() : 0)) * 31;
        fda fdaVar = this.c;
        int iHashCode3 = (iHashCode2 + (fdaVar != null ? fdaVar.hashCode() : 0)) * 31;
        ArrayList arrayList = this.d;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public b92(rt2 rt2Var, fda fdaVar) {
        this.a = rt2Var;
        this.c = fdaVar;
        this.b = null;
    }
}
