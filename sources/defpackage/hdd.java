package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hdd implements ddd, Serializable {
    public final List a;

    public hdd(List list) {
        this.a = list;
    }

    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((ddd) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hdd) {
            return this.a.equals(((hdd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
