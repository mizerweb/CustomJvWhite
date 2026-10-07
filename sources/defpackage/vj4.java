package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vj4 {
    public static final vj4 d = new vj4(null, null, null);
    public final List a;
    public final List b;
    public final List c;

    public vj4(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static vj4 a(vj4 vj4Var, List list, int i) {
        List list2 = vj4Var.b;
        List list3 = (i & 4) != 0 ? vj4Var.c : null;
        vj4Var.getClass();
        return new vj4(list, list2, list3);
    }

    public final boolean b() {
        List list = this.a;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            return false;
        }
        List list3 = this.c;
        return list3 == null || list3.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        return cqk.d(this.a, vj4Var.a) && cqk.d(this.b, vj4Var.b) && cqk.d(this.c, vj4Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactList(contacts=");
        sb.append(this.a);
        sb.append(", globalContacts=");
        sb.append(this.b);
        sb.append(", phonebook=");
        return qv1.n(")", sb, this.c);
    }
}
