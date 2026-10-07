package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class gb7 implements eb7 {
    public final /* synthetic */ c a;

    public gb7(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.eb7
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.a;
        ArrayList arrayList3 = cVar.m;
        tl0 tl0Var = (tl0) qv1.f(1, cVar.d);
        cVar.h = tl0Var;
        Iterator it = tl0Var.a.iterator();
        while (it.hasNext()) {
            a aVar = ((nb7) it.next()).b;
            if (aVar != null) {
                aVar.m = true;
            }
        }
        boolean zU = cVar.U(arrayList, arrayList2, -1, 0);
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c.F((tl0) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    ore.m();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zU;
    }
}
