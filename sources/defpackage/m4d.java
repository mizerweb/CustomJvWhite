package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class m4d {
    public final ArrayList a;

    public m4d(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        cx3.Z0(iterable, arrayList);
        this.a = arrayList;
    }

    public final ArrayList a() {
        return this.a;
    }

    public final m4j b(int i) {
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            return (m4j) arrayList.get(i);
        }
        return null;
    }

    public final int c() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m4d) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            ArrayList arrayList2 = ((m4d) obj).a;
            if (size == arrayList2.size()) {
                int size2 = arrayList.size();
                for (int i = 0; i < size2; i++) {
                    if (cqk.d(arrayList.get(i), arrayList2.get(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((m4j) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        return c0a.k(arrayList.size(), "Playlist size: ", ww3.z1(arrayList, ", ", " [", "]", new pyb(21), 24));
    }
}
