package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qbh {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(tbh tbhVar) {
        this.a.add(tbhVar);
    }

    public final List c(ArrayList arrayList) {
        t4h t4hVar;
        t4h t4hVar2;
        t4h t4hVar3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList<int[]> arrayList3 = new ArrayList();
        b(arrayList3, size2, new int[size2], 0);
        tbh[] tbhVarArr = new tbh[arrayList.size()];
        for (int[] iArr : arrayList3) {
            boolean z = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    tbh tbhVar = (tbh) arrayList2.get(i);
                    tbh tbhVar2 = (tbh) arrayList.get(iArr[i]);
                    tbhVar.getClass();
                    z &= tbhVar2.b.a <= tbhVar.b.a && tbhVar2.a == tbhVar.a && ((t4hVar = tbhVar.c) == (t4hVar2 = t4h.DEFAULT) || (t4hVar3 = tbhVar2.c) == t4hVar2 || t4hVar3 == t4hVar);
                    if (!z) {
                        break;
                    }
                    tbhVarArr[iArr[i]] = (tbh) arrayList2.get(i);
                }
            }
            if (z) {
                return Arrays.asList(tbhVarArr);
            }
        }
        return null;
    }
}
