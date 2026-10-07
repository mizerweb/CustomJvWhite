package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s2e {
    public final ArrayList a;

    public s2e(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public static String d(s2e s2eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = s2eVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((o2e) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean a(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((o2e) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final o2e b(Class cls) {
        for (o2e o2eVar : this.a) {
            if (o2eVar.getClass() == cls) {
                return o2eVar;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (o2e o2eVar : this.a) {
            if (cls.isAssignableFrom(o2eVar.getClass())) {
                arrayList.add(o2eVar);
            }
        }
        return arrayList;
    }
}
