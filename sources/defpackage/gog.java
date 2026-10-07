package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gog {
    public final List a;
    public final boolean b;

    public gog(int i, List list) {
        list = (i & 1) != 0 ? null : list;
        boolean z = (i & 2) == 0;
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gog)) {
            return false;
        }
        gog gogVar = (gog) obj;
        return cqk.d(this.a, gogVar.a) && this.b == gogVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(sets=" + this.a + ", loading=" + this.b + ")";
    }
}
