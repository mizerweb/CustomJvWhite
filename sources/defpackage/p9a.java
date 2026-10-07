package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p9a {
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public p9a(List list, List list2, List list3, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9a)) {
            return false;
        }
        p9a p9aVar = (p9a) obj;
        return cqk.d(this.a, p9aVar.a) && cqk.d(this.b, p9aVar.b) && cqk.d(this.c, p9aVar.c) && this.d == p9aVar.d && this.e == p9aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(qv1.c(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(items=");
        sb.append(this.a);
        sb.append(", topActions=");
        sb.append(this.b);
        sb.append(", bottomAction=");
        sb.append(this.c);
        sb.append(", isSearch=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return qt4.r(sb, this.e, ")");
    }
}
