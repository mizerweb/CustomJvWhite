package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class yw3 extends xw3 {
    public static int W0(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList X0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cx3.Z0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
