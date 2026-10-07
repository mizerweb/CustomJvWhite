package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class b44 implements g44 {
    public final LinkedHashSet a;
    public final boolean b;
    public final Long c;

    public b44(LinkedHashSet linkedHashSet, boolean z, Long l) {
        this.a = linkedHashSet;
        this.b = z;
        this.c = l;
    }

    public static b44 a(b44 b44Var, LinkedHashSet linkedHashSet, int i) {
        return new b44(linkedHashSet, (i & 2) != 0 ? b44Var.b : false, b44Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b44)) {
            return false;
        }
        b44 b44Var = (b44) obj;
        return this.a.equals(b44Var.a) && this.b == b44Var.b && cqk.d(this.c, b44Var.c);
    }

    public final int hashCode() {
        int iN = nbh.n(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iN + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Result(items=" + this.a + ", hasMore=" + this.b + ", marker=" + this.c + ")";
    }
}
