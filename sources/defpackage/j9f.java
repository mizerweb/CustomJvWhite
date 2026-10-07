package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j9f {
    public final List a;
    public final Object b;
    public final String c;
    public final int d;

    public j9f(int i, Object obj, String str, List list) {
        this.a = list;
        this.b = obj;
        this.c = str;
        this.d = i;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9f)) {
            return false;
        }
        j9f j9fVar = (j9f) obj;
        return cqk.d(this.a, j9fVar.a) && cqk.d(this.b, j9fVar.b) && cqk.d(this.c, j9fVar.c) && this.d == j9fVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SearchResultPage(items=" + this.a + ", marker=" + this.b + ", queryId=" + this.c + ", total=" + this.d + ")";
    }
}
