package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l48 {
    public static final l48 d;
    public final List a;
    public final List b;
    public final List c;

    static {
        r66 r66Var = r66.a;
        d = new l48(r66Var, r66Var, r66Var);
    }

    public l48(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l48)) {
            return false;
        }
        l48 l48Var = (l48) obj;
        return cqk.d(this.a, l48Var.a) && cqk.d(this.b, l48Var.b) && this.c.equals(l48Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv1.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        if (this == d) {
            return l48.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("IdleSearchData(recentContacts=");
        sb.append(ww3.z1(this.a, ",", "[", "]", new x27(6), 24));
        sb.append(", recentSearch=");
        sb.append(ww3.z1(this.b, ",", "[", "]", new x27(7), 24));
        sb.append(", allContacts=");
        return zo5.w(sb, ww3.z1(this.c, ",", "[", "]", new x27(8), 24), ")");
    }
}
