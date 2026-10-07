package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g6h {
    public static final g6h i;
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    static {
        r66 r66Var = r66.a;
        i = new g6h(r66Var, r66Var, true, false, true, false, false);
    }

    public g6h(List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        boolean z6 = false;
        if (!z2 && (z4 || z5)) {
            z6 = true;
        }
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6h)) {
            return false;
        }
        g6h g6hVar = (g6h) obj;
        return this.a.equals(g6hVar.a) && cqk.d(this.b, g6hVar.b) && this.c == g6hVar.c && this.d == g6hVar.d && this.e == g6hVar.e && this.f == g6hVar.f && this.g == g6hVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + nbh.n(nbh.n(nbh.n(nbh.n(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StubDisplayState(collapsedItems=");
        sb.append(this.a);
        sb.append(", expandedItems=");
        sb.append(this.b);
        sb.append(", isConnected=");
        qt4.B(", showEmptyPlaceholder=", ", showExpandedItems=", sb, this.c, this.d);
        qt4.B(", selfFirst=", ", firstItemPartiallyVisible=", sb, this.e, this.f);
        return qt4.r(sb, this.g, ")");
    }
}
