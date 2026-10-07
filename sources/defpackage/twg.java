package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class twg {
    public final mjg a;
    public final r8e b;

    public twg() {
        mjg mjgVarA = p90.a(r66.a);
        this.a = mjgVarA;
        this.b = new r8e(mjgVarA);
    }

    public final void a(List list) {
        mjg mjgVar;
        Object value;
        ArrayList arrayList;
        do {
            mjgVar = this.a;
            value = mjgVar.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                hyg hygVar = (hyg) obj;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!cqk.d(((hyg) it.next()).j, hygVar.j));
                }
                arrayList.add(obj);
            }
        } while (!mjgVar.h(value, ww3.G1(list, arrayList)));
    }

    public final void b(long j, azg azgVar) {
        mjg mjgVar;
        Object value;
        ArrayList arrayList;
        Long l;
        do {
            mjgVar = this.a;
            value = mjgVar.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                hyg hygVar = (hyg) obj;
                if (!cqk.d(hygVar.b, azgVar) || (l = hygVar.j) == null || l.longValue() != j) {
                    arrayList.add(obj);
                }
            }
        } while (!mjgVar.h(value, arrayList));
    }

    public final void c(azg azgVar, long j, int i) {
        mjg mjgVar;
        Object value;
        ArrayList arrayList;
        Long l;
        do {
            mjgVar = this.a;
            value = mjgVar.getValue();
            List<hyg> list = (List) value;
            arrayList = new ArrayList(yw3.W0(list, 10));
            for (hyg hygVarA : list) {
                if (cqk.d(hygVarA.b, azgVar) && (l = hygVarA.j) != null && l.longValue() == j) {
                    hygVarA = hyg.a(hygVarA, 0, null, i, 3071);
                }
                arrayList.add(hygVarA);
            }
        } while (!mjgVar.h(value, arrayList));
    }
}
