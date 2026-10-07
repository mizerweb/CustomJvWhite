package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z3g {
    public static final z3g c = new z3g(1, r66.a);
    public final int a;
    public final List b;

    public z3g(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3g)) {
            return false;
        }
        z3g z3gVar = (z3g) obj;
        return this.a == z3gVar.a && this.b.equals(z3gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (qt4.D(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ShowcaseState(state=");
        int i = this.a;
        if (i == 1) {
            str = "LOADING";
        } else if (i == 2) {
            str = "CONTENT";
        } else if (i != 3) {
            str = i != 4 ? "null" : "EMPTY_SEARCH";
        } else {
            str = "CONTENT_SEARCH";
        }
        sb.append(str);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
