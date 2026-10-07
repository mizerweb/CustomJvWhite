package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ulc {
    public final String a;
    public final List b;
    public final Object c;
    public final Object d;
    public final String e;
    public final int f;

    public ulc(String str, List list, Object obj, Object obj2, String str2, int i) {
        this.a = str;
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = str2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulc)) {
            return false;
        }
        ulc ulcVar = (ulc) obj;
        return cqk.d(this.a, ulcVar.a) && this.b.equals(ulcVar.b) && cqk.d(this.c, ulcVar.c) && cqk.d(this.d, ulcVar.d) && cqk.d(this.e, ulcVar.e) && this.f == ulcVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iC = qv1.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Object obj = this.c;
        int iHashCode = (iC + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str2 = this.e;
        return Integer.hashCode(this.f) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PagedSearchResult(query=" + this.a + ", items=" + this.b + ", resultsMarker=" + this.c + ", nextPageMarker=" + this.d + ", queryId=" + this.e + ", total=" + this.f + ")";
    }
}
