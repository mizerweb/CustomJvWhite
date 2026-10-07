package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class grl {
    public static final cbd a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new cbd(81920, 1048576, sparseIntArray, -1);
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fgg fggVar = (fgg) it.next();
            if (fggVar.b == 1 && fggVar.a == 2) {
                arrayList.add((dgg) fggVar);
            }
        }
        return arrayList;
    }

    public static xde c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size() / 2);
        ArrayList arrayList4 = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fgg fggVar = (fgg) it.next();
            int i = fggVar.a;
            int i2 = fggVar.b;
            if (i == 1) {
                if (i2 == 1) {
                    arrayList.add((zfg) fggVar);
                } else {
                    if (i2 != 2) {
                        ahc.f(fggVar, "unreachable: ");
                        return null;
                    }
                    arrayList2.add((agg) fggVar);
                }
            } else {
                if (i != 2) {
                    ahc.f(fggVar, "unreachable: ");
                    return null;
                }
                if (i2 == 1) {
                    arrayList3.add((dgg) fggVar);
                } else {
                    if (i2 != 2) {
                        ahc.f(fggVar, "unreachable: ");
                        return null;
                    }
                    arrayList4.add((egg) fggVar);
                }
            }
        }
        return new xde(arrayList, arrayList3, arrayList2, arrayList4, 8);
    }

    public static ArrayList d(List list, pk2 pk2Var) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fgg fggVar = (fgg) it.next();
            if (pk2Var.j.equals(fggVar.d)) {
                arrayList.add(fggVar);
            }
        }
        return arrayList;
    }
}
