package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p9f {
    public static final p9f c = new p9f(1, r66.a);
    public final int a;
    public final List b;

    public p9f(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9f)) {
            return false;
        }
        p9f p9fVar = (p9f) obj;
        return this.a == p9fVar.a && cqk.d(this.b, p9fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (qt4.D(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SearchState(state=");
        int i = this.a;
        if (i == 1) {
            str = "LOADING";
        } else if (i != 2) {
            str = i != 3 ? "null" : "EMPTY";
        } else {
            str = "CONTENT";
        }
        sb.append(str);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
