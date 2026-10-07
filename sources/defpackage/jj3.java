package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jj3 {
    public static final jj3 h = new jj3(ij3.c, "", l48.d, r66.a, true, false, false);
    public final ij3 a;
    public final String b;
    public final l48 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public jj3(ij3 ij3Var, String str, l48 l48Var, List list, boolean z, boolean z2, boolean z3) {
        this.a = ij3Var;
        this.b = str;
        this.c = l48Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static jj3 a(jj3 jj3Var, ij3 ij3Var, l48 l48Var, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            ij3Var = jj3Var.a;
        }
        ij3 ij3Var2 = ij3Var;
        String str = jj3Var.b;
        if ((i & 4) != 0) {
            l48Var = jj3Var.c;
        }
        l48 l48Var2 = l48Var;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = jj3Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = jj3Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = jj3Var.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = jj3Var.g;
        }
        jj3Var.getClass();
        return new jj3(ij3Var2, str, l48Var2, list2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj3)) {
            return false;
        }
        jj3 jj3Var = (jj3) obj;
        return this.a == jj3Var.a && this.b.equals(jj3Var.b) && cqk.d(this.c, jj3Var.c) && cqk.d(this.d, jj3Var.d) && this.e == jj3Var.e && this.f == jj3Var.f && this.g == jj3Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + nbh.n(nbh.n(qv1.c((this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        if (this == h) {
            return jj3.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("ChatsListSearchState(type=");
        sb.append(this.a);
        sb.append(", searchQuery='");
        sb.append(gxl.c(this.b));
        sb.append("', idleSearchData=");
        sb.append(this.c);
        sb.append(", searchResult=");
        sb.append(ww3.z1(this.d, ",", "[", "]", new w83(5), 24));
        sb.append(", scrollToTop=");
        sb.append(this.e);
        sb.append(", hasMoreMessages=");
        return qt4.r(sb, this.f, ")");
    }
}
