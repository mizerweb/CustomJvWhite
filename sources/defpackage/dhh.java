package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dhh {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public dhh(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dhh) {
            dhh dhhVar = (dhh) obj;
            String str = dhhVar.a;
            if (this.b == dhhVar.b && this.c.equals(dhhVar.c) && cqk.d(this.d, dhhVar.d)) {
                String str2 = this.a;
                return z5h.K0(str2, "index_", false) ? z5h.K0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + qv1.c((((z5h.K0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return s5h.w0(s5h.y0("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + qvl.e(this.c) + "\n            |   orders = {" + qvl.d(this.d) + "\n            |}\n        "));
    }
}
